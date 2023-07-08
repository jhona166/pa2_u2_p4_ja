package com.example.demo.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.repository.modelo.dto.EstudianteDTO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import jakarta.transaction.Transactional;

@Repository
@Transactional

public class EstudianteRepoImpl implements EstudianteRepo {

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

		return this.entityManager.find(Estudiante.class, cedula);
	}

	@Override
	public Estudiante seleccionarPorApellido(String apellido) {
		// TODO Auto-generated method stub
		// SQL
		// SELECT * FROM estudiante e WHERE e.estu_apellido
		// JPQL
		// SELECT e FROM Estudiante e WHERE e.apellido
		Query myQuery = this.entityManager.createQuery("SELECT e FROM Estudiante  e WHERE e.apellido=:datoApellido");
		myQuery.setParameter("datoApellido", apellido);

		return (Estudiante) myQuery.getSingleResult();
	}

	@Override
	public List<Estudiante> seleccionarListaPorApellido(String apellido) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createQuery("SELECT e FROM Estudiante  e WHERE e.apellido=:datoApellido");
		myQuery.setParameter("datoApellido", apellido);

		return myQuery.getResultList();
	}

	@Override
	public List<Estudiante> seleccionarListaPorApellido(String apellido, String nombre) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager
				.createQuery("SELECT e FROM Estudiante  e WHERE e.apellido=:datoApellido AND e.nombre=:datoNombre");
		myQuery.setParameter("datoApellido", apellido);
		myQuery.setParameter("datoNombre", nombre);

		return myQuery.getResultList();
	}

	@Override
	public Estudiante seleccionarPorApellidoTyped(String apellido) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myQuery = this.entityManager
				.createQuery("SELECT e FROM Estudiante  e WHERE e.apellido=:datoApellido", Estudiante.class);
		myQuery.setParameter("datoApellido", apellido);

		return myQuery.getSingleResult();
	}

	@Override
	public Estudiante seleccionarPorApellidoNamed(String apellido) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorApellido",
				Estudiante.class);
		myQuery.setParameter("datoApellido", apellido);
		return myQuery.getSingleResult();
	}

	@Override
	public Estudiante seleccionarPorApellidoNamedQuery(String apellido) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorApellido");
		myQuery.setParameter("datoApellido", apellido);
		return (Estudiante) myQuery.getSingleResult();

	}

	@Override
	public Estudiante seleccionarPorApellidoNativeQuery(String apellido) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager
				.createNativeQuery("SELECT * FROM Estudiante where estu_apellido=:datoApellido", Estudiante.class);
		myQuery.setParameter("datoApellido", apellido);
		return (Estudiante) myQuery.getSingleResult();
	}

	@Override
	public Estudiante seleccionarPorApellidoNativeQueryNamed(String apellido) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorApellidoNative",
				Estudiante.class);
		myQuery.setParameter("datoApellido", apellido);
		return myQuery.getSingleResult();
	}

	@Override
	public Estudiante seleccionarPorNombreNativeQuery(String nombre) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNativeQuery("SELECT * FROM Estudiante where estu_nombre=:datoNombre",
				Estudiante.class);
		myQuery.setParameter("datoApellido", nombre);
		return (Estudiante) myQuery.getSingleResult();
	}

	@Override
	public Estudiante seleccionarPorNombreNativeQueryNamed(String nombre) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorNombreNative",
				Estudiante.class);
		myQuery.setParameter("datoApellido", nombre);
		return myQuery.getSingleResult();
	}

	@Override
	public Estudiante seleccionarPorApellidoCriteriaAPIQuery(String apellido) {
		// TODO Auto-generated method stub
		CriteriaBuilder myBuilder = this.entityManager.getCriteriaBuilder();
		// 1.Especificar el tipo de retorno que tiene my Query
		CriteriaQuery<Estudiante> myCriteriaQuery = myBuilder.createQuery(Estudiante.class);

		// 2.Empezamos a crear my SQL
		// 2.1 Definimos el FROM(Root)
		Root<Estudiante> miTablaFrom = myCriteriaQuery.from(Estudiante.class);

		// 3. Construir las condiciones de mi SQL
		// Las condiciones se las conoce como predicados, cada condicion es un predicado
		Predicate condidiconApellido = myBuilder.equal(miTablaFrom.get("apellido"), apellido);

		// 4. Armamos mi SQL final
		myCriteriaQuery.select(miTablaFrom).where(condidiconApellido);

		// 5. La ejecucion del Query lo realizamos con typed Query
		TypedQuery<Estudiante> myQueryFinal = this.entityManager.createQuery(myCriteriaQuery);
		return myQueryFinal.getSingleResult();
	}

	@Override
	public Estudiante seleccionarEstudianteDinamico(String nombre, String apellido, Double peso) {
		// TODO Auto-generated method stub
		// 1.Especificar el tipo de retorno de mi query
		CriteriaBuilder myBuilder = this.entityManager.getCriteriaBuilder();
		CriteriaQuery<Estudiante> myCriteriaQuery = myBuilder.createQuery(Estudiante.class);

		// 2.Empezamos a crear my SQL
		// 2.1 Definimos el FROM(Root)
		Root<Estudiante> miTablaFrom = myCriteriaQuery.from(Estudiante.class);

		// 3. Construye las condiciones
		// peso>100 e.nombre =? AND e.apellido;
		// peso<=100 e.nombre =? OR e.apellido;

		// e.nombre
		Predicate pNombre = myBuilder.equal(miTablaFrom.get("nombre"), nombre);

		// e.apellido
		Predicate pApellido = myBuilder.equal(miTablaFrom.get("apellido"), apellido);

		Predicate predicadoFinal = null;
		if (peso.compareTo(Double.valueOf(100)) <= 0) {
			predicadoFinal = myBuilder.or(pNombre, pApellido);
		} else {
			predicadoFinal = myBuilder.and(pNombre, pApellido);
		}
		// 4. Armamos mi SQL final
		myCriteriaQuery.select(miTablaFrom).where(predicadoFinal);

		// 5. La ejecucion del Query lo realizamos con typed Query
		TypedQuery<Estudiante> myQueryFinal = this.entityManager.createQuery(myCriteriaQuery);
		return myQueryFinal.getSingleResult();
	}

	@Override
	public int eliminarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		//DELETE FROM Estudiante where estu_nombre = ? 
		//DELETE FROM Estudiante e WHERE e.nombre =:datoNombre
		Query myQuery = this.entityManager.createQuery("DELETE FROM Estudiante e WHERE e.nombre =:datoNombre");
		myQuery.setParameter("datoNombre",nombre);
		System.out.println(myQuery.executeUpdate());
		return myQuery.executeUpdate();
	}

	@Override
	public int actualizarPorApellido(String nombre,String apellido) {
		// TODO Auto-generated method stub
		//UPDATE Estudiante SET estu_nombre=? WHERE estu_apellido=?
		//UPDATE Estudiante e SET e.nombre=:datoNombre WHERE e.apellido=:datoApellido
		
		Query myQuery = this.entityManager.createQuery("UPDATE Estudiante e SET e.nombre=:datoNombre WHERE e.apellido=:datoApellido");
		myQuery.setParameter("datoNombre",nombre);
		myQuery.setParameter("datoApellido",apellido);
		System.out.println(myQuery.executeUpdate());
		return myQuery.executeUpdate();
			
	}

	@Override
	public Estudiante seleccionarEstudianteBecadoDinamico(String nombre, String apellido, Double credAprobados,
			Double promedio) {
		// TODO Auto-generated method stub
		//1. Especificar el tipo de retorno de mi Query
		CriteriaBuilder myBuilder = this.entityManager.getCriteriaBuilder();
		CriteriaQuery<Estudiante> myCriteriaQuery =myBuilder.createQuery(Estudiante.class);
		
		//2. Empezamos a crear mi SQL
		//2.1 Definimos el FROM(Root)
		Root<Estudiante> miTablaFrom = myCriteriaQuery.from(Estudiante.class);
		
		//3.Construimos las condiciones
		//e.nombre
		Predicate pNombre = myBuilder.equal(miTablaFrom.get("nombre"), nombre);
		
		//e.apellido
		Predicate pApellido = myBuilder.equal(miTablaFrom.get("apellido"), apellido);
		
		//e.credAprobados
		//mayor o igual que 20 ya que se tomara encuenta a estudiantes de sem. superiores
		Predicate pCredAprobados = myBuilder.greaterThanOrEqualTo(miTablaFrom.get("credAprobados"),150);
		
		
		//e.promedio
		Predicate pPromedio = null;
		if(promedio.compareTo(Double.valueOf(18))>=0) {
			pCredAprobados = myBuilder.and(pNombre,pApellido,pCredAprobados);
		}else {
			pCredAprobados = myBuilder.or(pNombre,pApellido,pCredAprobados);
		}
		
		//4. Armamos mi SQL final 
		myCriteriaQuery.select(miTablaFrom).where(pCredAprobados);


		// 5. La ejecucion del Query lo realizamos con typed Query
		TypedQuery<Estudiante> myQueryFinal = this.entityManager.createQuery(myCriteriaQuery);
		return myQueryFinal.getSingleResult();
		
		
	}

	@Override
	public int eliminarPorCreditos(Double credAprobados) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createQuery("DELETE FROM Estudiante e WHERE e.credAprobados =:datoCred");
		myQuery.setParameter("datoCred", credAprobados);	
		System.out.println(myQuery.executeUpdate());
		return myQuery.executeUpdate();
	}

	@Override
	public int actualizarPorCredAprobados(Double promedio, Double credAprobados) {
		// TODO Auto-generated method stub

		Query myQuery = this.entityManager.createQuery("UPDATE Estudiante e SET e.promedio=:datoPromedio WHERE e.credAprobados=:datoCred");
		myQuery.setParameter("datoPromedio",promedio);
		myQuery.setParameter("datoCred",credAprobados);
		System.out.println(myQuery.executeUpdate());
		return myQuery.executeUpdate();
			
	}

	@Override
	public List<EstudianteDTO> seleccionarTodosDTO() {
		// TODO Auto-generated method stub
		TypedQuery<EstudianteDTO> myQuery = this.entityManager.createQuery("SELECT NEW com.example.demo.repository.modelo.dto.EstudianteDTO(e.nombre,e.apellido) FROM Estudiante e ",EstudianteDTO.class);
		

		
		return myQuery.getResultList();
	}


	
}
