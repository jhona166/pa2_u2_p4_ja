package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Alumno;
import com.example.demo.repository.modelo.Materia;
import com.example.demo.repository.modelo.Matricula;
import com.example.demo.service.MatriculaService;

@SpringBootApplication
public class Pa2U2P4JaApplication implements CommandLineRunner {
	@Autowired
	private MatriculaService matriculaService;
	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4JaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	Alumno alumno= new Alumno();
	alumno.setNombre("Jhonatan");

	Alumno alumno1= new Alumno();
	alumno1.setNombre("Carlos");
	
	Alumno alumno2= new Alumno();
	alumno2.setNombre("Juan");
	
	Materia mate= new Materia();
	mate.setNombre("Fisica");

	Materia mate1= new Materia();
	mate1.setNombre("Matematica");

	Matricula matricula = new Matricula();
	matricula.setAlumno(alumno1);
	matricula.setMateria(mate1);
	matricula.setFecha(LocalDateTime.now());
	matricula.setNumero("A1");
	this.matriculaService.crear(matricula);
	
		
		
	
		
		
		
	}

}
