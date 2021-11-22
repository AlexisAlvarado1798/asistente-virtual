package com.fundacionnacervivir.mod.core.utils;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.fundacionnacervivir.mod.core.services.JobFactoryServices;

@Component
public class RunJobs implements ApplicationRunner {
  private JobFactoryServices jobFactoryServices;

  public RunJobs(final JobFactoryServices jobFactoryServices) {
    this.jobFactoryServices = jobFactoryServices;
  }

  @Override
  public void run(final ApplicationArguments args) throws Exception {
    jobFactoryServices.findAllJobs();
  }
}