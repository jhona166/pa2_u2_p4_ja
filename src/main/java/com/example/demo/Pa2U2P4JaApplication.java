package com.example.demo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Empleado;
import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.EmpleadoService;
import com.example.demo.service.EstudianteService;

@SpringBootApplication
public class Pa2U2P4JaApplication implements CommandLineRunner {
	@Autowired
	private EmpleadoService empleadoService; 
	@Autowired
	private EstudianteService estudianteService; 
	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4JaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Estudiante estu = new Estudiante();
		estu.setApellido("Jhonatan");
		estu.setNombre("Altamirano");
		estu.setPeso(Double.valueOf(90));
	
	Estudiante estu1 = new Estudiante();
	estu1.setApellido("Arias");
	estu1.setNombre("Carmen");
	estu1.setPeso(Double.valueOf(120));
	
	
	
	this.estudianteService.crear(estu);
	this.estudianteService.crear(estu1);
	

	
	
	System.out.println("Busqueda dinamica");

	this.estudianteService.buscarEstudianteDinamico(estu1.getNombre(), estu1.getApellido(), estu1.getPeso());
	
	
	System.out.println("Borrar por mombre");

	this.estudianteService.borrarPorNombre("Jhonatan");
	
	System.out.println("Update nombre por apellido");
	
	this.estudianteService.actualizarPorApellido("Juan","Arias");
	
	}
	

}
