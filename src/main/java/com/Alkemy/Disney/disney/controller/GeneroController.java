package com.Alkemy.Disney.disney.controller;


import com.Alkemy.Disney.disney.dto.GeneroDTO;
import com.Alkemy.Disney.disney.service.GeneroService;
import com.Alkemy.Disney.disney.service.implementacion.GeneroServiceImp;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("generos")
@RequiredArgsConstructor
public class GeneroController {

    @Autowired
    private GeneroService generoService;

    @GetMapping
    public ResponseEntity<List<GeneroDTO>> getAll(){
        List<GeneroDTO> generos = generoService.getAllGeneros();
        return ResponseEntity.ok().body(generos);
    }

    @PostMapping
    public ResponseEntity<GeneroDTO> save(@RequestBody GeneroDTO genero){
        GeneroDTO generoguardado = generoService.save(genero);
        return ResponseEntity.status(HttpStatus.CREATED).body(generoguardado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete (@PathVariable Long id) {
        this.generoService.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();

    }

}
