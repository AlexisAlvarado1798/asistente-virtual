package com.fundacionnacervivir.mod.core.dtos;

public class NameDto {
  private Long id;
  private String code;
  private String description;

  public NameDto() {
  }

  public NameDto(final Long id, final String description) {
    this.id = id;
    this.description = description;
  }

  public NameDto(final Long id, final String code, final String description) {
    this.id = id;
    this.code = code;
    this.description = description;
  }

  public Long getId() {
    return id;
  }

  public void setId(final Long id) {
    this.id = id;
  }

  public String getCode() {
    return code;
  }

  public void setCode(final String code) {
    this.code = code;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(final String description) {
    this.description = description;
  }

  @Override
  public String toString() {
    return "NameDto{" + "id=" + id + ", code='" + code + '\'' + ", description='" + description + '\'' + '}';
  }
}
