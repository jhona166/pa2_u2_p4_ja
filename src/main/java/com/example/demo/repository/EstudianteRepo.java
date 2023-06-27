package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Estudiante;

public interface EstudianteRepo {
	public void insertar(Estudiante estudiante);
	public void actualizar(Estudiante estudiante);
	public void eliminar(String cedula);
	public Estudiante seleccionar(String cedula);
	
	public Estudiante seleccionarPorApellido(String apellido);
	public List<Estudiante> seleccionarListaPorApellido(String apellido);
	public List<Estudiante> seleccionarListaPorApellido(String apellido,String nombre);

	
	public Estudiante seleccionarPorApellidoTyped(String apellido);
	public Estudiante seleccionarPorApellidoNamed(String apellido);
	
}
