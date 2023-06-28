package com.example.demo.repository;

import java.math.BigDecimal;
import java.util.List;

import com.example.demo.repository.modelo.Empleado;
import com.example.demo.repository.modelo.Estudiante;

public interface EmpleadoRepo {
	public void insertar(Empleado empleado);
	public void actualizar(Empleado empleado);
	public Empleado seleccionar(Integer id);
	public void eliminar(Integer id);
	public Empleado seleccionarPorCedula(String cedula);
	public List<Empleado> seleccionarPorCargo(String cargo);
	public Empleado seleccionarPorSueldoTyped(BigDecimal sueldo);
	public List<Empleado> seleccionarPorEdadCargo(String edad, String cargo);
	public List<Empleado> seleccionarPorGeneroTyped(String genero);
	
	public Empleado seleccionarPorApellidoNamed(String apellido);
	public Empleado seleccionarPorApellidoNamedQuery(String apellido);
}
