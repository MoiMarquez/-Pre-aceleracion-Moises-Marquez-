package com.Alkemy.Disney.disney.controller;


import com.Alkemy.Disney.disney.dto.PersonajeDTO;
import com.Alkemy.Disney.disney.service.PersonajeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("personajes")
@RequiredArgsConstructor
public class PersonajeController {

    @Autowired
    private PersonajeService personajeService;

    @GetMapping
    public ResponseEntity<List<PersonajeDTO>> getAll() {
        List<PersonajeDTO> pesonajes = personajeService.getAllPersonajes();
        return ResponseEntity.ok().body(pesonajes);
    }

    @PostMapping
    public ResponseEntity<PersonajeDTO> save(@RequestBody PersonajeDTO personajes) {
        PersonajeDTO personajeguardado = personajeService.save(personajes);
        return ResponseEntity.status(HttpStatus.CREATED).body(personajeguardado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete (@PathVariable Long id) {
        this.personajeService.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();

    }

}
