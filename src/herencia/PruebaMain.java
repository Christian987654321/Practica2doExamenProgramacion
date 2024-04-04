package herencia;

public class PruebaMain {
	public static void main (String[] args) {
		
		pruebaCaja();
		
		
	}
	public static void pruebaHoraExacta() {
		HoraExacta h1= new HoraExacta(21, 23, 42);
		HoraExacta h2= new HoraExacta(23, 59, 59);
		HoraExacta h3= new HoraExacta(21, 23, 42);
		HoraExacta h4= new HoraExacta(21, 23, 42);
		
		System.out.println(h1.equals(h2));
		h2.setHora(26);
		h2.setMinutos(60);
		h2.inc();
		h2.setSegundo(65);
		System.out.println(h2.toString());
	}
	
	public static void pruebaCaja() {
		Caja c1=new Caja(4, 2.5, 2.3, Caja.Unidad.cm);
		Caja c2=new Caja(4, 2.5, 2.3,"Para juan", Caja.Unidad.cm);

		System.out.println(c1.getVolumen());
		System.out.println(c2.setEtiqueta("Esto es para probar si entra una etiqueta de mas de 30 caracteres"));
		c1.setEtiqueta("Para Paco");
		System.out.println(c2.toString());
		System.out.println(c1.toString());
	}

}
