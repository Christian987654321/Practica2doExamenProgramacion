package maquinaria;

public class Vagones {

	protected int idVagon;
	protected double cargaMax;
	protected double cargaActual;
	protected String mercancia;
	
	public Vagones(int idVagon, double cargaMax, double cargaActual, String mercancia) {
		super();
		this.idVagon = idVagon;
		this.cargaMax = cargaMax;
		this.cargaActual = cargaActual;
		this.mercancia = mercancia;
	}
	
	
	
	
	//Tienen un n�mero que los identifica, una carga m�xima en kilos, la carga actual y el tipo de mercancia que transportan.

}
