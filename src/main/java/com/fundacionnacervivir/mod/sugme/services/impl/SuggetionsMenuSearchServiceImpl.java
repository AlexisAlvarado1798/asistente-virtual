package com.fundacionnacervivir.mod.sugme.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fundacionnacervivir.mod.core.dtos.SuggetionMenuDto;
import com.fundacionnacervivir.mod.core.entities.SuggetionsMenu;
import com.fundacionnacervivir.mod.core.repositories.SuggetionMenuRepositories;
import com.fundacionnacervivir.mod.sugme.queries.SuggetionMenuQuery;
import com.fundacionnacervivir.mod.sugme.services.SuggetionsMenuSearchServices;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SuggetionsMenuSearchServiceImpl implements SuggetionsMenuSearchServices {

  /**
   * The repository suggetions menu.
   */
  private final SuggetionMenuRepositories suggetionMenuRepositories;

  @Autowired
  public SuggetionsMenuSearchServiceImpl(final SuggetionMenuRepositories suggetionMenuRepositories) {
    this.suggetionMenuRepositories = suggetionMenuRepositories;
  }

  @Override
  public List<SuggetionMenuDto> getSuggetionsMenu() {
    final List<SuggetionsMenu> suggetionsMenuList = suggetionMenuRepositories.findAll();
    final List<SuggetionMenuDto> menuMain =
        suggetionsMenuList.stream().filter(o -> o.getSugIdMenu() == null).map(SuggetionMenuQuery::mapperEntityToDto)
            .collect(Collectors.toList());
    final List<SuggetionMenuDto> suggetionMenuDtos = new ArrayList<>();

    menuMain.stream().forEach(o -> {
      getMenus(o, suggetionsMenuList);
      suggetionMenuDtos.add(o);
    });

    return suggetionMenuDtos;
  }

  private void getMenus(final SuggetionMenuDto suggetionMenuDto, final List<SuggetionsMenu> menus) {
    final List<SuggetionMenuDto> menusChildren =
        menus.stream().filter(o -> o.getSugIdMenu() == suggetionMenuDto.getId())
            .map(SuggetionMenuQuery::mapperEntityToDto).collect(Collectors.toList());

    if (Boolean.FALSE.equals(menusChildren.isEmpty())) {
      menusChildren.stream().forEach(o -> {
        getMenus(o, menus);
      });
    }

    suggetionMenuDto.setItems(menusChildren.isEmpty() ? null : menusChildren);
  }
}
