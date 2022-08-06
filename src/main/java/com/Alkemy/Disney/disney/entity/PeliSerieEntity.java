package com.Alkemy.Disney.disney.entity;


import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "peliserie")
@Getter
@Setter
public class PeliSerieEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String imagen;
    private String titulo;

    @DateTimeFormat (pattern = "dd/MM/yyyy")
    private LocalDate fecha;

    private Integer calificacion;

    @Column(name = "peliserie_activo")
    private boolean peliserieActivo;

    /*
    @ManyToOne (fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "genero", insertable = false, nullable = false)
    private GeneroEntity generoEntity ;
    */

    @ManyToOne()
    @JoinColumn(name = "genero_id")
    //@Column(name = "genero_id", nullable = false)
    private GeneroEntity generoId;

    @ManyToMany(mappedBy = "peliserie", cascade = CascadeType.ALL)
    private List<PersonajeEntity> personaje = new ArrayList<>();



}
