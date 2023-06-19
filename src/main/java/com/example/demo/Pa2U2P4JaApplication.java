package com.example.demo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Habitacion;
import com.example.demo.repository.modelo.Hotel;
import com.example.demo.service.HotelService;

@SpringBootApplication
public class Pa2U2P4JaApplication implements CommandLineRunner{
	@Autowired
	private HotelService hotelService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4JaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Habitacion> habitaciones = new ArrayList<>();
		
		Habitacion habi = new Habitacion();
		habi.setNumero("A01");
		habi.setValor(new BigDecimal(250));
		
		Habitacion habi2 = new Habitacion();
		habi2.setNumero("A02");
		habi2.setValor(new BigDecimal(250));

		Habitacion habi3 = new Habitacion();
		habi3.setNumero("A03");
		habi3.setValor(new BigDecimal(300));
		
		Habitacion habi4 = new Habitacion();
		habi4.setNumero("A04");
		habi4.setValor(new BigDecimal(350));
		
		habitaciones.add(habi);
		habitaciones.add(habi2);
		habitaciones.add(habi3);
		habitaciones.add(habi4);
		
		Hotel hotel = new Hotel();
		hotel.setHabitaciones(habitaciones);
		hotel.setNombre("Marriot");
		hotel.setDireccion("Av.Eloy Alfaro y 10 de Agosto");
		
		this.hotelService.crear(hotel);
	}
		
		
	
	

}
