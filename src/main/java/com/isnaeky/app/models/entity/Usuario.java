package com.isnaeky.app.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

//Clase para crear o utilizar una tabla de BD  
@Entity // Para saber que es una clase de persistencia tambien es llamada clase entity
@Table(name = "usuario") // nombre de la tabla si no se pone toma el nombre de la clase
public class Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;

	// @Size(min = 4 , max = 12)//Para crear un rango de un string
	@NotEmpty // para que funcione con spring boot 2.3.. se tiene que agregar la dependencia
				// de spring-boot-starter-validation si no podra acceder a las validaciones
	private String email;

	// @Size(min = 4 , max = 12)//Para crear un rango de un string
	@NotEmpty // para que funcione con spring boot 2.3.. se tiene que agregar la dependencia
				// de spring-boot-starter-validation si no podra acceder a las validaciones
	private String pass;
	
	@NotEmpty
	private String nombre;
	
	@NotEmpty
	private String apellidoP;

	private String apellidoM;
	
	@NotEmpty
	private String sexo;
	
	@NotEmpty
	private String telefono;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")//formato de la fecha que deseamos poner 
	@Temporal(TemporalType.DATE) // para guardar el tipo de date
	@Column(name = "fechana")
	@NotNull
	private Date fechaNa;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoP() {
		return apellidoP;
	}

	public void setApellidoP(String apellidoP) {
		this.apellidoP = apellidoP;
	}

	public String getApellidoM() {
		return apellidoM;
	}

	public void setApellidoM(String apellidoM) {
		this.apellidoM = apellidoM;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Date getFechaNa() {
		return fechaNa;
	}

	public void setFechaNa(Date fechaNa) {
		this.fechaNa = fechaNa;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

}
