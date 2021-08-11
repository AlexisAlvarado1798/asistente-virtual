package com.fundacionnacervivir.mod.users.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.fundacionnacervivir.mod.core.dtos.UserDto;
import com.fundacionnacervivir.mod.users.services.UserSearchServices;

import java.util.List;

@UserController//hereda las anotaciones
public class UserSearchController {

  private final UserSearchServices userSearchServices;

  @Autowired //cadena inyectable donde no se
  public UserSearchController(final UserSearchServices userSearchServices) {
    this.userSearchServices = userSearchServices;
  }

  @GetMapping(path = "/search/users")

    public List<UserDto> getUsers(){
      return userSearchServices.getUsers();
    }
}
