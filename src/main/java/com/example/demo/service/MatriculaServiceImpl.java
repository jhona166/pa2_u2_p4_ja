package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.MatriculaRepo;
import com.example.demo.repository.modelo.Matricula;
import com.example.demo.repository.modelo.dto.EstudianteDTO;
import com.example.demo.repository.modelo.dto.MatriculaDTO;
@Service

public class MatriculaServiceImpl implements MatriculaService {
	
	
	@Autowired
	private MatriculaRepo matriculaRepo;
	@Override
	public void crear(Matricula matricula) {
		// TODO Auto-generated method stub
		this.matriculaRepo.insertar(matricula);
	}
	@Override
	public List<MatriculaDTO> buscarTodosDTO() {
		// TODO Auto-generated method stub
		return this.matriculaRepo.seleccionarTodosDTO();
	}

}
