package com.fundacionnacervivir.mod.tiphuma.services;

import com.fundacionnacervivir.mod.core.dtos.NameDto;

import java.util.List;

public interface TipsHumanizationSearchServices {
  /**
   * @return
   */
  List<NameDto> getTipsHumanization();

  /**
   * @param code
   * @return
   */
  Boolean existTipsHumanizationByCode(String code);
}

