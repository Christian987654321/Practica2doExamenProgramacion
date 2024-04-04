package abstracta;

public abstract class Animal {
	protected String nombre;
	protected int edad;
	
	public abstract void expresarse();


	public Animal(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}


	public final String getNombre() {
		return nombre;
	}

	public final void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public final int getEdad() {
		return edad;
	}

	public final void setEdad(int edad) {
		this.edad = edad;
	}

}
