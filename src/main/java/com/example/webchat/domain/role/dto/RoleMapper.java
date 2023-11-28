package com.example.webchat.domain.role.dto;

import com.example.webchat.core.generic.ExtendedMapper;
import com.example.webchat.domain.role.Role;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface RoleMapper extends ExtendedMapper<Role, RoleDTO> {

}
