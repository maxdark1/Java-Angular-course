package com.formacionbdi.microservicios.app.app.cursos.model.repository;

import org.springframework.data.repository.CrudRepository;

import com.formacionbdi.microservicios.app.app.cursos.model.entity.Curso;

public interface CursoRepository extends CrudRepository<Curso, Long>{

}
