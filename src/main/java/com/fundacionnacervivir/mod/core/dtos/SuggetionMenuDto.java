package com.fundacionnacervivir.mod.core.dtos;

import java.util.List;

public class SuggetionMenuDto extends NameDto {

  private String label;
  private Boolean isMenu;
  private String data;
  private NameDto type;
  private List<SuggetionMenuDto> items;

  public SuggetionMenuDto() {
  }

  public SuggetionMenuDto(final Long id, final String code, final String description) {
    super(id, code, description);
    this.label = description;
  }

  public void setIsMenu(final Boolean menu) {
    isMenu = menu;
  }

  public Boolean getIsMenu() {
    return isMenu;
  }

  public String getLabel() {
    return label;
  }

  public void setLabel(final String label) {
    this.label = label;
  }

  public List<SuggetionMenuDto> getItems() {
    return items;
  }

  public void setItems(final List<SuggetionMenuDto> items) {
    this.items = items;
  }

  public String getData() {
    return data;
  }

  public void setData(final String data) {
    this.data = data;
  }

  public NameDto getType() {
    return type;
  }

  public void setType(final NameDto type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return "SuggetionMenuDto{" + "label='" + label + '\'' + ", isMenu=" + isMenu + ", data='" + data + '\'' + ", type="
        + type + ", items=" + items + '}';
  }
}
