package com.fundacionnacervivir.mod.tiphuma.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.fundacionnacervivir.mod.core.dtos.NameDto;
import com.fundacionnacervivir.mod.tiphuma.services.TipsHumanizationSearchServices;

import java.util.List;

@TipsController
public class TipsHumanizationSearchController {
  private final TipsHumanizationSearchServices tipsHumanizationSearchServices;

  @Autowired
  public TipsHumanizationSearchController(final TipsHumanizationSearchServices tipsHumanizationSearchServices) {
    this.tipsHumanizationSearchServices = tipsHumanizationSearchServices;
  }

  @GetMapping(path = "/search/tipshumanization")
  public List<NameDto> getTipsHumanization() {
    return tipsHumanizationSearchServices.getTipsHumanization();
  }
}
