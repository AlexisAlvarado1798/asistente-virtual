package com.fundacionnacervivir.mod.sugme.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.fundacionnacervivir.mod.core.dtos.SuggetionMenuDto;
import com.fundacionnacervivir.mod.sugme.services.SuggetionsMenuSearchServices;

import java.util.List;

@SuggetionsMenuController
public class SuggetionsMenuSearchController {

  /**
   * The suggetions menu search services.
   */
  private final SuggetionsMenuSearchServices suggetionsMenuSearchServices;

  @Autowired
  public SuggetionsMenuSearchController(final SuggetionsMenuSearchServices suggetionsMenuSearchServices) {
    this.suggetionsMenuSearchServices = suggetionsMenuSearchServices;
  }

  @GetMapping(path = "/search/suggetionsMenu")
  public List<SuggetionMenuDto> getSuggetionsMenu() {
    return suggetionsMenuSearchServices.getSuggetionsMenu();
  }
}
