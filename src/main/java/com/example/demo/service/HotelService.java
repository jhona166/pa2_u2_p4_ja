package com.example.demo.service;

import java.math.BigDecimal;

import com.example.demo.repository.modelo.Empleado;
import com.example.demo.repository.modelo.Hotel;

public interface HotelService {
	public void crear(Hotel hotel);
	public void borrar(Integer id);
	public void actualizar(Hotel hotel);
	public Hotel buscar(Integer id);
	
}
