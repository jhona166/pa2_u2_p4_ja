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
		
		
		Estudiante estu = new Estudiante();
		estu.setNombre("Jhonatan");
		estu.setApellido("Altamirano");
		estu.setCedula("1727501510");
		this.estudianteService.crear(estu);
	}

}
