package com.fundacionnacervivir.mod.socket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebSocketControllerJob {
  @GetMapping("/")
  public String test(){
    return "menu";
  }
}
