/*
package com.fundacionnacervivir.config;

import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fundacionnacervivir.mod.core.entities.TipsHumanization;
import com.fundacionnacervivir.mod.core.repositories.TipsHumanizationRepositories;
import com.fundacionnacervivir.mod.tiphuma.jobs.QuartzJobTips;

import java.util.List;

@Configuration
public class QuartzJobConfigure {
  TipsHumanizationRepositories tipsHumanizationRepositories;

  public QuartzJobConfigure(final TipsHumanizationRepositories tipsHumanizationRepositories) {
    this.tipsHumanizationRepositories = tipsHumanizationRepositories;
  }

  @Bean
  public JobDetail jobDetail() {
    List<TipsHumanization> jobsData = tipsHumanizationRepositories.findAll();
    System.out.println("Todos los JOBS SON: " + jobsData.size());

    for (TipsHumanization tipsJob : jobsData) {
      JobBuilder.newJob(QuartzJobTips.class).withIdentity(tipsJob.getTipsCode())
          .withDescription(tipsJob.getTipsDescription()).storeDurably().build();

    }
    return null;
  }

  /**
   * @param jobADetails
   * @return
   */
/*
  @Bean
  public Trigger jobATrigger(JobDetail jobADetails) {
    List<TipsHumanization> jobsData = tipsHumanizationRepositories.findAll();
    System.out.println("Todos los JOBS SON: " + jobsData.size());

    for (TipsHumanization tipsJob : jobsData) {
      TriggerBuilder.newTrigger().forJob(jobADetails).withIdentity(tipsJob.getTipsCode())
          .withSchedule(CronScheduleBuilder.cronSchedule(tipsJob.getTipsCron())).build();
    }
    return null;
  }



}

   */

