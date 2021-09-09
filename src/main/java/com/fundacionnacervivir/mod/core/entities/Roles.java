package com.fundacionnacervivir.mod.core.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "ROLES")
public class Roles implements Serializable {
  private Long rolId;
  private String rolCode;
  private String rolDescription;


  @Id
  @Column(name = "ROL_ID")
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "rol_id_seq")
  @SequenceGenerator(name = "rol_id_seq")
  public Long getRolId() {
    return rolId;
  }

  public void setRolId(final Long rolId) {
    this.rolId = rolId;
  }

  @Column(name = "ROL_CODE")
  public String getRolCode() {
    return rolCode;
  }

  public void setRolCode(final String rolCode) {
    this.rolCode = rolCode;
  }

  @Column(name = "ROL_DESCRIPTION")
  public String getRolDescription() {
    return rolDescription;
  }

  public void setRolDescription(final String rolDescription) {
    this.rolDescription = rolDescription;
  }
}
