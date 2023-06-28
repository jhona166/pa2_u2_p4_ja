package com.example.demo.service;

import java.math.BigDecimal;
import java.util.List;

import com.example.demo.repository.modelo.Ciudadano;
import com.example.demo.repository.modelo.Empleado;
import com.example.demo.repository.modelo.Empleado;

public interface EmpleadoService {
	public void crear(Empleado empleado);
	public void actualizar(Empleado empleado);
	public Empleado buscar(Integer id);
	public void borrar(Integer id);
	public Empleado buscarPorCedula(String cedula);
	public List<Empleado> buscarPorCargo(String cargo);
	public Empleado buscarPorSueldoTyped(BigDecimal sueldo);
	public List<Empleado> buscarPorEdadCargo(String edad, String cargo);
	public List<Empleado> buscarPorGeneroTyped(String genero);
	
	public Empleado buscarPorApellidoNamed(String apellido);
	public Empleado buscarPorApellidoNamedQuery(String apellido);
}
