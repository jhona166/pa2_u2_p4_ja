package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Autor;
import com.example.demo.repository.modelo.dto.AutorDTO;

public interface AutorService {
	public void crear(Autor autor);
	public void actualizar(Autor autor);
	public Autor buscar(Integer id);
	public void borrar(Integer id);
	public List<AutorDTO> buscarTodosDTO();
	public List<Autor> seleccionarTodos();
}
