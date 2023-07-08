package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Matricula;
import com.example.demo.repository.modelo.dto.EstudianteDTO;
import com.example.demo.repository.modelo.dto.MatriculaDTO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
@Repository

@Transactional

public class MatriculaRepoImpl implements MatriculaRepo {
	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public void insertar(Matricula matricula) {
		// TODO Auto-generated method stub
		this.entityManager.persist(matricula);
	}
	@Override
	public List<MatriculaDTO> seleccionarTodosDTO() {
		// TODO Auto-generated method stub
		TypedQuery<MatriculaDTO> myQuery = this.entityManager.createQuery("SELECT NEW com.example.demo.repository.modelo.dto.MatriculaDTO(e.estudiante.nombre,e.materia.nombre) FROM Matricula e ",MatriculaDTO.class);
		

		
		return myQuery.getResultList();
		
	}

}
