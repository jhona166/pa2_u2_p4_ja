package com.example.demo.repository.modelo.dto;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.repository.modelo.Materia;

public class MatriculaDTO {

	private String  nombreAlumno;
	private String nombreMateria;
	
	public void MatriculaDTO() {
		
	}
	
	
	public MatriculaDTO(String estudiante, String materia) {
		super();
		this.nombreAlumno = estudiante;
		this.nombreMateria = materia;
	}


	@Override
	public String toString() {
		return "MatriculaDTO [estudiante=" + nombreAlumno + ", materia=" + nombreMateria + "]";
	}
	
	
	//Set and get
	/**
	 * @return the estudiante
	 */
	public String getEstudiante() {
		return nombreAlumno;
	}
	/**
	 * @param estudiante the estudiante to set
	 */
	public void setEstudiante(String estudiante) {
		this.nombreAlumno = estudiante;
	}
	/**
	 * @return the materia
	 */
	public String getMateria() {
		return nombreMateria;
	}
	/**
	 * @param materia the materia to set
	 */
	public void setMateria(String materia) {
		this.nombreMateria = materia;
	}
	

	//Set and Get
	
	
	
}
