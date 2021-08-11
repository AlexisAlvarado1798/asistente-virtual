package com.fundacionnacervivir.mod.core.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Roles.class)
public class Roles_ implements Serializable {
  public static volatile SingularAttribute<Roles, Long>  rolId;
  public static volatile SingularAttribute<Roles, String>  rolCode;
  public static volatile SingularAttribute<Roles, String> rolDescription;

}
