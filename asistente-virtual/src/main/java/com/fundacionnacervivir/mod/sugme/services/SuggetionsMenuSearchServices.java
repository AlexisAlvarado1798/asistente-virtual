package com.fundacionnacervivir.mod.sugme.services;

import com.fundacionnacervivir.mod.core.dtos.SuggetionMenuDto;

import java.util.List;

public interface SuggetionsMenuSearchServices {
  /**
   * Search all suggetions menu.
   *
   * @return The dto.
   */
  List<SuggetionMenuDto> getSuggetionsMenu();
}
