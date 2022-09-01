package com.formacionbdi.microservicios.app.usuarios.services;


import org.springframework.stereotype.Service;
import com.formacionbdi.microservicios.app.usuarios.model.entity.Alumno;
import com.formacionbdi.microservicios.app.usuarios.model.repository.AlumnoRepository;
import com.formacionbdi.microservicios.commons.services.CommonServiceImpl;

@Service
public class AlumnoServiceImpl extends CommonServiceImpl<Alumno, AlumnoRepository> implements AlumnosService {
	

}
