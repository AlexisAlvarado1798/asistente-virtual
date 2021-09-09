package com.fundacionnacervivir.mod.core.services.impl;

import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDataMap;
import org.quartz.JobDetail;
import org.quartz.JobKey;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.stereotype.Service;

import com.fundacionnacervivir.mod.core.entities.TipsHumanization;
import com.fundacionnacervivir.mod.core.repositories.TipsHumanizationRepositories;
import com.fundacionnacervivir.mod.core.services.JobFactoryServices;
import com.fundacionnacervivir.mod.tiphuma.jobs.TipsHumanizationJob;

import java.util.List;

@Service
public class JobFactoryServicesImpl implements JobFactoryServices {
  TipsHumanizationRepositories tipsHumanizationRepositories;

  public JobFactoryServicesImpl(final TipsHumanizationRepositories tipsHumanizationRepositories) {
    // Nothing for to do.
    this.tipsHumanizationRepositories = tipsHumanizationRepositories;
  }

  @Override
  public void createJob(final String code, final String cron) throws SchedulerException {
    final JobDetail job = JobBuilder.newJob(TipsHumanizationJob.class).withIdentity(code).build();
    final Trigger trigger =
        TriggerBuilder.newTrigger().forJob(job).withIdentity(code).withSchedule(CronScheduleBuilder.cronSchedule(cron))
            .build();
    final SchedulerFactory schedulerFactory = new StdSchedulerFactory();
    final Scheduler sch = schedulerFactory.getScheduler();
    sch.scheduleJob(job, trigger);
    sch.start();
  }

  @Override
  public void findAllJobs() throws SchedulerException {
    List<TipsHumanization> jobsData = tipsHumanizationRepositories.findAll();
    System.out.println("Todos los JOBS SON: " + jobsData.size());

    Scheduler scheduler = new StdSchedulerFactory().getScheduler();
    scheduler.start();

    for (TipsHumanization tipsJob : jobsData) {
      JobDetail job = JobBuilder.newJob(TipsHumanizationJob.class).withIdentity(tipsJob.getTipsCode()).build();

      Trigger trigger = TriggerBuilder.newTrigger().forJob(job).withIdentity(tipsJob.getTipsCode())
          .withSchedule(CronScheduleBuilder.cronSchedule(tipsJob.getTipsCron())).build();

      final SchedulerFactory schedulerFactory = new StdSchedulerFactory();
      final Scheduler sch = schedulerFactory.getScheduler();
      sch.scheduleJob(job, trigger);
      sch.start();
      if (!tipsJob.getTipsActive()) {
        System.out.println("JOB INACTIVO");
        scheduler.pauseJob(new JobKey(tipsJob.getTipsCode()));
        continue;
      }
    }

  }

  @Override
  public void statusJob(final String code, final Boolean state) throws SchedulerException {

  }

}
