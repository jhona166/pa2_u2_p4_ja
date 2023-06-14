package com.example.demo.service;

import java.math.BigDecimal;

import com.example.demo.repository.modelo.CuentaBancaria;

public interface CuentaBancariaService {
	public void insertar(CuentaBancaria cuenta);
	public void aperturar(String numero, String tipo, BigDecimal saldo,String cedula);
	public void actualizar(CuentaBancaria cuenta);
	public CuentaBancaria consultar(String numero);
	public CuentaBancaria buscar(Integer id);
}
