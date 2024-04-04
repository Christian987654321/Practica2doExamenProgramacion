package personal;

public class Mecanicos {
	
	public String nombre;
	public int telefono;
	public enum Especialidad {frenos,hidraulica,electricidad,motor};
	public Especialidad especialidad;
	
	public Mecanicos(String nombre, int telefono, Especialidad especialidad) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.especialidad = especialidad;
	}
	
	
	
	//su nombre, , teléfono, y especialidad, que podrá ser frenos, hidráulica, electricidad o motor. 
	//Deberás utilizar una variable enumerada para esto.


}
