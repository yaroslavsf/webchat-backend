package com.example.webchat.domain.preferences;

import com.example.webchat.core.generic.ExtendedServiceImpl;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PreferencesServiceImpl extends ExtendedServiceImpl<Preferences> implements PreferencesService {

  private final BCryptPasswordEncoder bCryptPasswordEncoder;

  @Autowired
  public PreferencesServiceImpl(PreferencesRepository repository, Logger logger,
                                BCryptPasswordEncoder bCryptPasswordEncoder) {
    super(repository, logger);
    this.bCryptPasswordEncoder = bCryptPasswordEncoder;
  }

  @Override
  public Preferences findByUser_Id(UUID string) {
    return ((PreferencesRepository)this.repository).findByUser_Id(string).orElseThrow();
  }
}
