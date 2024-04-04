package herencia;

public class Caja {
	
	protected double alto;
	protected double ancho;
	protected double fondo;
	protected String etiqueta;
	public enum Unidad{cm,m};
	protected Unidad unidad;
	
	
	public Caja(double alto, double ancho, double fondo, Unidad unidad) {
		super();
		this.alto = alto;
		this.ancho = ancho;
		this.fondo = fondo;
		this.unidad = unidad;
	}
	
	
	public Caja(double alto, double ancho, double fondo, String etiqueta, Unidad unidad) {
		super();
		this.alto = alto;
		this.ancho = ancho;
		this.fondo = fondo;
		this.etiqueta = etiqueta;
		this.unidad = unidad;
	}


	public double getVolumen() {
		double resultado=this.alto*this.ancho*this.fondo;
		return resultado;
	}
	public boolean setEtiqueta(String etiqueta) {
		boolean isPosible=false;
		if(etiqueta.length()<31) {
			this.etiqueta=etiqueta;
			isPosible=true;
		}
		return isPosible;
	}
	@Override
	public String toString() {
		String resultado="Esta caja tiene altura: "+this.alto+" ,ancho: "+this.ancho+" ,fondo: "+this.fondo+"\nEtiqueta: "+this.etiqueta;
		return resultado;
	}
	

}
