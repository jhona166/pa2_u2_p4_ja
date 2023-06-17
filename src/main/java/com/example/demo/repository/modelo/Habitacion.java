package com.example.demo.repository.modelo;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="habitacion")
public class Habitacion {
	
	@Id
	@Column(name="habi_id")
	private Integer id;
	@Column(name="habi_numero")
	private String numero;
	@Column(name="habi_valor")
	private BigDecimal valor;
	
	
	
	private List<Habitacion> habitaciones;
	
	
}
