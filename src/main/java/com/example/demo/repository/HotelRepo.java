package com.example.demo.repository;

import com.example.demo.repository.modelo.Hotel;

public interface HotelRepo {
	public void insertar(Hotel hotel);
	public void eliminar(Integer id);
	public void actualizar(Hotel hotel);
	public Hotel seleccionar(Integer id);
}
