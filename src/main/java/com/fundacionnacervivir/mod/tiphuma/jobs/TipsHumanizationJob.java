package com.fundacionnacervivir.mod.tiphuma.jobs;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import com.fundacionnacervivir.mod.socket.controller.WebSocketController;

public class TipsHumanizationJob implements Job {
  private WebSocketController webSocketController;

  @Override
  public void execute(final JobExecutionContext jobExecutionContext) throws JobExecutionException {
    // jobExecutionContext.getJobDetail().getKey().
    //TODO: Llamar al socket para lenvantar un mensaje.
    System.out.println("JobExecuter = TipsHumanizationJob");

    //webSocketController.sendMessage("Hola Mundo");

    String mensaje = jobExecutionContext.getJobDetail().getDescription();
    System.out.println(mensaje);




  }
}
