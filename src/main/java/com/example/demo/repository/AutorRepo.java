package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Autor;
import com.example.demo.repository.modelo.dto.AutorDTO;

public interface AutorRepo {
	public void insertar(Autor autor);
	public void actualizar(Autor autor);
	public Autor seleccionar(Integer id);
	public void eliminar(Integer id);
	public List<AutorDTO> seleccionarTodosDTO();
}
