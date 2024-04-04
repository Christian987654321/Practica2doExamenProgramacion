package deportistas;

import java.time.LocalDate;

public class Tenista extends Deportista {
	

	private String nacionalidad;
	private short totalGrandSlams;

	
	public Tenista(String nombre, String nacionalidad, short totalGrandSlams) {
		super(nombre);
		this.nacionalidad=nacionalidad;
		this.totalGrandSlams=totalGrandSlams;
	}
	
	public Tenista(String nombre, LocalDate fechaNacimiento, double altura, double peso, Sexo sexo, String nacionalidad, short totalGrandSlams) {
		super(nombre, fechaNacimiento, altura, peso, sexo);
		this.nacionalidad=nacionalidad;
		this.totalGrandSlams=totalGrandSlams;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public short getTotalGrandSlams() {
		return totalGrandSlams;
	}

	public void setTotalGrandSlams(short totalGrandSlams) {
		this.totalGrandSlams = totalGrandSlams;
	}

	
	
	//clase Tenista: Añade los atributos nacionalidad (String) y totalGrandSlams (short).

}
