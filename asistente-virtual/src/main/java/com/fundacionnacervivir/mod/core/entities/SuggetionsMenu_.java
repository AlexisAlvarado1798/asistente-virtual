package com.fundacionnacervivir.mod.core.entities;

import java.io.Serializable;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(SuggetionsMenu.class)
public class SuggetionsMenu_ implements Serializable {
  public static volatile SingularAttribute<SuggetionsMenu, Long> sugId;
  public static volatile SingularAttribute<SuggetionsMenu, String> sugCode;
  public static volatile SingularAttribute<SuggetionsMenu, String> sugDescription;
  public static volatile SingularAttribute<SuggetionsMenu, Long> sugIdMenu;
  public static volatile SingularAttribute<SuggetionsMenu, Long> sugIsMenu;
  public static volatile SingularAttribute<SuggetionsMenu, String> sugData;
  public static volatile SingularAttribute<SuggetionsMenu, Long> typId;
  public static volatile SingularAttribute<SuggetionsMenu, SuggetionsMenu> suggetionsMenuMain;
  public static volatile SingularAttribute<SuggetionsMenu, TypesMultimedia> typesMultimedia;
}
