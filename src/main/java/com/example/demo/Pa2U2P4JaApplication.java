package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.repository.modelo.Habitacion;
import com.example.demo.repository.modelo.Hotel;
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
	
	
	Estudiante estu2 = new Estudiante();
	estu2.setApellido("Arias");
	estu2.setNombre("Maria");
	estu2.setPeso(Double.valueOf(120));
	estu2.setPeso(Double.valueOf(90));
	estu2.setCredAprobados(Double.valueOf(260));
	estu2.setPromedio(Double.valueOf(18.14));
	
	
	this.estudianteService.crear(estu);
	this.estudianteService.crear(estu1);
	this.estudianteService.crear(estu2);
	
	List<Habitacion> habitaciones = new ArrayList<>();
	Habitacion habi = new Habitacion();
	habi.setNumero("A1");

	Habitacion habi1 = new Habitacion();
	habi1.setNumero("A2");
	
	habitaciones.add(habi);
	habitaciones.add(habi1);
	
	
	Hotel hotel = new Hotel();
	hotel.setDireccion("AV. Colon");
	hotel.setNombre("Las palmeras");
	
	this.hotelService.crear(hotel);

	this.hotelService.buscar(1);
	
	System.out.println(this.hotelService.buscar(1).getNombre());
	
	
	//this.estudianteService.borrarPorCreditos(Double.valueOf(250));
		
	//System.out.println("Actutalizar por cred Aprobados");
	//this.estudianteService.actualizarPorCredAprobados(Double.valueOf(16.144), Double.valueOf(250));

	System.out.println("Busqueda con DTO");
	
	System.out.println(this.estudianteService.buscarTodosDTO());

	//System.out.println("Busqueda con DTO 2");
	
	//System.out.println(this.matriculaService.buscarTodosDTO());
	
	System.out.println("Imprimir habitaciones");
	
	for (Habitacion habitacion : habitaciones) {
		
		System.out.println(habitacion.getNumero());
	}
	
	}
	

}
