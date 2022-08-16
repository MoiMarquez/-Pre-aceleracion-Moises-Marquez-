package com.Alkemy.Disney.disney.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import java.time.LocalDate;


@Getter
@Setter

public class PeliSerieDTO {

    private Long id;
    private String imagen;
    private String titulo;

    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private LocalDate fecha;

    private Integer calificacion;

    @Column(name = "peliserie_activo")
    private boolean peliserieActivo;


}
