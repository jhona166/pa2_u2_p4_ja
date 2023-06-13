package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.CuentaBancaria;
import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.CuentaBancariaService;
import com.example.demo.service.EstudianteService;

@SpringBootApplication
public class Pa2U2P4JaApplication implements CommandLineRunner{
	@Autowired
	private CuentaBancariaService cuentaBancariaService;
	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4JaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		CuentaBancaria cuenta = new CuentaBancaria();
		cuenta.setFechaDeApertura(LocalDateTime.now());
		cuenta.setNumero("123");
		cuenta.setSaldo(new BigDecimal(500));
		cuenta.setCedula("1727501510");
		cuenta.setTipo("A");
		this.cuentaBancariaService.insertar(cuenta);
		this.cuentaBancariaService.aperturar(cuenta.getNumero(), cuenta.getTipo(),cuenta.getSaldo(), cuenta.getCedula());

		
		
	}
		
		
	
	

}
