package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.EstudianteRepo;
import com.example.demo.repository.modelo.Estudiante;

@Service
public class EstudianteServiceImpl implements EstudianteService{
	@Autowired
	private EstudianteRepo estudianteRepo;
	
	@Override
	public void crear(Estudiante estudiante) {
		// TODO Auto-generated method stub
	this.estudianteRepo.insertar(estudiante);	
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.estudianteRepo.actualizar(estudiante);	
	}

	@Override
	public void borrar(String cedula) {
		// TODO Auto-generated method stub
		this.estudianteRepo.eliminar(cedula);
	}

	@Override
	public Estudiante seleccionarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.seleccionar(cedula);
	}

	@Override
	public Estudiante buscarPorApellido(String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.seleccionarPorApellido(apellido);
	}

	@Override
	public List<Estudiante> buscarListaPorEstudiante(String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.seleccionarListaPorApellido(apellido);
	}

	@Override
	public List<Estudiante> buscarPorApellidoNombre(String apellido, String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.seleccionarListaPorApellido(apellido, nombre);
	}

	@Override
	public Estudiante buscarPorApellidoTyped(String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.seleccionarPorApellidoTyped(apellido);
	}
	

}
