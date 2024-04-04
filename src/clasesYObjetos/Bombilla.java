package clasesYObjetos;

public class Bombilla {
	
	private boolean interParticular;
	private static boolean interGeneral; // general atributo estatico
	
	public Bombilla() {
		super();
	}
	
	public void setEncender() {
			this.interParticular=true;
		
	}
	public void setApagar() {
		this.interParticular=false;
	}
	
	public boolean estado() {
		boolean estado=interParticular && interGeneral; //aquí la condicion, particular nunca cambia por eso retorna a su estado anterior,
		return estado;									//lo que cambia es el general, que al activar y desactivar hace que la bombilla cambie
		
	}
	
	public static boolean encenderGeneral() { // general metodo estatico
		interGeneral=true;
		return interGeneral;
	}
	public static boolean apagarGeneral() {
		interGeneral=false;
		return interGeneral;
	}
	public void print() {
		System.out.println("Interruptor particular: "+this.interParticular+", Interruptor general: "+this.interGeneral);

	}

}
