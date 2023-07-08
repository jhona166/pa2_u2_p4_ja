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
@Table(name="hotel")
public class Hotel {
	
	@SequenceGenerator(name="seq_hotel",sequenceName = "seq_hotel",allocationSize = 1)
	@GeneratedValue(generator ="seq_hotel",strategy = GenerationType.SEQUENCE )	
	@Id
	@Column(name="hote_id")
	private Integer id;
	
	@Column(name="hote_nombre")
	private String nombre;
	
	@Column(name="hote_direccion")
	private String direccion;
	
	
	@OneToMany(mappedBy="hotel", cascade=CascadeType.ALL)
	private List<Habitacion> habitaciones;


	
	/**
	 * @return the habitaciones
	 */
	public List<Habitacion> getHabitaciones() {
		return habitaciones;
	}


	/**
	 * @param habitaciones the habitaciones to set
	 */
	public void setHabitaciones(List<Habitacion> habitaciones) {
		this.habitaciones = habitaciones;
	}


	

	@Override
	public String toString() {
		return "Hotel [nombre=" + nombre + "]";
	}


	//Set and get 
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}


	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
}
