package com.fundacionnacervivir.mod.role.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.fundacionnacervivir.mod.core.dtos.NameDto;
import com.fundacionnacervivir.mod.role.services.RoleSearchServices;

import java.util.List;

@RoleController
public class RoleSearchController {
  private final RoleSearchServices roleSearchServices;

  @Autowired
  public RoleSearchController(final RoleSearchServices roleSearchServices) {
    this.roleSearchServices = roleSearchServices;
  }

  @GetMapping(path = "/search/roles")
  public List<NameDto> getRoles() {
    return roleSearchServices.getRoles();
  }
}
