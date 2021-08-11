package com.fundacionnacervivir.mod.tiphuma.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.fundacionnacervivir.mod.core.dtos.TipsHumanizationDto;
import com.fundacionnacervivir.mod.tiphuma.services.TipsHumanizationServices;

@TipsController
public class TipsHumanizationController {

  /**
   * Tips humanization services.
   */
  private final TipsHumanizationServices tipsHumanizationServices;

  @Autowired
  public TipsHumanizationController(final TipsHumanizationServices tipsHumanizationServices) {
    this.tipsHumanizationServices = tipsHumanizationServices;
  }

  @PostMapping(path = "/tipsHumanization")
  @ResponseStatus(HttpStatus.CREATED)
  public void createTipHumanization(@RequestBody final TipsHumanizationDto tipsHumanizationDto) {
    tipsHumanizationServices.createTipHumanization(tipsHumanizationDto);
  }
}
