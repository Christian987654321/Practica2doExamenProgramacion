package abstracta;

public class Gato extends Animal{
	
	private String color;

	public Gato(String nombre, int edad, String color) {
		super(nombre, edad);
		this.color=color;
	}

	@Override
	public void expresarse() {
		System.out.print("miau!");
		
	}

}
