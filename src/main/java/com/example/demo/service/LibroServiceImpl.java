package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.LibroRepo;
import com.example.demo.repository.modelo.Libro;
@Service

public class LibroServiceImpl implements LibroService {
	@Autowired
	private LibroRepo libroRepo;
	@Override
	public void crear(Libro libro) {
		// TODO Auto-generated method stub
this.libroRepo.insertar(libro);
	}

	@Override
	public void actualizar(Libro libro) {
		// TODO Auto-generated method stub
this.libroRepo.actualizar(libro);
	}

	@Override
	public Libro buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.libroRepo.seleccionar(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
this.libroRepo.eliminar(id);
	}

}
