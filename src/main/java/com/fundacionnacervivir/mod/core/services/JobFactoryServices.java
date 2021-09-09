package com.fundacionnacervivir.mod.core.services;

import org.quartz.SchedulerException;

public interface JobFactoryServices {

  /**
   * Create the Job, with code and cron
   *
   * @param code
   * @param cron
   * @throws SchedulerException
   */
  void createJob(String code, String cron) throws SchedulerException;

  void findAllJobs() throws SchedulerException;

  void statusJob(String code, Boolean statu) throws SchedulerException;
}
