package com.Alkemy.Disney.disney.service;

import com.Alkemy.Disney.disney.dto.PeliSerieDTO;

import java.util.List;

public interface PeliSerieService {
    PeliSerieDTO save(PeliSerieDTO dto);

    List<PeliSerieDTO> getAllPeliSeries();

    void delete(Long id);
}
