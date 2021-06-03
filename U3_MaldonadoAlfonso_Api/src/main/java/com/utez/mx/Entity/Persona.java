package com.utez.mx.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="persona")
public class Persona {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idPersona;
	
	private String primerApellido;
	private String segundoApellido;
	private String nombre;
	private String rfc;
	private String curp;
	private String claveElector;
	private String entidadFederativa;
	private String municipio;
	private String colonia;
	private String calle;
	private int numeroExterior;
	private int numeroInterior;
	private String email;
	private String fechaRegistro;
	
	
	
	public Persona(int idPersona, String primerApellido, String segundoApellido, String nombre, String rfc, String curp,
			String claveElector, String entidadFederativa, String municipio, String colonia, String calle,
			int numeroExterior, int numeroInterior, String email, String fechaRegistro) {
		super();
		this.idPersona = idPersona;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.nombre = nombre;
		this.rfc = rfc;
		this.curp = curp;
		this.claveElector = claveElector;
		this.entidadFederativa = entidadFederativa;
		this.municipio = municipio;
		this.colonia = colonia;
		this.calle = calle;
		this.numeroExterior = numeroExterior;
		this.numeroInterior = numeroInterior;
		this.email = email;
		this.fechaRegistro = fechaRegistro;
	}
	public int getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}
	public String getPrimerApellido() {
		return primerApellido;
	}
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}
	public String getSegundoApellido() {
		return segundoApellido;
	}
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRfc() {
		return rfc;
	}
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}
	public String getCurp() {
		return curp;
	}
	public void setCurp(String curp) {
		this.curp = curp;
	}
	public String getClaveElector() {
		return claveElector;
	}
	public void setClaveElector(String claveElector) {
		this.claveElector = claveElector;
	}
	public String getEntidadFederativa() {
		return entidadFederativa;
	}
	public void setEntidadFederativa(String entidadFederativa) {
		this.entidadFederativa = entidadFederativa;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getColonia() {
		return colonia;
	}
	public void setColonia(String colonia) {
		this.colonia = colonia;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public int getNumeroExterior() {
		return numeroExterior;
	}
	public void setNumeroExterior(int numeroExterior) {
		this.numeroExterior = numeroExterior;
	}
	public int getNumeroInterior() {
		return numeroInterior;
	}
	public void setNumeroInterior(int numeroInterior) {
		this.numeroInterior = numeroInterior;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(String fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	
	
}
