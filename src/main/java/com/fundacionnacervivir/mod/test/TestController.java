package com.fundacionnacervivir.mod.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
  @GetMapping("/getName")
  public String getName(@RequestParam(name = "name") final String name,
      @RequestParam(name = "lastName") final String lastName) {
    return "Hola mundo" + name +" "+ lastName;
  }
}
