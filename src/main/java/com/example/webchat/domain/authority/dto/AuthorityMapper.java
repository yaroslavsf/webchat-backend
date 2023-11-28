package com.example.webchat.domain.authority.dto;

import com.example.webchat.core.generic.ExtendedMapper;
import com.example.webchat.domain.authority.Authority;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AuthorityMapper extends ExtendedMapper<Authority, AuthorityDTO> {

}

