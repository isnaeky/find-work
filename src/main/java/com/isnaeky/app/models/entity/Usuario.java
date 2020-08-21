package com.isnaeky.app.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

//Clase para crear o utilizar una tabla de BD  
@Entity // Para saber que es una clase de persistencia  tambien es llamada clase entity
@Table(name = "usuario") // nombre de la tabla si no se pone toma el nombre de la clase
public class Usuario implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	//@Size(min = 4 , max = 12)//Para crear un rango de un string 
	@NotEmpty//para que funcione con spring boot 2.3.. se tiene que agregar la dependencia de spring-boot-starter-validation si no podra acceder a las validaciones 
	private String user;
	
	
	//@Size(min = 4 , max = 12)//Para crear un rango de un string 
	@NotEmpty//para que funcione con spring boot 2.3.. se tiene que agregar la dependencia de spring-boot-starter-validation si no podra acceder a las validaciones 
	private String pass;


	/*public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}*/


	public String getUser() {
		return user;
	}


	public void setUser(String user) {
		this.user = user;
	}


	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}
	
	

}
