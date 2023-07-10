package com.example.demo;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Autor;
import com.example.demo.repository.modelo.Libro;
import com.example.demo.service.AutorService;
import com.example.demo.service.EmpleadoService;
import com.example.demo.service.EstudianteService;
import com.example.demo.service.HotelService;
import com.example.demo.service.MatriculaService;

@SpringBootApplication
public class Pa2U2P4JaApplication implements CommandLineRunner {
	@Autowired
	private EmpleadoService empleadoService; 
	@Autowired
	private EstudianteService estudianteService; 
	@Autowired
	private HotelService hotelService;
	@Autowired
	private MatriculaService matriculaService;
	@Autowired
	private AutorService autorService;
	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4JaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
	Set<Autor> autores = new HashSet<>();
	Autor autor = new Autor();
	autor.setNombre("Gabriel");
	autor.setApellido("Garcia");
	autor.setNacionalidad("Colombiana");
	autor.setFechaNacimiento(LocalDateTime.of(1927, 03, 27, 0, 0));
	autor.setGenero("M");
	autores.add(autor);
	
	Autor autor1 = new Autor();
	autor1.setNombre("Isabel");
	autor1.setApellido("Allente");
	autor1.setNacionalidad("Peru");
	autor1.setFechaNacimiento(LocalDateTime.of(1942,8,02,0, 0));
	autor1.setGenero("F");
	autores.add(autor1);
	
	Autor autor2 = new Autor();
	autor2.setNombre("Steven");
	autor2.setApellido("King");
	autor2.setNacionalidad("Americana");
	autor2.setFechaNacimiento(LocalDateTime.of(1947,9,21,0, 0));
	autor2.setGenero("M");
	autores.add(autor2);
	
	
	
	Libro libro = new Libro();
	libro.setTitulo("Escritores inolvidables");
	libro.setEditorial("Gama editores");
	libro.setAutores(autores);

	Libro libro1 = new Libro();
	libro1.setTitulo("Memorias");
	libro1.setEditorial("Gama editores");
	libro1.setAutores(autores);
	
	
	//Crear autores
	this.autorService.crear(autor);
	this.autorService.crear(autor1);
	this.autorService.crear(autor2);
	
	System.out.println("Busqueda con DTO");
	System.out.println(this.autorService.buscarTodosDTO());
	
	System.out.println("Busqueda Lazy");
	System.out.println(this.autorService.seleccionarTodos());
		
		
	}
}
