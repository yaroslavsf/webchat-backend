package com.example.webchat.domain.preferences;

import com.example.webchat.domain.preferences.dto.PreferencesDTO;
import com.example.webchat.domain.preferences.dto.PreferencesMapper;
import com.example.webchat.domain.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Validated
@RestController
@RequestMapping("/preferences")
public class PreferencesController {

  private final PreferencesService preferencesService;
  private final PreferencesMapper preferencesMapper;
  private final UserService userService;
  @Autowired
  public PreferencesController(PreferencesService preferencesService, PreferencesMapper preferencesMapper, UserService userService) {
    this.preferencesMapper = preferencesMapper;
    this.preferencesService = preferencesService;
    this.userService = userService;
  }

  @GetMapping("/user/{id}")
  public ResponseEntity<PreferencesDTO> retrieveByUserId(@PathVariable UUID id) {
    return new ResponseEntity<>(preferencesMapper.toDTO(preferencesService.findByUser_Id(id)), HttpStatus.OK);
  }

  @PostMapping("/user/{id}")
  public ResponseEntity<PreferencesDTO> createByUserId(@PathVariable UUID id, PreferencesDTO preferencesDTO) {
    Preferences preferences = preferencesService.save(preferencesMapper.fromDTO(preferencesDTO));
    userService.save( (userService.findById(id)).setPreferences(preferences) );
    return new ResponseEntity<>(preferencesMapper.toDTO(preferences), HttpStatus.OK);
  }
}
