package com.Alkemy.Disney.disney.service;

import com.Alkemy.Disney.disney.dto.GeneroDTO;

import java.util.List;

public interface GeneroService {

    GeneroDTO save(GeneroDTO dto);

    List<GeneroDTO> getAllGeneros();

}
