package com.example.demo.repository.modelo;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="empleado")
@NamedQuery(name="Empleado.buscarPorApellido",query="SELECT e FROM Empleado e WHERE e.apellido=:datoApellido")
public class Empleado {

	@SequenceGenerator(name="seq_empleado",sequenceName = "seq_empleado",allocationSize = 1)
	@GeneratedValue(generator ="seq_empleado",strategy = GenerationType.SEQUENCE )
	
	@Id
	@Column(name="empl_id")
	private Integer id;
	
	
	@Column(name="empl_sueldo")
	private BigDecimal sueldo;
	@Column(name="empl_cargo")
	private String cargo;
	@Column(name="empl_cedula")
	private String cedula;
	@Column(name="empl_edad")
	private String edad;
	@Column(name="empl_genero")
	private String genero;
	@Column(name="empl_apellido")
	private String apellido;
	//cascade=CascadeType.ALL
	@OneToOne()
	@JoinColumn(name="empl_ciudadano_id")
	private Ciudadano ciudadano;



	
	
	/**
	 * @return the edad
	 */
	public String getEdad() {
		return edad;
	}
	/**
	 * @param edad the edad to set
	 */
	public void setEdad(String edad) {
		this.edad = edad;
	}

	
	

	
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	@Override
	public String toString() {
		return "Empleado [id=" + id + ", sueldo=" + sueldo + ", cargo=" + cargo + ", cedula=" + cedula + ", edad="
				+ edad + ", genero=" + genero + ", apellido=" + apellido + "]";
	}
	/**
	 * @return the genero
	 */
	public String getGenero() {
		return genero;
	}
	/**
	 * @param genero the genero to set
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}
	//Set and get
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public BigDecimal getSueldo() {
		return sueldo;
	}
	public void setSueldo(BigDecimal sueldo) {
		this.sueldo = sueldo;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	
	
	public Ciudadano getCiudadano() {
		return ciudadano;
	}


	public void setCiudadano(Ciudadano ciudadano) {
		this.ciudadano = ciudadano;
	}
	/**
	 * @return the cedula
	 */
	public String getCedula() {
		return cedula;
	}


	/**
	 * @param cedula the cedula to set
	 */
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	
}
