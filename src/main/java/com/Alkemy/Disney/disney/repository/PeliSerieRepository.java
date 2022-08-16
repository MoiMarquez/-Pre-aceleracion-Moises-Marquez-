package com.Alkemy.Disney.disney.repository;

import com.Alkemy.Disney.disney.entity.PeliSerieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeliSerieRepository extends JpaRepository<PeliSerieEntity, Long> {

}
