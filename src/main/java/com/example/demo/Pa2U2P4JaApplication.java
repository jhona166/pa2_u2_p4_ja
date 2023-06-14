package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Ciudadano;
import com.example.demo.repository.modelo.Empleado;
import com.example.demo.service.CiudadanoService;
import com.example.demo.service.EmpleadoService;

@SpringBootApplication
public class Pa2U2P4JaApplication implements CommandLineRunner{
	@Autowired
	private CiudadanoService ciudadanoService;
	
	@Autowired
	private EmpleadoService empleadoService;
	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4JaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		Ciudadano ciud = new Ciudadano();
//		ciud.setNombre("Jhonatan");
//		ciud.setApellido("Altamirano");
//		ciud.setCedula("1727501510");
//		
//		this.ciudadanoService.crear(ciud);
		
//		Ciudadano ciud1 = new Ciudadano();
//		ciud1.setNombre("Grace");
//		ciud1.setApellido("Analuisa");
//		ciud1.setCedula("1727501511");
//		
//		this.ciudadanoService.crear(ciud1);
//		
//		Ciudadano ciud2 = new Ciudadano();
//		ciud2.setNombre("Karol");
//		ciud2.setApellido("Analuisa");
//		ciud2.setCedula("1727501512");
//		
//		this.ciudadanoService.crear(ciud2);
//		
//		
//		Ciudadano ciud = new Ciudadano();
//		ciud.setNombre("Danilo");
//		System.out.println("Actualizar: ");
//		this.ciudadanoService.actualizar(ciud);
//		
//		System.out.println("Buscar");
//		this.ciudadanoService.buscar(ciud2.getId());
//		
//		System.out.println("Eliminar");
//		this.ciudadanoService.borrar(ciud1.getId());
		
		Ciudadano ciud3 = new Ciudadano();
		ciud3.setNombre("Antony");
		ciud3.setApellido("Ortiz");
		ciud3.setCedula("1727501515");
		this.ciudadanoService.crear(ciud3);
		
		Ciudadano ciud4 = new Ciudadano();
		ciud4.setNombre("Paul");
		ciud4.setApellido("Ortiz");
		ciud4.setCedula("1727501516");
		this.ciudadanoService.crear(ciud4);
		
		Ciudadano ciud5 = new Ciudadano();
		ciud5.setNombre("Liz");
		ciud5.setApellido("Vaca");
		ciud5.setCedula("1727501517");
		this.ciudadanoService.crear(ciud5);
		
		
		///ojoi
		Empleado empleado = new Empleado();
		empleado.setCargo("Contador");
		empleado.setSueldo(new BigDecimal(900));
		empleado.setCiudadano(ciud3);
		this.empleadoService.crear(empleado);
	
		Empleado empleado1 = new Empleado();
		empleado1.setCargo("Supervisor");
		empleado1.setSueldo(new BigDecimal(1200));
		empleado1.setCiudadano(ciud4);
		this.empleadoService.crear(empleado1);
		
		Empleado empleado2 = new Empleado();
		empleado2.setCargo("Cajero");
		empleado2.setSueldo(new BigDecimal(720));
		empleado2.setCiudadano(ciud5);
		this.empleadoService.crear(empleado2);
		
		System.out.println("Se ha actualizado correctamente");
		Empleado empleado3 = new Empleado();
		empleado3.setCargo("Supervisor");
		this.empleadoService.actualizar(empleado3);
		
		System.out.println("Se ha eliminado correctamente");
		this.empleadoService.borrar(empleado1.getId());
		
		System.out.println("Se ha encontrado el empleado");
		this.empleadoService.buscar(empleado2.getId());
		
		
	}
		
		
	
	

}
