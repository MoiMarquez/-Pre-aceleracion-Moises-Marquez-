package com.Alkemy.Disney.disney.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "genero")
@Getter
@Setter

public class GeneroEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nombre;
    private String imagen;

    @Column(name = "gen_activo")
    private boolean genActivo;

    @OneToMany(cascade = CascadeType.ALL)
    private List<PeliSerieEntity> peliserie = new ArrayList<>();

/*
    @OneToMany (fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "peliserie_id", insertable = false, nullable = false)
    private PeliSerieEntity peliSerie;
   */

    @Column(name = "peliserie_id", nullable = false)
    private long peliserieId;

        }

