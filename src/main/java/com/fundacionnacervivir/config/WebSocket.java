package com.fundacionnacervivir.config;

import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedDeque;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@Component
@ServerEndpoint("/websocket")
public class WebSocket {
  private Session session;

  private static ConcurrentLinkedDeque<WebSocket> webSocketConcurrentLinkedDeque = new ConcurrentLinkedDeque<>();

  @OnOpen
  public void onOpen(Session session){
    this.session = session;
    webSocketConcurrentLinkedDeque.add(this);
    System.out.println("[webSocket Succesful connection ] the current number of connection is: "+ webSocketConcurrentLinkedDeque.size());
  }

  @OnClose
  public void onClose(){
    Iterator<WebSocket> iterator = webSocketConcurrentLinkedDeque.iterator();
    while(iterator.hasNext()){
      WebSocket next = iterator.next();
      if(next == this){
        webSocketConcurrentLinkedDeque.remove(next);
      }
    }
  }

  @OnError
  public void onError(Session session, Throwable throwable){
    System.out.println("Error");
    throwable.printStackTrace();
  }

  @OnMessage
  public void onMessage(String message){
    Iterator<WebSocket> iterator = webSocketConcurrentLinkedDeque.iterator();
    while(iterator.hasNext()){
      WebSocket next = iterator.next();
      try{
        next.session.getBasicRemote().sendText(message);
      }catch (IOException e){
        e.printStackTrace();
      }
    }
  }
}
