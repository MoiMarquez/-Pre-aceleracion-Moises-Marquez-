package com.Alkemy.Disney.disney.service.implementacion;


import com.Alkemy.Disney.disney.dto.PersonajeDTO;
import com.Alkemy.Disney.disney.entity.PersonajeEntity;
import com.Alkemy.Disney.disney.mapper.PersonajeMapper;
import com.Alkemy.Disney.disney.repository.PersonajeRepository;
import com.Alkemy.Disney.disney.service.PersonajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonajeServiceImp  implements PersonajeService {

    @Autowired
    public PersonajeMapper personajeMapper;
    @Autowired
    private PersonajeRepository personajeRepository;

    public PersonajeDTO save(PersonajeDTO dto){
        PersonajeEntity entity = personajeMapper.personajeDTO2Entity(dto);
        PersonajeEntity entitysave = personajeRepository.save(entity);
        PersonajeDTO result = personajeMapper.personajeEntity2DTO(entitysave);
        return result;
    }

    public List<PersonajeDTO> getAllPersonajes(){
        List<PersonajeEntity> entities =personajeRepository.findAll();
        List<PersonajeDTO> result = personajeMapper.personajeEntityList2DTOList(entities);
        return result;
    }
}
