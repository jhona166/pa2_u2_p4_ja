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
		estu.setCredAprobados(Double.valueOf(260));
		estu.setPromedio(Double.valueOf(19.20));
		
	Estudiante estu1 = new Estudiante();
	estu1.setApellido("Arias");
	estu1.setNombre("Carmen");
	estu1.setPeso(Double.valueOf(120));
	estu1.setPeso(Double.valueOf(90));
	estu1.setCredAprobados(Double.valueOf(250));
	estu1.setPromedio(Double.valueOf(16.14));
	
	
	this.estudianteService.crear(estu);
	this.estudianteService.crear(estu1);
	

	
	
	System.out.println("Busqueda dinamica1");
	//nombre, apellido, credAprobados, promedio
	this.estudianteService.buscarEstudianteBecadoDinamico(estu.getNombre(), estu.getApellido(), estu.getCredAprobados(),estu.getPromedio());
	
	System.out.println("Busqueda dinamica 2 ");
	//nombre, apellido, credAprobados, promedio
	this.estudianteService.buscarEstudianteBecadoDinamico(estu.getNombre(), estu.getApellido(), estu.getCredAprobados(),estu.getPromedio());
	



	
	}
	

}
