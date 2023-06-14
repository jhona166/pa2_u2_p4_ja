package com.example.demo.service;

import com.example.demo.repository.modelo.Ciudadano;
import com.example.demo.repository.modelo.Empleado;

public interface EmpleadoService {
	public void crear(Empleado empleado);
	public void actualizar(Empleado empleado);
	public Empleado buscar(Integer id);
	public void borrar(Integer id);
}
