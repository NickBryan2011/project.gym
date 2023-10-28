package com.project.gym.model;

public class Miembros {
    private int MiembroID;
    private String Nombre;
    private String Apellido;
    private int Edad;
    private String Sexo;
    private int TipoDoc ;
    private String NroDoc ;
    private String RazonSocial;
    private String CorreoElectronico ;
    private String Celular ;
    
    public Miembros() {
	}

	public Miembros(int miembroID, String nombre, String apellido, int edad, String sexo, int tipoDoc, String nroDoc,
			String razonSocial, String correoElectronico, String celular) {
		super();
		MiembroID = miembroID;
		Nombre = nombre;
		Apellido = apellido;
		Edad = edad;
		Sexo = sexo;
		TipoDoc = tipoDoc;
		NroDoc = nroDoc;
		RazonSocial = razonSocial;
		CorreoElectronico = correoElectronico;
		Celular = celular;
	}

	public int getMiembroID() {
		return MiembroID;
	}

	public void setMiembroID(int miembroID) {
		MiembroID = miembroID;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

	public String getSexo() {
		return Sexo;
	}

	public void setSexo(String sexo) {
		Sexo = sexo;
	}

	public int getTipoDoc() {
		return TipoDoc;
	}

	public void setTipoDoc(int tipoDoc) {
		TipoDoc = tipoDoc;
	}

	public String getNroDoc() {
		return NroDoc;
	}

	public void setNroDoc(String nroDoc) {
		NroDoc = nroDoc;
	}

	public String getRazonSocial() {
		return RazonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		RazonSocial = razonSocial;
	}

	public String getCorreoElectronico() {
		return CorreoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		CorreoElectronico = correoElectronico;
	}

	public String getCelular() {
		return Celular;
	}

	public void setCelular(String celular) {
		Celular = celular;
	}
    
    
    
}
