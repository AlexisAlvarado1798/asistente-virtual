package com.fundacionnacervivir.mod.core.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TYPES_MULTIMEDIA")
public class TypesMultimedia {
  private Long typId;
  private String typCode;
  private String typDescription;

  @Id
  @Column(name = "TYP_ID")
  public Long getTypId() {
    return typId;
  }

  public void setTypId(final Long typId) {
    this.typId = typId;
  }

  @Column(name = "TYP_CODE")
  public String getTypCode() {
    return typCode;
  }

  public void setTypCode(final String typCode) {
    this.typCode = typCode;
  }

  @Column(name = "TYP_DESCRIPTION")
  public String getTypDescription() {
    return typDescription;
  }

  public void setTypDescription(final String typDescription) {
    this.typDescription = typDescription;
  }
}
