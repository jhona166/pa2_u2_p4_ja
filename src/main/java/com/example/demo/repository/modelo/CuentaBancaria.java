package com.example.demo.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="cuenta_bancaria")
public class CuentaBancaria {

	@SequenceGenerator(name="seq_cuenta",sequenceName = "seq_cuenta",allocationSize = 1)
	@GeneratedValue(generator ="seq_cuenta",strategy = GenerationType.SEQUENCE )
	@Id
	@Column(name="cuen_id")
	private Integer id;
	
	@Column(name="cuen_numero")
	private String numero;
	@Column(name="cuen_tipo")
	private String tipo;
	@Column(name="cuen_fecha")
	private String cedula;
	@Column(name="cuen_cedula")
	
	private LocalDateTime fechaDeApertura;
	@Column(name="cuen_saldo")
	private BigDecimal saldo;
	
	
	
	
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	//Set and Get
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public LocalDateTime getFechaDeApertura() {
		return fechaDeApertura;
	}
	public void setFechaDeApertura(LocalDateTime fechaDeApertura) {
		this.fechaDeApertura = fechaDeApertura;
	}
	public BigDecimal getSaldo() {
		return saldo;
	}
	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}
	@Override
	public String toString() {
		return "CuentaBancaria [id=" + id + ", numero=" + numero + ", tipo=" + tipo + ", fechaDeApertura="
				+ fechaDeApertura + ", saldo=" + saldo + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
}
