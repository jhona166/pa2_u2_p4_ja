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
	public Estudiante seleccionarPorApellidoNamedQuery(String apellido);
	public Estudiante seleccionarPorApellidoNativeQuery(String apellido);
	public Estudiante seleccionarPorApellidoNativeQueryNamed(String apellido);

	public Estudiante seleccionarPorNombreNativeQuery(String nombre);
	public Estudiante seleccionarPorNombreNativeQueryNamed(String nombre);
	
	public Estudiante seleccionarPorApellidoCriteriaAPIQuery(String apellido);

	public Estudiante seleccionarEstudianteDinamico(String nombre,String apellido,Double peso);
	
	public int eliminarPorNombre(String nombre);
	
	public int actualizarPorApellido(String nombre,String apellido);
	
	public Estudiante seleccionarEstudianteBecadoDinamico(String nombre,String apellido, Double credAprobados,Double promedio );
	
	public int eliminarPorCreditos(Double credAprobados);

	public int actualizarPorCredAprobados(Double promedio,Double credAprobados);
}			
