package com.fundacionnacervivir.mod.core.entities;

import java.util.Date;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Users.class)
public class Users_ {
  public static volatile SingularAttribute<Users, Long> userId;
  public static volatile SingularAttribute<Users, String> userUsername;
  public static volatile SingularAttribute<Users, String> userPassword;
  public static volatile SingularAttribute<Users, Date> userCreatedDate;
  public static volatile SingularAttribute<Users, Date> userDeletedDate;

}
