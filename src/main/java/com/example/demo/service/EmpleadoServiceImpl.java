package com.example.demo.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.EmpleadoRepo;
import com.example.demo.repository.modelo.Empleado;
@Service
public class EmpleadoServiceImpl implements EmpleadoService {
	@Autowired
	private EmpleadoRepo empleadoRepo;
	
	@Override
	public void crear(Empleado empleado) {
		// TODO Auto-generated method stub
		this.empleadoRepo.insertar(empleado);
	}

	@Override
	public void actualizar(Empleado empleado) {
		// TODO Auto-generated method stub
		this.empleadoRepo.actualizar(empleado);
	}

	@Override
	public Empleado buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.empleadoRepo.seleccionar(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.empleadoRepo.eliminar(id);
	}

	@Override
	public Empleado buscarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.empleadoRepo.seleccionarPorCedula(cedula);
	}

	@Override
	public List<Empleado> buscarPorCargo(String cargo) {
		// TODO Auto-generated method stub
		return this.empleadoRepo.seleccionarPorCargo(cargo);
	}

	@Override
	public Empleado buscarPorSueldoTyped(BigDecimal sueldo) {
		// TODO Auto-generated method stub
		return this.empleadoRepo.seleccionarPorSueldoTyped(sueldo);
	}

	@Override
	public List<Empleado> buscarPorEdadCargo(String edad, String cargo) {
		// TODO Auto-generated method stub
		return this.empleadoRepo.seleccionarPorEdadCargo(edad, cargo);
	}

	@Override
	public List<Empleado> buscarPorGeneroTyped(String genero) {
		// TODO Auto-generated method stub
		return this.empleadoRepo.seleccionarPorGeneroTyped(genero);
	}

}
