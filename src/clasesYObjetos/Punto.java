package clasesYObjetos;

public class Punto {
	
	protected double x;
	protected double y;
	
	public Punto(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	public void desplazaX(double dx) {
		this.x+=dx;
	}
	public void desplazaY(double dy) {
		this.y+=dy;
	}
	
	public void desplaza(double dx,double dy) {
		this.x+=dx;
		this.y+=dy;
	}
	public double distancia(Punto otro) {
		double resultado= Math.sqrt(Math.pow(otro.x - this.x , 2) + Math.pow(otro.y - this.y, 2)) ;
		return resultado;
		
	}
	public void muestra() {
		String resultado="El punto está en coordenada "+this.x+" X,"+this.y+" Y.";
		System.out.println(resultado);
	}
	
	
	
	
	
	
	
	
	
	

}
