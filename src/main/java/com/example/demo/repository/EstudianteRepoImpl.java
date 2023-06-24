package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional

public class EstudianteRepoImpl implements EstudianteRepo{
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override	
	public void insertar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.entityManager.persist(estudiante);
	}
	@Override
	public void actualizar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.entityManager.merge(estudiante);
		
	}
	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		Estudiante estu = this.seleccionar(cedula);
		this.entityManager.remove(estu);
	}
	@Override
	public Estudiante seleccionar(String cedula) {
		// TODO Auto-generated method stub
		
		
		return this.entityManager.find(Estudiante.class , cedula);
	}
	@Override
	public Estudiante seleccionarPorApellido(String apellido) {
		// TODO Auto-generated method stub
		//SQL
		//SELECT * FROM estudiante e WHERE e.estu_apellido 
		//JPQL
		//SELECT e FROM Estudiante  e WHERE e.apellido
		Query myQuery= this.entityManager.createQuery("SELECT e FROM Estudiante  e WHERE e.apellido=:datoApellido");
		myQuery.setParameter("datoApellido", apellido);
		
		return (Estudiante)myQuery.getSingleResult();
	}
	@Override
	public List<Estudiante> seleccionarListaPorApellido(String apellido) {
		// TODO Auto-generated method stub
		Query myQuery= this.entityManager.createQuery("SELECT e FROM Estudiante  e WHERE e.apellido=:datoApellido");
		myQuery.setParameter("datoApellido", apellido);
		
		return myQuery.getResultList();
	}
	@Override
	public List<Estudiante> seleccionarListaPorApellido(String apellido, String nombre) {
		// TODO Auto-generated method stub
		Query myQuery= this.entityManager.createQuery("SELECT e FROM Estudiante  e WHERE e.apellido=:datoApellido AND e.nombre=:datoNombre");
		myQuery.setParameter("datoApellido", apellido);
		myQuery.setParameter("datoNombre", nombre);
		
		return myQuery.getResultList();
	}
	@Override
	public Estudiante seleccionarPorApellidoTyped(String apellido) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myQuery=this.entityManager.createQuery("SELECT e FROM Estudiante  e WHERE e.apellido=:datoApellido",Estudiante.class);
		myQuery.setParameter("datoApellido", apellido);
		
		return myQuery.getSingleResult();
	}
	
}
