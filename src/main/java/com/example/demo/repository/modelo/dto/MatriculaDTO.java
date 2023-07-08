package com.example.demo.repository.modelo.dto;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.repository.modelo.Materia;

public class MatriculaDTO {

	private Estudiante estudiante;
	private Materia materia;
	
	
	
	
	
	@Override
	public String toString() {
		return "MatriculaDTO [estudiante=" + estudiante + ", materia=" + materia + "]";
	}


	
	public MatriculaDTO(Estudiante estudiante, Materia materia) {
		super();
		this.estudiante = estudiante;
		this.materia = materia;
	}



	public Estudiante getEstudiante() {
		return estudiante;
	}


	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}


	public Materia getMateria() {
		return materia;
	}


	public void setMateria(Materia materia) {
		this.materia = materia;
	}


	public void MatriculaDTO() {
	
}
}
