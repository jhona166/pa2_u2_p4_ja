package com.example.demo.repository;

import com.example.demo.repository.modelo.Ciudadano;
import com.example.demo.repository.modelo.Libro;

public interface LibroRepo {
	public void insertar(Libro libro);
	public void actualizar(Libro libro);
	public Libro seleccionar(Integer id);
	public void eliminar(Integer id);
}
