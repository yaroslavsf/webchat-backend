package com.example.webchat.domain.authority.dto;

import com.example.webchat.core.generic.ExtendedDTO;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.UUID;

public class AuthorityDTO extends ExtendedDTO {

  @NotNull
  @Size(min = 1, max = 255)
  private String name;

  public AuthorityDTO() {
  }

  public AuthorityDTO(UUID id, String name) {
    super(id);
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public AuthorityDTO setName(String name) {
    this.name = name;
    return this;
  }

}
