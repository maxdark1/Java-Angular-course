package com.formacionbdi.microservicios.app.usuarios.model.repository;

import org.springframework.data.repository.CrudRepository;

import com.formacionbdi.microservicios.commons.alumnos.models.entity.Alumno;

public interface AlumnoRepository extends CrudRepository<Alumno, Long> {
	
}
