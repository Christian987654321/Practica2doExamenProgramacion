package deportistas;

import java.time.LocalDate;

import deportistas.Deportista.Sexo;

public class Futbolista extends Deportista {

	private String equipo;
	private String posicion;
	
	public Futbolista(String nombre, LocalDate fechaNacimiento, double altura, double peso, Sexo sexo, String equipo, String posicion) {
		super(nombre,fechaNacimiento,altura,peso,sexo);
		this.equipo = equipo;
		this.posicion=posicion;

	}

	
	
	
	
	public Futbolista(String nombre, String equipo, String posicion) {
		super(nombre);
		this.equipo = equipo;
		this.posicion=posicion;

	}





	public String getEquipo() {
		return equipo;
	}





	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}





	public String getPosicion() {
		return posicion;
	}





	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}




}