package com.fundacionnacervivir.mod.core.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "USERS")

public class Users implements Serializable {
  private Long userId;
  private String userUsername;
  private String userPassword;
  private Date userCreatedDate;
  private Date userDeletedDate;

  @Id
  @Column(name = "USER_ID")
  public Long getUserId() {
    return userId;
  }

  public void setUserId(final Long userId) {
    this.userId = userId;
  }


  @Column(name = "USER_USERNAME")
  public String getUserUsername() {
    return userUsername;
  }

  public void setUserUsername(final String userUsername) {
    this.userUsername = userUsername;
  }

  @Column(name = "USER_PASSWORD")
  public String getUserPassword() {
    return userPassword;
  }

  public void setUserPassword(final String userPassword) {
    this.userPassword = userPassword;
  }

  @Column(name = "USER_CREATED_DATE")
  @Temporal(TemporalType.DATE)
  public Date getUserCreatedDate() {
    return userCreatedDate;
  }

  public void setUserCreatedDate(final Date userCreatedDate) {
    this.userCreatedDate = userCreatedDate;
  }

  @Column(name = "USER_DELETED_DATE")
  @Temporal(TemporalType.DATE)
  public Date getUserDeletedDate() {
    return userDeletedDate;
  }

  public void setUserDeletedDate(final Date userDeletedDate) {
    this.userDeletedDate = userDeletedDate;
  }
}
