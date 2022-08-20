package com.Alkemy.Disney.disney.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "peliserie")
@Getter
@Setter
@SQLDelete( sql = "UPDATE peliserie SET peliserie_activo = false WHERE id=?")
@Where(clause = "peliserie_activo=true")


public class PeliSerieEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String imagen;
    private String titulo;

    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private LocalDate fecha;

    private Float calificacion;

    @Column(name = "peliserie_activo")
    private boolean peliserieActivo = Boolean.TRUE;

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
