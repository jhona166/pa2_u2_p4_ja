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
	private EstudianteService estudianteService; 
	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4JaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	//Instancio los estudiantes
		Estudiante estu = new Estudiante();
		estu.setNombre("Jhonatan");
		estu.setApellido("Altamirano");
		estu.setCedula("172750150");
		
		Estudiante estu1 = new Estudiante();
		estu1.setNombre("Danilo ");
		estu1.setApellido("Ortiz");
		estu1.setCedula("1727501501");
		
		Estudiante estu2 = new Estudiante();
		estu2.setNombre("Grace");
		estu2.setApellido("Analuisa");
		estu2.setCedula("1727501512");
		
		Estudiante estu3 = new Estudiante();
		estu3.setNombre("Jefferson");
		estu3.setApellido("Samaniego");
		estu3.setCedula("1727501513");
		
		Estudiante estu4 = new Estudiante();
		estu4.setNombre("Karol");
		estu4.setApellido("Ortega");
		estu4.setCedula("1727501514");
		
		//Creo los estudiantes
//		this.estudianteService.crear(estu);
//		this.estudianteService.crear(estu1);
//		this.estudianteService.crear(estu2);
//		this.estudianteService.crear(estu3);
//		this.estudianteService.crear(estu4);
		
		
		//Native Query
		System.out.println("Apellido Native Query");
		System.out.println(this.estudianteService.buscarPorApellidoNativeQuery("Altamirano"));
		
		//Native Query Named
		System.out.println("Nombre Native Query Named");
		System.out.println(this.estudianteService.buscarPorNombreNativeQueryNamed("Karol"));
		
		//Apellido Named Query Named
		System.out.println("Apellido Native Query Named");
		System.out.println(this.estudianteService.buscarPorApellidoNativeQueryNamed("Ortiz"));
		
		//Criteria Api Query
		System.out.println("Criteria API Query");
		System.out.println(this.estudianteService.buscarPorApellidoNamedQuery("Samaniego"));
		
	
	}
	

}
