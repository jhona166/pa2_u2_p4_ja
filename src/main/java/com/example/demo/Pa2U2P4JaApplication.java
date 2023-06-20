package com.example.demo;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Autor;
import com.example.demo.repository.modelo.Libro;
import com.example.demo.service.AutorService;
import com.example.demo.service.LibroService;

@SpringBootApplication
public class Pa2U2P4JaApplication implements CommandLineRunner {
	@Autowired
	private AutorService autorService;
	@Autowired
	private LibroService libroService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4JaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Set<Libro> libros = new HashSet<Libro>();
		Libro libro = new Libro();
		libro.setEditorial("Edinun");
		libro.setTitulo("Matematica1");
		

		Libro libro1 = new Libro();
		libro1.setEditorial("Atlas");
		libro1.setTitulo("Fisica1");
		

		Libro libro2 = new Libro();
		libro2.setEditorial("Alfa");
		libro2.setTitulo("SSCC");
		
		// Agrego mis tres libros al conjunto
		libros.add(libro);
		libros.add(libro1);
		libros.add(libro2);
		
		//Creo un autor
		Autor autor = new Autor();
		autor.setNombre("Juan");
		autor.setApellido("Arias");
		
		//Le seteeo al autor el libro que tiene
		autor.setLibros(libros);
		
		//Construimos el conjunto de autores para settear al libro
		Set<Autor> autores = new HashSet<Autor>();
		autores.add(autor);
		
		//Crear
		autorService.crear(autor);
		//Modificar
		Libro librom = new Libro();
		librom.setTitulo("Matematica5");
		this.libroService.actualizar(librom);
		
		//Buscar
		this.libroService.buscar(libro.getId());
		
		//Eliminar
		this.libroService.borrar(libro2.getId());
		
		
		
		
		
		
	
		
		
		
	}

}
