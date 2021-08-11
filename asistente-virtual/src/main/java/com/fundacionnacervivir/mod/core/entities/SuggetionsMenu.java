package com.fundacionnacervivir.mod.core.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "SUGGETIONS_MENU")
public class SuggetionsMenu implements Serializable {
  private Long sugId;
  private String sugCode;
  private String sugDescription;
  private Long sugIdMenu;
  private Boolean sugIsMenu;
  private String sugData;
  private Long typId;
  private SuggetionsMenu suggetionsMenuMain;
  private TypesMultimedia typesMultimedia;

  @Id
  @Column(name = "SUG_ID")
  public Long getSugId() {
    return sugId;
  }

  public void setSugId(final Long sugId) {
    this.sugId = sugId;
  }

  @Column(name = "SUG_CODE")
  public String getSugCode() {
    return sugCode;
  }

  public void setSugCode(final String sugCode) {
    this.sugCode = sugCode;
  }

  @Column(name = "SUG_DESCRIPTION")
  public String getSugDescription() {
    return sugDescription;
  }

  public void setSugDescription(final String sugDescription) {
    this.sugDescription = sugDescription;
  }

  @Column(name = "SUG_ID_MENU")
  public Long getSugIdMenu() {
    return sugIdMenu;
  }

  public void setSugIdMenu(final Long sugIdMenu) {
    this.sugIdMenu = sugIdMenu;
  }

  @Column(name = "SUG_IS_MENU")
  public Boolean getSugIsMenu() {
    return sugIsMenu;
  }

  public void setSugIsMenu(final Boolean sugIsMenu) {
    this.sugIsMenu = sugIsMenu;
  }

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "SUG_ID_MENU", updatable = false, insertable = false)
  public SuggetionsMenu getSuggetionsMenuMain() {
    return suggetionsMenuMain;
  }

  public void setSuggetionsMenuMain(final SuggetionsMenu suggetionsMenuMain) {
    this.suggetionsMenuMain = suggetionsMenuMain;
  }

  @Column(name = "SUG_DATA")
  public String getSugData() {
    return sugData;
  }

  public void setSugData(final String sugData) {
    this.sugData = sugData;
  }

  @Column(name = "TYP_ID")
  public Long getTypId() {
    return typId;
  }

  public void setTypId(final Long typId) {
    this.typId = typId;
  }

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "TYP_ID", updatable = false, insertable = false)
  public TypesMultimedia getTypesMultimedia() {
    return typesMultimedia;
  }

  public void setTypesMultimedia(final TypesMultimedia typesMultimedia) {
    this.typesMultimedia = typesMultimedia;
  }
}
