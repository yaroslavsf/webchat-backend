package com.example.webchat.domain.preferences;

import com.example.webchat.core.generic.ExtendedService;
import java.util.UUID;

public interface PreferencesService extends ExtendedService<Preferences> {
    public Preferences findByUser_Id(UUID string);

}
