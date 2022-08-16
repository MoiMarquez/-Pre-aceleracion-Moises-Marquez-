package com.Alkemy.Disney.disney.controller;

import com.Alkemy.Disney.disney.dto.GeneroDTO;
import com.Alkemy.Disney.disney.dto.PeliSerieDTO;
import com.Alkemy.Disney.disney.service.GeneroService;
import com.Alkemy.Disney.disney.service.PeliSerieService;
import com.Alkemy.Disney.disney.service.implementacion.PeliSerieServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("peliseries")
public class PeliSerieController {

    @Autowired
    private PeliSerieService peliSerieService;

    @GetMapping
    public ResponseEntity<List<PeliSerieDTO>> getAll() {
        List<PeliSerieDTO> peliseries = peliSerieService.getAllPeliSeries();
        return ResponseEntity.ok().body(peliseries);
    }

    @PostMapping
    public ResponseEntity<PeliSerieDTO> save(@RequestBody PeliSerieDTO peliseries) {
        PeliSerieDTO peliserieGuardada = peliSerieService.save(peliseries);
        return ResponseEntity.status(HttpStatus.CREATED).body(peliserieGuardada);

    }
}
