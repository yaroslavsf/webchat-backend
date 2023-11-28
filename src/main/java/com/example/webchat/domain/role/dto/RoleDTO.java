package com.example.webchat.domain.role.dto;

import com.example.webchat.core.generic.ExtendedDTO;
import com.example.webchat.domain.authority.dto.AuthorityDTO;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.Set;
import java.util.UUID;

public class RoleDTO extends ExtendedDTO {

  @NotNull
  @Size(min = 1, max = 255)
  private String name;

  @Valid
  private Set<AuthorityDTO> authorities;

  public RoleDTO() {
  }

  public RoleDTO(UUID id, String name, Set<AuthorityDTO> authorities) {
    super(id);
    this.name = name;
    this.authorities = authorities;
  }

  public String getName() {
    return name;
  }

  public RoleDTO setName(String name) {
    this.name = name;
    return this;
  }

  public Set<AuthorityDTO> getAuthorities() {
    return authorities;
  }

  public RoleDTO setAuthorities(Set<AuthorityDTO> authorities) {
    this.authorities = authorities;
    return this;
  }
}