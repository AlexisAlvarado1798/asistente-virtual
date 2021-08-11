package com.fundacionnacervivir.mod.sugme.queries;

import org.springframework.data.jpa.domain.Specification;

import com.fundacionnacervivir.mod.core.dtos.NameDto;
import com.fundacionnacervivir.mod.core.dtos.SuggetionMenuDto;
import com.fundacionnacervivir.mod.core.entities.SuggetionsMenu;

public class SuggetionMenuQuery {

  public static Specification<SuggetionsMenu> searchSuggetionsMenuMain() {
    return null;
  }

  public static SuggetionMenuDto mapperEntityToDto(final SuggetionsMenu suggetionsMenu) {
    try {
      final SuggetionMenuDto suggetionsMenuDto =
          new SuggetionMenuDto(suggetionsMenu.getSugId(), suggetionsMenu.getSugCode(),
              suggetionsMenu.getSugDescription());
      suggetionsMenuDto.setIsMenu(suggetionsMenu.getSugIsMenu());
      suggetionsMenuDto.setData(suggetionsMenu.getSugData());
      if (suggetionsMenu.getTypId() != null) {
        suggetionsMenuDto
            .setType(new NameDto(suggetionsMenu.getTypId(), suggetionsMenu.getTypesMultimedia().getTypDescription()));
      }
      return suggetionsMenuDto;
    } catch (Exception e) {
      System.out.println(e);
      return null;
    }

  }
}
