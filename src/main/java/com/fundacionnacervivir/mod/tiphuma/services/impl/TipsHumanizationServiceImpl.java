package com.fundacionnacervivir.mod.tiphuma.services.impl;

import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import com.fundacionnacervivir.mod.core.dtos.TipsHumanizationDto;
import com.fundacionnacervivir.mod.core.repositories.TipsHumanizationRepositories;
import com.fundacionnacervivir.mod.core.services.JobFactoryServices;
import com.fundacionnacervivir.mod.tiphuma.jobs.TipsHumanizationJob;
import com.fundacionnacervivir.mod.tiphuma.queries.TipsHumanizationQuery;
import com.fundacionnacervivir.mod.tiphuma.services.TipsHumanizationSearchServices;
import com.fundacionnacervivir.mod.tiphuma.services.TipsHumanizationServices;

import javax.transaction.Transactional;

@Service
public class TipsHumanizationServiceImpl implements TipsHumanizationServices {

  /**
   * The tips humanization repositories
   */
  private final TipsHumanizationRepositories tipsHumanizationRepositories;

  /**
   * The tips humanization search services.
   */
  private final TipsHumanizationSearchServices tipsHumanizationSearchServices;

  /**
   * The job factory services.
   */
  private final JobFactoryServices jobFactoryServices;

  @Autowired
  public TipsHumanizationServiceImpl(final TipsHumanizationRepositories tipsHumanizationRepositories,
      final TipsHumanizationSearchServices tipsHumanizationSearchServices, final JobFactoryServices jobFactoryServices) {
    this.tipsHumanizationRepositories = tipsHumanizationRepositories;
    this.tipsHumanizationSearchServices = tipsHumanizationSearchServices;
    this.jobFactoryServices = jobFactoryServices;
  }

  @Override
  @Transactional
  public void createTipHumanization(final TipsHumanizationDto tipsHumanizationDto) throws SchedulerException {
    // Validar los campos obligatorios
    valid(tipsHumanizationDto);
    // Validar que no exista ya ese tips... codigo. consultar por codigo hacer un count
    if (tipsHumanizationSearchServices.existTipsHumanizationByCode(tipsHumanizationDto.getCode())) {
      throw new HttpClientErrorException(HttpStatus.BAD_GATEWAY, "Ya existe un registro con el mismo codigo");
    }
    // Crea el Job.
    jobFactoryServices.createJob(tipsHumanizationDto.getCode(), tipsHumanizationDto.getConExpressionDate());

    //jobFactoryServices.findAllJobs();

    // mapper de dto a entity
    tipsHumanizationRepositories.save(TipsHumanizationQuery.mapperDtoToEntity(tipsHumanizationDto));
  }

  private static void valid(final TipsHumanizationDto tipsHumanizationDto) {
    if (tipsHumanizationDto.getCode() == null || tipsHumanizationDto.getConExpressionDate() == null) {
      throw new HttpClientErrorException(HttpStatus.BAD_GATEWAY, "Campo obligatorio.");
    }
  }
}
