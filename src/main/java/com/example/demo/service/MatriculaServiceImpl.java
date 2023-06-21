package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.MatriculaRepo;
import com.example.demo.repository.modelo.Matricula;
@Service

public class MatriculaServiceImpl implements MatriculaService {
	
	
	@Autowired
	private MatriculaRepo matriculaRepo;
	@Override
	public void crear(Matricula matricula) {
		// TODO Auto-generated method stub
		this.matriculaRepo.insertar(matricula);
	}

}
