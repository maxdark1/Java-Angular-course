package com.formacionbdi.microservicios.app.app.cursos.services;



import org.springframework.stereotype.Service;

import com.formacionbdi.microservicios.app.app.cursos.model.entity.Curso;
import com.formacionbdi.microservicios.app.app.cursos.model.repository.CursoRepository;
import com.formacionbdi.microservicios.commons.services.CommonServiceImpl;

@Service
public class CursoServiceImpl extends CommonServiceImpl<Curso, CursoRepository> implements CursoService {


}
