package com.example.webchat.domain.preferences.dto;

import com.example.webchat.core.generic.ExtendedMapper;
import com.example.webchat.domain.preferences.Preferences;
import com.example.webchat.domain.user.User;
import com.example.webchat.domain.user.dto.UserRegisterDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PreferencesMapper {
    Preferences fromDTO(PreferencesDTO dto);
    PreferencesDTO toDTO(Preferences preferences);
}
