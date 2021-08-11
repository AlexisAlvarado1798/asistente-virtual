package com.fundacionnacervivir.mod.tiphuma.jobs;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class TipsHumanizationJob implements Job {

  @Override
  public void execute(final JobExecutionContext jobExecutionContext) throws JobExecutionException {
    // jobExecutionContext.getJobDetail().getKey().
    //TODO: Llamar al socket para lenvantar un mensaje.
    System.out.println("JobExecuter = TipsHumanizationJob");
  }
}
