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
	
	
	
	//su nombre, , tel�fono, y especialidad, que podr� ser frenos, hidr�ulica, electricidad o motor. 
	//Deber�s utilizar una variable enumerada para esto.


}
