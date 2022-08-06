package com.Alkemy.Disney.disney.service.implementacion;

import com.Alkemy.Disney.disney.dto.GeneroDTO;
import com.Alkemy.Disney.disney.entity.GeneroEntity;
import com.Alkemy.Disney.disney.mapper.GeneroMapper;
import com.Alkemy.Disney.disney.repository.GeneroRepository;
import com.Alkemy.Disney.disney.service.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeneroServiceImp implements GeneroService {

    @Autowired
    private GeneroMapper generoMapper;
    @Autowired
    private GeneroRepository generoRepository;

    public GeneroDTO save(GeneroDTO dto){
        GeneroEntity entity = generoMapper.generoDTO2Entity(dto);
        GeneroEntity entitySaved = generoRepository.save(entity);
        GeneroDTO resultado = generoMapper.generoEntity2DTO(entitySaved);
        System.out.println("Guardar Genero");
        return dto;
    }

    public List<GeneroDTO> getAllGeneros() {
        List<GeneroEntity> entities = generoRepository.findAll();
        List<GeneroDTO> result = generoMapper.generoEntityList2DTOList(entities);
        return result;
    }

}
