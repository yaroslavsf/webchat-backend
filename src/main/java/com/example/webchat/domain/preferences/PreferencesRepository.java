package com.example.webchat.domain.preferences;

import com.example.webchat.core.generic.ExtendedRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface PreferencesRepository extends ExtendedRepository<Preferences> {
    Optional<Preferences> findByUser_Id(UUID id);
}
