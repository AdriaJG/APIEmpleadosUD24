/**
 * 
 */
package com.example.demo.dto;

/**
 * @author Fenrir
 *
 */
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.example.demo.statics.*;
@Entity
@Table(name="empleado")

public class Empleado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private Long id;
	@Column(name = "nombre")//no hace falta si se llama igual
	private String nombre;
	@Column(name = "trabajo")
	private Trabajos trabajo;
	
	public Empleado() {
		
	}
	
	//@param id
	//@param nombre
	//@param trabajo

	public Empleado(String nombre, Trabajos trabajo) {
		super();
		this.nombre = nombre;
		this.trabajo = trabajo;
		System.out.println(Trabajos.BECARIO.name());
	}
	
	//@return
	public Long getId() {
		return id;
	}
	
	//@param
	public void setId(Long id) {
		this.id = id;
	}

	//@return
	public String getNombre() {
		return nombre;
	}

	//@param
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//@return
	public Trabajos getTrabajo() {
		return trabajo;
	}

	//@param
	public void setTrabajo(Trabajos trabajo) {
		this.trabajo = trabajo;
	}

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", trabajo=" + trabajo + "]";
	}
	
	
}
