package com.fundacionnacervivir.mod.core.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(TipsHumanization.class)
public class TipsHumanization_ implements Serializable {
  public static volatile SingularAttribute<TipsHumanization, Long>  tipsId;
  public static volatile SingularAttribute<TipsHumanization, String> tipsCode;
  public static volatile SingularAttribute<TipsHumanization, String> tipsDescription;
  public static volatile SingularAttribute<TipsHumanization, Boolean> tipsActive;
  public static volatile SingularAttribute<TipsHumanization, String> tipsCon;
}
