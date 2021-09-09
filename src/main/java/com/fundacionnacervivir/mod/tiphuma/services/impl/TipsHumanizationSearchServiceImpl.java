package com.fundacionnacervivir.mod.tiphuma.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fundacionnacervivir.mod.core.dtos.NameDto;
import com.fundacionnacervivir.mod.core.entities.TipsHumanization;
import com.fundacionnacervivir.mod.core.repositories.TipsHumanizationRepositories;
import com.fundacionnacervivir.mod.tiphuma.queries.TipsHumanizationQuery;
import com.fundacionnacervivir.mod.tiphuma.services.TipsHumanizationSearchServices;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TipsHumanizationSearchServiceImpl implements TipsHumanizationSearchServices {
  private final TipsHumanizationRepositories tipsHumanizationRepositories;

  @Autowired
  public TipsHumanizationSearchServiceImpl(final TipsHumanizationRepositories tipsHumanizationRepositories) {
    this.tipsHumanizationRepositories = tipsHumanizationRepositories;
  }

  @Override
  public List<NameDto> getTipsHumanization() {
    final List<TipsHumanization> tipsHumanizationList = tipsHumanizationRepositories.findAll();
    return tipsHumanizationList.stream().map(TipsHumanizationQuery::mapperEntityToDto).collect(Collectors.toList());
  }

  @Override
  public Boolean existTipsHumanizationByCode(final String code) {
    return tipsHumanizationRepositories.count(TipsHumanizationQuery.searchByCode(code)) > 0;
  }
}
