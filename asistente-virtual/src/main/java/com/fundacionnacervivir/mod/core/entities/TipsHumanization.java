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
@Table(name = "TIPS_HUMANIZATION")
public class TipsHumanization implements Serializable {
  private Long tipsId;
  private String tipsCode;
  private String tipsDescription;
  private Boolean tipsActive;
  private String tipsCron;

  @Id
  @Column(name = "TIPS_ID")
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tips_id_seq")
  @SequenceGenerator(name = "tips_id_seq", allocationSize = 1)
  public Long getTipsId() {
    return tipsId;
  }

  public void setTipsId(final Long tipsId) {
    this.tipsId = tipsId;
  }

  @Column(name = "TIPS_CODE")
  public String getTipsCode() {
    return tipsCode;
  }

  public void setTipsCode(final String tipsCode) {
    this.tipsCode = tipsCode;
  }

  @Column(name = "TIPS_DESCRIPTION")
  public String getTipsDescription() {
    return tipsDescription;
  }

  public void setTipsDescription(final String tipsDescription) {
    this.tipsDescription = tipsDescription;
  }

  public Boolean getTipsActive() {
    return tipsActive;
  }

  public void setTipsActive(final Boolean tipsActive) {
    this.tipsActive = tipsActive;
  }

  @Column(name = "TIPS_CRON")
  public String getTipsCron() {
    return tipsCron;
  }

  public void setTipsCron(final String tipsCron) {
    this.tipsCron = tipsCron;
  }

  @Override
  public String toString() {
    return "TipsHumanization{" + "tipsId=" + tipsId + ", tipsCode='" + tipsCode + '\'' + ", tipsDescription='"
        + tipsDescription + '\'' + ", tipsActive=" + tipsActive + ", tipsCron='" + tipsCron + '\'' + '}';
  }
}
