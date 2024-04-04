package clasesYObjetos;

public class PruebaMain {
	public static void main (String[] args) {
		
		pruebaLista();
	}
	
	public static void pruebaCalendario() {
		Calendario c1= new Calendario();
		Calendario c2= new Calendario(02,03);
		Calendario c3= new Calendario(31,12,2012);
		Calendario c4= new Calendario();
		c1.mostrar();
		c2.mostrar();
		c3.mostrar();
		
		c2.incrementarAño(2);
		c2.incrementarDia();
		c2.incrementarMes();
		c2.mostrar();
		
		c3.incrementarMes();
		c3.mostrar();
		System.out.println(c1.equals(c2));
	}
	public static void pruebaPunto() {
		Punto p1=new Punto(2.5,7.8);
		Punto p2=new Punto(3.2,9.5);
		
		p1.desplazaX(1);
		p1.desplazaY(1);
		p2.desplaza(1, 1);
		p1.muestra();
		p2.muestra();
		
		System.out.println(p1.distancia(p2));
		
	}
	
	public static void pruebaHora() {
		
		Hora h1=new Hora(23,59);
		Hora h2=new Hora(22,10);
		Hora h3=new Hora(22,10);
		
		h1.inc();
		h2.inc();
		h3.setHora(11);
		h3.setMinutos(1);
		System.out.println(h1.toString());
		System.out.println(h2.toString());
		System.out.println(h3.toString());

	}
	public static void pruebaBombilla() {
		
		Bombilla b1=new Bombilla();
		Bombilla b2=new Bombilla();
		Bombilla b3=new Bombilla();
		Bombilla b4=new Bombilla();
		
		Bombilla.encenderGeneral();
		b1.setEncender();
		b2.setEncender();
		b3.setEncender();
		
		System.out.println(b1.estado());
		System.out.println(b2.estado());
		System.out.println(b3.estado());
		System.out.println(b4.estado());
		System.out.println("***********");
		b1.apagarGeneral();
		System.out.println(b1.estado());
		System.out.println(b2.estado());
		System.out.println(b3.estado());
		System.out.println(b4.estado());
		System.out.println("***********");
		b1.encenderGeneral();
		System.out.println(b1.estado());
		System.out.println(b2.estado());
		System.out.println(b3.estado());
		System.out.println(b4.estado());
		
	}
	public static void pruebaLista() {
		
		Lista l1=new Lista();
		l1.insertAlFinal(10);
		l1.insertAlFinal(32);
		l1.insertAlPrincipio(56);
		l1.insertEnPosicion(100, 3);
		l1.mostrar();
		Lista l2=new Lista();
		l2.insertAlFinal(11);
		l2.insertAlFinal(35);
		l2.insertAlPrincipio(65);
		l2.insertEnPosicion(104, 3);
		l2.mostrar();
		
		l1.aniadirOtraLista(l2);
		l1.mostrar();
		
		l1.eliminarElementoEnPosicion(3);
		l1.mostrar();
		l1.obtenerElemento(2);
		System.out.println(l1.buscarEnLista(35));
	
		Lista.concatena(l1, l2).mostrar();;
	
		
	}

}
