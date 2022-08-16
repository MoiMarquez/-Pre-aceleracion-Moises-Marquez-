package com.Alkemy.Disney.disney.service.implementacion;


import com.Alkemy.Disney.disney.dto.PeliSerieDTO;
import com.Alkemy.Disney.disney.entity.PeliSerieEntity;
import com.Alkemy.Disney.disney.mapper.PeliSerieMapper;
import com.Alkemy.Disney.disney.repository.PeliSerieRepository;
import com.Alkemy.Disney.disney.service.PeliSerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeliSerieServiceImp implements PeliSerieService {

    @Autowired
    public PeliSerieMapper peliSerieMapper;
    @Autowired
    private PeliSerieRepository peliSerieRepository;

    public PeliSerieDTO save(PeliSerieDTO dto){
        PeliSerieEntity entity = peliSerieMapper.peliSerieDTO2Entity(dto);
        PeliSerieEntity entitysave = peliSerieRepository.save(entity);
        PeliSerieDTO result = peliSerieMapper.peliSerieEntity2DTO(entitysave);
        return result;
    }


    public List<PeliSerieDTO> getAllPeliSeries() {
        List<PeliSerieEntity> entities = peliSerieRepository.findAll();
        List<PeliSerieDTO> result = peliSerieMapper.peliSerieEntityList2DTOList(entities);
        return result;
    }
}
