package com.example.demo;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Autor;
import com.example.demo.repository.modelo.Libro;
import com.example.demo.service.LibroService;

@SpringBootApplication
public class Pa2U2P4JaApplication implements CommandLineRunner {
	@Autowired
	private LibroService libroService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4JaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Mis 3 Autores
		Set<Autor> autores = new HashSet<Autor>();

		Autor autor = new Autor();
		autor.setNombre("Juan");
		autor.setApellido("Arias");

		Autor autor1 = new Autor();
		autor1.setNombre("Marco");
		autor1.setApellido("Delgado");

		Autor autor2 = new Autor();
		autor2.setNombre("Jimmy");
		autor2.setApellido("Arteaga");
		// Agrego mis tre autores al conjunto
		autores.add(autor);
		autores.add(autor1);
		autores.add(autor2);

		Libro libro = new Libro();
		libro.setEditorial("Edinun");
		libro.setTitulo("Matematica1");
		// Le seteeo al libro que tiene 3 autores
		libro.setAutores(autores);

		//Construimos el conjunto de libros para settear al autor
		Set<Libro> libros = new HashSet<Libro>();
		libros.add(libro);

		
		
		//Seteamos a cada autor el libro
		autor.setLibros(libros);
		autor1.setLibros(libros);
		autor2.setLibros(libros);
		this.libroService.crear(libro);
		

	}

}
