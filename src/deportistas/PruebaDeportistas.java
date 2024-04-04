package deportistas;

import java.time.LocalDate;

import deportistas.Deportista.Sexo;

public class PruebaDeportistas {
	
	public static void main(String[] args) {
		
		pruebaDeportista();
		
	}
	public static void pruebaDeportista() {
		LocalDate fecha=LocalDate.of(1990, 9, 28);
		
		Deportista messi= new Deportista("Lionel Messi",fecha,1.68, 76.5, Deportista.Sexo.hombre);
		
		System.out.println(messi.toString());
		
	}

} 