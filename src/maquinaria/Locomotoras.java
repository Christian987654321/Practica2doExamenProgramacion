package maquinaria;

import personal.Mecanicos;

public class Locomotoras {
	
	protected int matricula;
	protected int potenciaMotor;
	protected int anyoFabricacion;
	protected Mecanicos mecanico;
	
	public Locomotoras(int matricula, int potenciaMotor, int anyoFabricacion, Mecanicos mecanico) {
		super();
		this.matricula = matricula;
		this.potenciaMotor = potenciaMotor;
		this.anyoFabricacion = anyoFabricacion;
		this.mecanico = mecanico;
	}
	


}
