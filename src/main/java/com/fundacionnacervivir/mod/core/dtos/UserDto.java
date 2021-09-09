package com.fundacionnacervivir.mod.core.dtos;

import java.util.Date;

public class UserDto {
  private Long id;// L mayuscula clase de null minuscula es cero DTO SOLO LO QUE QUIERO MOSTRAR
  private String userName;
  private String password;
  private Date createdDate;

  public UserDto(){
  }

  public UserDto(final Long id, final String userName, final String password) {
    this.id = id;
    this.userName = userName;
    this.password = password;
  }

  public Long getId() {
    return id;
  }

  public void setId(final Long id) {
    this.id = id;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(final String userName) {
    this.userName = userName;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(final String password) {
    this.password = password;
  }

  public Date getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(final Date createdDate) {
    this.createdDate = createdDate;
  }
}
