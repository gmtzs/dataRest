package com.utils.gmtzs.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.utils.gmtzs.model.CatEntidad;


public interface CatEntidadRepository extends JpaRepository<CatEntidad, Integer> {

}
