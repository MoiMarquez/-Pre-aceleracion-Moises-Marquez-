package com.Alkemy.Disney.disney.mapper;

import com.Alkemy.Disney.disney.dto.PeliSerieDTO;
import com.Alkemy.Disney.disney.entity.PeliSerieEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PeliSerieMapper {

    public PeliSerieEntity peliSerieDTO2Entity(PeliSerieDTO dto){
        PeliSerieEntity peliSerieEntity = new PeliSerieEntity();
        peliSerieEntity.setImagen(dto.getImagen());
        peliSerieEntity.setTitulo(dto.getTitulo());
        peliSerieEntity.setFecha(dto.getFecha());
        peliSerieEntity.setCalificacion(dto.getCalificacion());
        return peliSerieEntity;
    }

    public PeliSerieDTO peliSerieEntity2DTO(PeliSerieEntity entity){
        PeliSerieDTO dto = new PeliSerieDTO();
        dto.setId(entity.getId());
        dto.setImagen(entity.getImagen());
        dto.setTitulo(entity.getTitulo());
        dto.setFecha(entity.getFecha());
        dto.setCalificacion(entity.getCalificacion());
        return dto;
    }

    public List<PeliSerieDTO> peliSerieEntityList2DTOList(List<PeliSerieEntity> entities){
        List<PeliSerieDTO> dtos = new ArrayList<>();
        for (PeliSerieEntity entity : entities){
            dtos.add(peliSerieEntity2DTO(entity));
        }
        return dtos;
    }


}
