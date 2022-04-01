package com.ejercicio.cuentas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.ejercicio.cuentas.dto.CuentasDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Cuentas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nombre_cliente;
	private String ciudad;
	private String ocupacion;
	
	public CuentasDto ToDto() {
		return new CuentasDto(id,nombre_cliente,ciudad,ocupacion);
	}
	
}