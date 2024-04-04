package abstracta;

public class Perro extends Animal {
	
	private enum Raza{PastorAleman,GoldenRetriever,Labrador,Yorkshire,ShibaInu};
	
	private int idChip;
	private Raza raza;
	
	
	
	public Perro(String nombre, int edad, int idChip, Raza raza) {
		super(nombre, edad);
		this.idChip= idChip;
		this.raza=raza;
	}

	@Override
	public void expresarse() {
		System.out.println("guau!");
		
	}
	

}
