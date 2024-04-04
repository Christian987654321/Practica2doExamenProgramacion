package deportistas;

import java.time.LocalDate;
import java.time.Period;

public class Deportista {
	
	protected String nombre;
	protected LocalDate fechaNacimiento;
	protected double altura;
	protected double peso;
	public enum Sexo{hombre,mujer}
	private Sexo sexo;
	
	public Deportista(String nombre, LocalDate fechaNacimiento, double altura, double peso, Sexo sexo) {
		super();
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.altura = altura;
		this.peso = peso;
		this.sexo = sexo;
	}

	public Deportista(String nombre) {
		super();
		this.nombre = nombre;
	}

	public double calcularIMC() {
		double imc=this.peso/(Math.pow(altura, 2));
		
		return imc;
	}
	
	public int edad() {
		LocalDate fechaActual=LocalDate.now();
		Period p= Period.between(this.fechaNacimiento, fechaActual);
		
		return p.getYears();
	}
	@Override
	public String toString(){
		String resultado ="Nombre: "+this.nombre+ "| Fecha Nacimiento: "+this.fechaNacimiento+"| Altura: "+this.altura+"m| Peso: "+this.peso+"kg| Sexo: "+this.sexo ;
		//Nombre: Lionel Messi | Fecha Nacimiento: 24-06-1987| Altura: 1,68m| Peso: 75kg| Sexo: hombre
		return resultado;
	}
	
	
	
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	
	
	
	
	
	
	
/*
 * nombre (String), fechaNacimiento (LocalDate),
 *  altura (double),peso (double) y sexo (Sexo).
 *   La altura está en metros y el peso en kilogramos. 
 *   El Sexo será un enumerado con los valores “hombre” y “mujer”.
 *     Los atributos sólo serán directamente ccesibles desde clases del mismo paquete 
 *     y desde clases hijas. Así como los siguientes métodos:
	
 */
	

}