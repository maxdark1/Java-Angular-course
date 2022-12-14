package com.formacionbdi.microservicios.app.usuarios.controllers;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.formacionbdi.microservicios.app.usuarios.services.AlumnosService;
import com.formacionbdi.microservicios.commons.alumnos.models.entity.Alumno;
import com.formacionbdi.microservicios.commons.controllers.CommonController;


@RestController
public class AlumnoController extends CommonController<Alumno,AlumnosService> {
	@PutMapping("/{id}")
	public ResponseEntity<?> actualizar(@RequestBody Alumno alumno, @PathVariable Long id){
		
		Optional<Alumno> alumnoO = service.findById(id);
		
		if(alumnoO.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		
		Alumno alumnoDB = alumnoO.get();
		alumnoDB.setNombre(alumno.getNombre());
		alumnoDB.setApellido(alumno.getApellido());
		alumnoDB.setEmail(alumno.getEmail());
		
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(alumnoDB));
	}
}
