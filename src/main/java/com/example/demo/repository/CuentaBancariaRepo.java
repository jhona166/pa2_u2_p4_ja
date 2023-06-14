package com.example.demo.repository;

import com.example.demo.repository.modelo.CuentaBancaria;

public interface CuentaBancariaRepo {
	public void insertar(CuentaBancaria cuenta);
	public void actualizar(CuentaBancaria cuenta);
	public CuentaBancaria consultar(String numero);
	public CuentaBancaria encontrar(Integer id);
	
	
	
	
}
