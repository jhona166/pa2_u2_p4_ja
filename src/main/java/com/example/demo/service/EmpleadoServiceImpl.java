package com.example.demo.service;

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

}
