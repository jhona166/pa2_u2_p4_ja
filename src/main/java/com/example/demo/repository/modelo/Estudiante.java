package com.example.demo.repository.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQueries;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table(name="estudiante")
@Entity

@NamedQueries({
		@NamedQuery(name = "Estudiante.buscarPorApellido", query = "SELECT e FROM Estudiante e WHERE e.apellido=:datoApellido"),
		@NamedQuery(name = "Estudiante.buscarPorNombre", query = "SELECT e FROM Estudiante e WHERE e.nombre=:datoNombre") })

@NamedNativeQueries({
		@NamedNativeQuery(name = "Estudiante.buscarPorApellidoNative", query = "SELECT * FROM  Estudiante where estu_apellido=:datoApellido", resultClass = Estudiante.class),
		@NamedNativeQuery(name = "Estudiante.buscarPorNombreNative", query = "SELECT * FROM  Estudiante where estu_nombre=:datoNombre", resultClass = Estudiante.class) })
public class Estudiante {
	
	@SequenceGenerator(name="seq_estudiante",sequenceName = "seq_estudiante",allocationSize = 1)
	@GeneratedValue(generator ="seq_estudiante",strategy = GenerationType.SEQUENCE )
	@Id
	@Column(name="estu_id")
	private Integer id;
	
	
	@Column(name="estu_cedula")
	private String cedula;
	
	@Column(name="estu_nombre")
	private String nombre;
	
	@Column(name="estu_apellido")
	private String apellido;
	
	@Column(name="estu_peso")
	private Double peso;
	
	
	@Column(name="estu_cred_Aprobados")
	private Double credAprobados;
	
	
	@Column(name="estu_promedio")
	private Double promedio;
		
	
	
	@Override
	public String toString() {
		return "Estudiante [id=" + id + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", peso=" + peso + ", credAprobados=" + credAprobados + ", promedio=" + promedio + "]";
	}
	
	
	//Set and Get
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}

	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getCredAprobados() {
		return credAprobados;
	}
	public void setCredAprobados(Double credAprobados) {
		this.credAprobados = credAprobados;
	}
	public Double getPromedio() {
		return promedio;
	}
	public void setPromedio(Double promedio) {
		this.promedio = promedio;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	
	
	
}
