package com.example.demo.repository.modelo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="alumno")
public class Alumno {
	@Id
	@SequenceGenerator(name = "seq_alumno", sequenceName = "seq_alumno", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_alumno")
	@Column(name="alum_id")
	private Integer id;
	@Column(name="alum_nombre")
	private String nombre;
	
	@OneToMany(mappedBy="alumno",cascade = CascadeType.ALL)
	private List<Matricula> matriculas;

	@Override
	public String toString() {
		return "Alumno [id=" + id + ", nombre=" + nombre + ", matriculas=" + matriculas + "]";
	}

	//Set and Get
	
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Matricula> getMatriculas() {
		return matriculas;
	}

	public void setMatriculas(List<Matricula> matriculas) {
		this.matriculas = matriculas;
	}
	
	
	
	
	
	
}
