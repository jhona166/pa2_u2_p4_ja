package com.example.demo.repository.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="hotel")
public class Hotel {
	
	@Id
	@Column(name="hote_id")
	private Integer id;
	@Column(name="hote_nombre")
	private String nombre;
	@Column(name="hote_habitacion")
	private String habitacion;
	
	
	
	@Override
	public String toString() {
		return "Hotel [id=" + id + ", nombre=" + nombre + ", habitacion=" + habitacion + "]";
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
	public String getHabitacion() {
		return habitacion;
	}
	public void setHabitacion(String habitacion) {
		this.habitacion = habitacion;
	}
	
}
