package com.Alkemy.Disney.disney.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "personaje")
@Getter
@Setter
public class PersonajeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String imagen;
    private String nombre;
    private Integer edad;
    private String peso;
    private String historia;

    @Column(name = "personaje_activo")
    private boolean personajeActivo;

    @ManyToMany (
        cascade = {
                CascadeType.PERSIST,
                CascadeType.MERGE
        }
    )

    @JoinTable(
            name = "person_peli",
            joinColumns = @JoinColumn(name = "person_id"),
            inverseJoinColumns = @JoinColumn(name = "peliserie_id")
    )
    private Set<PeliSerieEntity> peliserie = new HashSet<>();


}
