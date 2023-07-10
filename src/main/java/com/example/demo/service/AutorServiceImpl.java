package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.AutorRepo;
import com.example.demo.repository.modelo.Autor;
import com.example.demo.repository.modelo.dto.AutorDTO;
@Service
public class AutorServiceImpl implements AutorService {
	@Autowired
	private AutorRepo autorRepo;

	@Override
	public void crear(Autor autor) {
		// TODO Auto-generated method stub
		this.autorRepo.insertar(autor);
	}

	@Override
	public void actualizar(Autor autor) {
		// TODO Auto-generated method stub
		this.autorRepo.actualizar(autor);
	}

	@Override
	public Autor buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.autorRepo.seleccionar(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.autorRepo.eliminar(id);
	}

	@Override
	public List<AutorDTO> buscarTodosDTO() {
		// TODO Auto-generated method stub
		return this.autorRepo.seleccionarTodosDTO();
	}

	@Override
	public List<Autor> seleccionarTodos() {
		// TODO Auto-generated method stub
		return this.autorRepo.seleccionarTodos();
	}

}
