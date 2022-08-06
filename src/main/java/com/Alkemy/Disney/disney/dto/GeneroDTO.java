package com.Alkemy.Disney.disney.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class GeneroDTO {
    private Long id;
    private String nombre;
    private String imagen;

    /*

    @OneToMany(cascade = CascadeType.ALL)
    private List<PeliSerieEntity> peliserie = new ArrayList<>();*/

}
