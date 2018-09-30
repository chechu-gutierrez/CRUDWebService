package es.crud.ws.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Usuario {

	private String nif;
	private String nombre;
	private String apellidoUno;
	private String apellidoDos;
	
	public Usuario() {
		super();
	}
	
	public Usuario(String nif, String nombre, String apellidoUno, String apellidoDos) {
		super();
		this.nif = nif;
		this.nombre = nombre;
		this.apellidoUno = apellidoUno;
		this.apellidoDos = apellidoDos;
	}
	
	public String getNif() {
		return nif;
	}
	
	public void setNif(String nif) {
		this.nif = nif;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellidoUno() {
		return apellidoUno;
	}
	
	public void setApellidoUno(String apellidoUno) {
		this.apellidoUno = apellidoUno;
	}
	
	public String getApellidoDos() {
		return apellidoDos;
	}
	
	public void setApellidoDos(String apellidoDos) {
		this.apellidoDos = apellidoDos;
	}
	
}
