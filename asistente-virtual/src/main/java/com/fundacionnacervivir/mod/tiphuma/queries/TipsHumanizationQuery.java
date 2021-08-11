package com.fundacionnacervivir.mod.tiphuma.queries;

import org.springframework.data.jpa.domain.Specification;

import com.fundacionnacervivir.mod.core.dtos.TipsHumanizationDto;
import com.fundacionnacervivir.mod.core.entities.TipsHumanization;
import com.fundacionnacervivir.mod.core.entities.TipsHumanization_;

public class TipsHumanizationQuery {

  public static TipsHumanizationDto mapperEntityToDto(final TipsHumanization tipsHumanization) {
    final TipsHumanizationDto nameDto = new TipsHumanizationDto();
    nameDto.setId(tipsHumanization.getTipsId());
    nameDto.setCode(tipsHumanization.getTipsCode());
    nameDto.setDescription(tipsHumanization.getTipsDescription());
    nameDto.setActive(tipsHumanization.getTipsActive());
    nameDto.setConExpressionDate(tipsHumanization.getTipsCron());
    return nameDto;
  }

  public static TipsHumanization mapperDtoToEntity(final TipsHumanizationDto tipsHumanizationDto) {
    final TipsHumanization entity = new TipsHumanization();
    entity.setTipsId(tipsHumanizationDto.getId());
    entity.setTipsCode(tipsHumanizationDto.getCode());
    entity.setTipsDescription(tipsHumanizationDto.getDescription());
    entity.setTipsActive(tipsHumanizationDto.getActive() == null ? Boolean.TRUE : tipsHumanizationDto.getActive());
    entity.setTipsCron(tipsHumanizationDto.getConExpressionDate());

    return entity;
  }

  public static Specification<TipsHumanization> searchByCode(final String code) {
    return ((root, cq, cb) -> cb
        .and(cb.equal(root.get(TipsHumanization_.tipsCode), code), cb.isTrue(root.get(TipsHumanization_.tipsActive))));
  }
}
