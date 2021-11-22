package com.fundacionnacervivir.mod.tiphuma.jobs;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

import com.fundacionnacervivir.config.WebSocket;
import com.fundacionnacervivir.mod.core.repositories.TipsHumanizationRepositories;

public class QuartzJobTips extends QuartzJobBean {

  @Autowired
  TipsHumanizationRepositories tipsHumanizationRepositories;
  @Autowired
  WebSocket webSocket = new WebSocket();

  @Override
  protected void executeInternal(final JobExecutionContext jobExecutionContext) throws JobExecutionException {
    String tip = jobExecutionContext.getJobDetail().getDescription();
    //String tip = "hola";
    System.out.println(tip);
    webSocket.onMessage(tip);
  }
}
