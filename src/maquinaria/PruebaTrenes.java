package maquinaria;

import personal.Maquinistas;
import personal.Mecanicos;

public class PruebaTrenes {
	
	public static void main(String[] args) {
	
	Mecanicos m1=new Mecanicos("Raul", 645532934, Mecanicos.Especialidad.motor);
	Maquinistas maqui=new Maquinistas("Jacinto", "Y986532E", 19000, "Jefe");
	Locomotoras l1=new Locomotoras(879865, 600, 2002, m1);
	
	Vagones v1=new Vagones(999, 25000, 18000, "Carbon");
	
	Trenes tren1= new Trenes(l1, maqui, v1);
	
	tren1.toString();

	}
}
