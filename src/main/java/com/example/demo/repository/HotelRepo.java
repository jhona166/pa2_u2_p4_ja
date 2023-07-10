package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Hotel;
import com.example.demo.repository.modelo.dto.EstudianteDTO;

public interface HotelRepo {
	public void insertar(Hotel hotel);
	public void eliminar(Integer id);
	public void actualizar(Hotel hotel);
	public Hotel seleccionar(Integer id);
	public List<Hotel> seleccionarTodos();
}
