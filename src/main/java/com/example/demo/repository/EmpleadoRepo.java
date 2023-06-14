package com.example.demo.repository;

import com.example.demo.repository.modelo.Ciudadano;
import com.example.demo.repository.modelo.Empleado;

public interface EmpleadoRepo {
	public void insertar(Empleado empleado);
	public void actualizar(Empleado empleado);
	public Empleado seleccionar(Integer id);
	public void eliminar(Integer id);
}
