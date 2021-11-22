package com.fundacionnacervivir.mod.tiphuma.jobs;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;

import com.fundacionnacervivir.config.WebSocket;

public class TipsHumanizationJob implements Job {

  @Autowired
  WebSocket webSocket;

  /*
     public TipsHumanizationJob(final SimpMessagingTemplate template) {
       this.template = template;
     }


       @Autowired
       public TipsHumanizationJob(final SimpMessagingTemplate template) {
         this.template = template;
       }
      */
  @Override
  public void execute(final JobExecutionContext jobExecutionContext) throws JobExecutionException {
    // jobExecutionContext.getJobDetail().getKey().
    //TODO: Llamar al socket para lenvantar un mensaje.
    System.out.println("JobExecuter = TipsHumanizationJob");

    String mensaje = jobExecutionContext.getJobDetail().getDescription();
    System.out.println(mensaje);

    webSocket.onMessage(mensaje);

    //this.template.convertAndSend("/message", mensaje);
  }
}
