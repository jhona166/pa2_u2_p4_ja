package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Autor;
import com.example.demo.repository.modelo.dto.AutorDTO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;


@Repository
@Transactional
public class AutorRepoImpl implements AutorRepo {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Autor autor) {
		// TODO Auto-generated method stub
		this.entityManager.persist(autor);
	}

	@Override
	public void actualizar(Autor autor) {
		// TODO Auto-generated method stub
		this.entityManager.merge(autor);
	}

	@Override
	public Autor seleccionar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Autor.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Autor autor = this.seleccionar(id);
		this.entityManager.remove(autor);
	}

	@Override
	public List<AutorDTO> seleccionarTodosDTO() {
		// TODO Auto-generated method stub
		
		TypedQuery<AutorDTO> myQuery = this.entityManager.createQuery("SELECT NEW com.example.demo.repository.modelo.dto.AutorDTO(e.nombre,e.apellido,e.nacionalidad,e.fechaNacimiento) FROM Autor e",AutorDTO.class);
		
		return myQuery.getResultList();
	}

	@Override
	public List<Autor> seleccionarTodos() {
		// TODO Auto-generated method stub
		TypedQuery<Autor> myQuery = this.entityManager.createQuery("SELECT e FROM Autor e",Autor.class);
		List<Autor> autores =myQuery.getResultList();		
				for (Autor autor : autores) {
					autor.getLibros().size();
				System.out.println(autor.getLibros().size());
				}
				return autores;
	}

}
