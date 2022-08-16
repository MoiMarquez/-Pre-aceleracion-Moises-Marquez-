package com.Alkemy.Disney.disney.service;

import com.Alkemy.Disney.disney.dto.PersonajeDTO;

import java.util.List;

public interface PersonajeService {

    PersonajeDTO save(PersonajeDTO dto);

    List<PersonajeDTO> getAllPersonajes();
}
