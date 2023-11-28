package com.example.webchat.domain.preferences.dto;

import com.example.webchat.core.generic.ExtendedDTO;
import jakarta.validation.constraints.NotNull;

public class PreferencesDTO {

  @NotNull
  private String general_type;
  @NotNull
  private String general_industry;
  @NotNull
  private String general_design;
  @NotNull
  private String tech_framework;
  @NotNull
  private String tech_css;

  public PreferencesDTO() {
  }

  public String getGeneral_type() {
    return general_type;
  }

  public void setGeneral_type(String general_type) {
    this.general_type = general_type;
  }

  public String getGeneral_industry() {
    return general_industry;
  }

  public void setGeneral_industry(String general_industry) {
    this.general_industry = general_industry;
  }

  public String getGeneral_design() {
    return general_design;
  }

  public void setGeneral_design(String general_design) {
    this.general_design = general_design;
  }

  public String getTech_framework() {
    return tech_framework;
  }

  public void setTech_framework(String tech_framework) {
    this.tech_framework = tech_framework;
  }

  public String getTech_css() {
    return tech_css;
  }

  public void setTech_css(String tech_css) {
    this.tech_css = tech_css;
  }
}