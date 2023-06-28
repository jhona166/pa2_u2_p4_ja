package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Estudiante;

public interface EstudianteService {
	public void crear(Estudiante estudiante);
	public void actualizar(Estudiante estudiante);
	public void borrar(String cedula);
	public Estudiante seleccionarPorCedula(String cedula);
	public Estudiante buscarPorApellido(String apellido);

	public List<Estudiante> buscarListaPorEstudiante(String apellido);
	public List<Estudiante> buscarPorApellidoNombre(String apellido,String nombre);
	
	public Estudiante buscarPorApellidoTyped(String apellido);
	
	public Estudiante buscarPorApellidoNamed(String apellido);
	public Estudiante buscarPorApellidoNamedQuery(String apellido);
	
	
	public Estudiante seleccionarPorApellidoNativeQuery(String apellido);
	
	public Estudiante buscarPorNombreNativeQuery(String nombre);
	public Estudiante buscarPorNombreNativeQueryNamed(String nombre);
}
