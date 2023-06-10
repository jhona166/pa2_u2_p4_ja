package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.EstudianteService;

@SpringBootApplication
public class Pa2U2P4JaApplication implements CommandLineRunner{
	@Autowired
	EstudianteService estudianteService;
	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4JaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//Crear1
		Estudiante estu = new Estudiante();
		estu.setNombre("Jhonatan");
		estu.setApellido("Altamirano");
		estu.setCedula("1727501510");
	//	this.estudianteService.crear(estu);
		
		//Crear2
		Estudiante estu1 = new Estudiante();
		estu1.setNombre("Daniel");
		estu1.setApellido("Lopez");
		estu1.setCedula("1727501511");
		this.estudianteService.crear(estu1);
	
		//Buscar
		System.out.println("Se ha encontrado un elemento");
		System.out.println(this.estudianteService.seleccionarPorCedula("1727501510"));
		//Actualizar
		estu1.setApellido("Ortega");
		this.estudianteService.actualizar(estu1);
		System.out.println("Se ha actualizado correctamente");
		
		//Eliminar
		this.estudianteService.borrar("1727501511");
		System.out.println("Se ha eliminado correctamente");
		
	
		
		
	}
		
		
	
	

}
