package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.CuentaBancariaRepo;
import com.example.demo.repository.modelo.CuentaBancaria;

@Service
public class CuentaBancariaServiceImpl implements CuentaBancariaService {
	@Autowired
	private CuentaBancariaRepo cuentaBancariaRepo;
	
	
	

	@Override
	public void actualizar(CuentaBancaria cuenta) {
		// TODO Auto-generated method stub
	 this.cuentaBancariaRepo.actualizar(cuenta);
	}

	@Override
	public CuentaBancaria consultar(String numero) {
		// TODO Auto-generated method stub
		return this.cuentaBancariaRepo.consultar(numero);
	}

	@Override
	public void aperturar(String numero, String tipo, BigDecimal saldo, String cedula) {
		// TODO Auto-generated method stub
		CuentaBancaria cuenta = this.cuentaBancariaRepo.encontrar(1);
		Integer dia = cuenta.getFechaDeApertura().getDayOfMonth();
		BigDecimal saldoT=new BigDecimal(0);
		System.out.println(dia);
		  if ( dia % 2 == 0 )
	        {
	          	
	       
	        }
	        else
	        {
	        	  System.out.printf( "ES PAR" );
		            BigDecimal comision = saldo.multiply(new BigDecimal(0.5));
		            saldoT=comision.add(saldo);	
	            System.out.printf( "ES IMPAR" );
	        }
		 cuenta.setSaldo(saldoT); 
		 this.cuentaBancariaRepo.actualizar(cuenta);
		 this.cuentaBancariaRepo.insertar(cuenta); 
		
	}

	@Override
	public void insertar(CuentaBancaria cuenta) {
		// TODO Auto-generated method stub
		this.cuentaBancariaRepo.insertar(cuenta);
	}

	@Override
	public CuentaBancaria buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.cuentaBancariaRepo.encontrar(id);
	}

	

}
