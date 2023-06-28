package com.example.demo.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Empleado;
import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.repository.modelo.Empleado;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class EmpleadoRepoImpl implements EmpleadoRepo {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Empleado empleado) {
		// TODO Auto-generated method stub
		this.entityManager.persist(empleado);
	}

	@Override
	public void actualizar(Empleado empleado) {
		// TODO Auto-generated method stub
		this.entityManager.merge(empleado);
	}

	@Override
	public Empleado seleccionar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Empleado.class ,id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Empleado empl = this.seleccionar(id);
		this.entityManager.remove(empl);
		
	}

	@Override
	public Empleado seleccionarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createQuery("SELECT e FROM Empleado e WHERE e.cedula=:datoCedula");
		myQuery.setParameter("datoCedula", cedula);
		return (Empleado)myQuery.getSingleResult();
	}

	@Override
	public List<Empleado> seleccionarPorCargo(String cargo) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createQuery("SELECT e FROM Empleado e WHERE e.cargo=:datoCargo");
		myQuery.setParameter("datoCargo", cargo);
		return myQuery.getResultList();
	}

	@Override
	public Empleado seleccionarPorSueldoTyped(BigDecimal sueldo) {
		// TODO Auto-generated method stub
		TypedQuery<Empleado> myQuery = this.entityManager.createQuery("SELECT e FROM Empleado e WHERE e.sueldo=:datoSueldo",Empleado.class);
		myQuery.setParameter("datoSueldo", sueldo);
		return myQuery.getSingleResult();
	}

	@Override
	public List<Empleado> seleccionarPorEdadCargo(String edad, String cargo) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createQuery("SELECT e FROM Empleado e WHERE e.edad=:datoEdad AND e.cargo=:datoCargo");
		myQuery.setParameter("datoEdad", edad);
		myQuery.setParameter("datoCargo", cargo);
		return myQuery.getResultList();
	}

	@Override
	public List<Empleado> seleccionarPorGeneroTyped(String genero) {
		// TODO Auto-generated method stub
		TypedQuery<Empleado> myQuery = this.entityManager.createQuery("SELECT e FROM Empleado e WHERE e.genero=:datoGenero",Empleado.class);
		myQuery.setParameter("datoGenero", genero);
		return myQuery.getResultList();
	}

	@Override
	public Empleado seleccionarPorApellidoNamed(String apellido) {
		// TODO Auto-generated method stub
		TypedQuery<Empleado> myQuery=this.entityManager.createNamedQuery("Empleado.buscarPorApellido",Empleado.class);
		myQuery.setParameter("datoApellido", apellido);
		return myQuery.getSingleResult();
	}

	@Override
	public Empleado seleccionarPorApellidoNamedQuery(String apellido) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNamedQuery("Empleado.buscarPorApellido");
		myQuery.setParameter("datoApellido", apellido);
		return (Empleado)myQuery.getSingleResult();
	}
	

}
