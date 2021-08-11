package com.fundacionnacervivir.mod.core.dtos;

public class TipsHumanizationDto extends NameDto {
  private Boolean active;
  private String conExpressionDate;

  public TipsHumanizationDto(){
  }

  public TipsHumanizationDto(final Long id, final String code, final String description){
    super(id, code, description);
  }

  public Boolean getActive() {
    return active;
  }

  public void setActive(final Boolean active) {
    this.active = active;
  }

  public String getConExpressionDate() {
    return conExpressionDate;
  }

  public void setConExpressionDate(final String conExpressionDate) {
    this.conExpressionDate = conExpressionDate;
  }

  @Override
  public String toString() {
    return "TipsHumanizationDto{" + "active=" + active + ", conExpressionDate='" + conExpressionDate + '\'' + '}';
  }
}
