package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.EstudianteService;

@SpringBootApplication
public class Pa2U2P4JaApplication implements CommandLineRunner {
	@Autowired
	private EstudianteService estudianteService; 
	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4JaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	Estudiante est= new Estudiante();
	est.setApellido("Altamirano");
	est.setNombre("Jhonatan");
	est.setCedula("1727501510");
	
	Estudiante est1= new Estudiante();
	est1.setApellido("Ortiz");
	est1.setNombre("Camilo");
	est1.setCedula("1727501511");
	
	Estudiante est2= new Estudiante();
	est2.setApellido("Ortiz");
	est2.setNombre("Antony");
	est2.setCedula("1727501512");
	
	this.estudianteService.crear(est);
	this.estudianteService.crear(est1);
	this.estudianteService.crear(est2);
	//Buscar por apellido
	System.out.println("Busqueda por apellido");
	this.estudianteService.buscarPorApellido("Altamirano");
	//System.out.println(this.estudianteService.buscarPorApellido("Altamirano"));
	
	//Busqueda Por apellido nombre
	this.estudianteService.buscarPorApellidoNombre("Altamirano", "Jhonatan");
	System.out.println("EstudianteEncontrado");
	System.out.println(this.estudianteService.buscarPorApellidoNombre("Altamirano", "Jhonatan"));
//	
//	List<Estudiante> estu= this.estudianteService.buscarListaPorEstudiante("Altamirano");
//	for(Estudiante h: estu) {
//		System.out.println(h.getNombre());
//	}
	//seleccionar por apellido Typed

	System.out.println("Apellido Typed");
	System.out.println(this.estudianteService.buscarPorApellidoTyped("Altamirano"));
	}
	

}
