package com.example.demo.repository;

import com.example.demo.repository.modelo.Ciudadano;

public interface CiudadanoRepo {
	public void insertar(Ciudadano ciudadano);
	public void actualizar(Ciudadano ciudadano);
	public Ciudadano seleccionar(Integer id);
	public void eliminar(Integer id);
}
