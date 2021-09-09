package com.fundacionnacervivir.config;

import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fundacionnacervivir.mod.tiphuma.jobs.TipsHumanizationJob;

@Configuration
public class QuartzJobConfigure {

  @Bean
  public JobDetail jobDetail() {
    return JobBuilder.newJob(TipsHumanizationJob.class).withIdentity("sampleJobA").storeDurably().build();
  }

  /**
   * @param jobADetails
   * @return
   */
  @Bean
  public Trigger jobATrigger(JobDetail jobADetails) {
    return TriggerBuilder.newTrigger().forJob(jobADetails).withIdentity("TriggerA")
        .withSchedule(CronScheduleBuilder.cronSchedule("0 46 16 ? * 3 *")).build();
  }

}
