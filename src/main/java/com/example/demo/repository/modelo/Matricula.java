package com.example.demo.repository.modelo;

import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="matricula")
public class Matricula {
	@Id
	@SequenceGenerator(name = "seq_matricula", sequenceName = "seq_matricula", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_matricula")
	@Column(name="mtla_id")
	private Integer id;
	@Column(name="mtla_fecha")
	private LocalDateTime fecha;
	@Column(name="mtla_numero")
	private String numero;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="mtla_id_alumno")
	private Alumno alumno;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="mtla_id_materia")
	private Materia materia;
	
	
	
	@Override
	public String toString() {
		return "Matricula [id=" + id + ", fecha=" + fecha + ", numero=" + numero + ", alumno=" + alumno + ", materia="
				+ materia + "]";
	}
	//Set and Get
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Alumno getAlumno() {
		return alumno;
	}
	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
	public Materia getMateria() {
		return materia;
	}
	public void setMateria(Materia materia) {
		this.materia = materia;
	}
	
	
	
	
	
}