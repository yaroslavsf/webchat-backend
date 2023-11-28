package com.example.webchat.domain.user.dto;

import com.example.webchat.core.generic.ExtendedMapper;
import com.example.webchat.domain.user.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper extends ExtendedMapper<User, UserDTO> {

  User fromUserRegisterDTO(UserRegisterDTO dto);
}
