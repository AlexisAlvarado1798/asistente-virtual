package com.fundacionnacervivir.mod.tiphuma.services;

import com.fundacionnacervivir.mod.core.dtos.TipsHumanizationDto;

public interface TipsHumanizationServices {

  /**
   * Create the tips humanizations
   *
   * @param tipsHumanizationDto The dto.
   */
  void createTipHumanization(TipsHumanizationDto tipsHumanizationDto);
}

