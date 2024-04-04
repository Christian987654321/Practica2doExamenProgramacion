package repasoExamenClase;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CorreccionDeEjercicios {
	
	public static void main (String[] args) {
		
		System.out.println(validarTelefonoValladolid("983959888"));
		System.out.println(validarDni("98656532S"));
		
	}
	public static void ejercicio1() {
		LocalDateTime h1= LocalDateTime.now();
		DateTimeFormatter a = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String fecha= h1.format(a);
		System.out.println(fecha);
		// Period para obtener periodos entre una fecha y otra
		LocalDate fecha1=LocalDate.now();
		LocalDate fecha2=LocalDate.of(1990, 9, 28);
		Period p=Period.between(fecha2,fecha1);
		p.getDays();
		p.getMonths();
		p.getYears();
		System.out.print(p.getDays()+"dias"+ p.getMonths()+"meses"+p.getYears()+"años");
		
	}
	public static int ejercicio2(String palabra) {
		int valor=0;
		char letra=0;
		for (int i=0;i<palabra.length();i++) {
			//primero sacamos la letra a estudiar.
			letra=palabra.charAt(i);
			switch (letra) {
			case 'a','e','i','l','n','o','r','s','t','u':
				valor+=1;
				break;
			case 'd','g':
				valor+=2;
				break;
			case 'b','c','m','p':
				valor+=3;
				break;
			case 'f','h','v','y':
				valor+=4;
				break;
			case 'q':
				valor+=5;
				break;
			case 'j','ñ','x':
				valor+=8;
				break;
			case 'z':
				valor+=10;
				break;
			
			default:
				System.out.println ("valor fuera de rango");
			}	
		}
		System.out.println("Total: "+valor);
		return valor;
	}
	public static int ejercicio2v2(String palabra) {
		int[] valores = {1,3,3,2,1,4,2,4,1,8,1,3,1,1,3,5,1,1,1,1,4,8,0,4,10,8};
		int valor=0;
		int letra=0;
		palabra=palabra.toLowerCase();
			for(int i=0;i<palabra.length();i++) {
				//paso la letra char a su valor decimal en unicode
				letra=(int) palabra.charAt(i);
				if (letra==241) {
					valor+=8;
				}else {
					System.out.println(valores[letra-97]);
					valor+=valores[letra-97];
				}
			}
		return valor;
	}
	public static void ejercicio2real() {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce una frase");
		String frase=teclado.nextLine();
		frase=frase.toLowerCase();
		//vamos a dividir la frase en las palabras que contiene
		String[] palabras=frase.split(" ");
		String fraseFinal="";
		for (String palabra:palabras) {
			if (palabra.length()<=2) {
				fraseFinal+=palabra+" ";
			}else if (palabra.length()>=3 && palabra.length()<=5) {
				fraseFinal+=palabra.toUpperCase()+" ";
			}else {
				palabra=Character.toUpperCase(palabra.charAt(0))+palabra.substring(1,palabra.length()-1)+Character.toUpperCase(palabra.charAt(palabra.length()-1));
				// metodo 2 usando array de chars
				char[] arrayLetras=palabra.toCharArray();
				arrayLetras[0]=Character.toUpperCase(arrayLetras[0]);
				arrayLetras[arrayLetras.length-1]=Character.toUpperCase(arrayLetras[arrayLetras.length-1]);
				// el resto de letras No las modifico
				palabra=String.valueOf(arrayLetras);
				fraseFinal+=palabra+" ";	
			}
		}
		System.out.println(fraseFinal);
	}
	public static String cesar(String palabra, int avance) {
		char[] letras= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};
		int posLetra=-1;
		int posLetraNueva=-1;
		char [] array=palabra.toCharArray();
		for (int i=0;i<array.length;i++) {
			if(!Character.isLetter(array[i])) {
				continue;
			}
			if(array[i]<='n') {
				posLetra=array[i]-97;
			}
			else if (array[i]=='ñ') {
				posLetra=14;
			}else if (array[i]>'n') {
				posLetra=array[i]-96;
			}
			//de momento no contemplamos el pasarnos de la z
			posLetraNueva=posLetra+avance;
			
			posLetraNueva=posLetraNueva%27;// por si nos pasamos"letra z"
			
			array[i]=letras[posLetraNueva];
			
		}
		String cadena=String.valueOf(array);
		System.out.println(cadena);
		return cadena;
	}
	
	public static void ejercicio4() {
		LocalDate fecha1=LocalDate.of(2024, 2, 1);
		DateTimeFormatter formato= DateTimeFormatter.ofPattern("d/M/yyyy");
		DateTimeFormatter formato2= DateTimeFormatter.ofPattern("d/MMMM/yy");
		DateTimeFormatter formato3= DateTimeFormatter.ofPattern("d' de 'MMMM' de ' yyyy");
		DateTimeFormatter formato4= DateTimeFormatter.ofPattern("'Dia: 'd'; Mes='MMMM'; Año 'yyyy");
		//String fecha= fecha1.format(formato);
		System.out.println(fecha1.format(formato));
		System.out.println(fecha1.format(formato2));
		System.out.println(fecha1.format(formato3));
		System.out.println(fecha1.format(formato4));
		
		LocalDateTime fechaHora= LocalDateTime.now();
		DateTimeFormatter formatoHora=DateTimeFormatter.ofPattern("hh:mm:ss");
		System.out.println(fechaHora.format(formatoHora));

		
	}
	public static void ejercicio5() {
		LocalDate fechaActual=LocalDate.now();
		LocalDate fechaCumple=LocalDate.of(1987, 3, 25);
		Period p=Period.between(fechaCumple, fechaActual);
		
		System.out.println("Dias: "+p.getDays()+"\nMes: "+p.getMonths()+ "\nAños: "+p.getYears());
		
		// ChronoUnit Saca la medida independiente de Cada Cosa entre una fecha y otra
		long years= ChronoUnit.YEARS.between(fechaCumple, fechaActual);
		long months= ChronoUnit.MONTHS.between(fechaCumple, fechaActual);
		long days= ChronoUnit.DAYS.between(fechaCumple, fechaActual);
		System.out.println(years);
		System.out.println(months);
		System.out.println(days);
	}
	
	public static boolean validarMatricula(String matricula) {
		String patron="^[0-9]{4}-[B-DF-HJ-NP-TV-Z]{3}$";
		//compilamos el patron
		Pattern patronC=Pattern.compile(patron);
		//enlazamos patron con la expresion
		Matcher match=patronC.matcher(patron);
		//verificamos con el boolean el resultado
		boolean resultado=match.matches();
		//Podemos hacer lo mismo pero en una lina
		boolean resultado2=Pattern.matches(patron, matricula);// MEJOR ESTA
		return resultado;
	}
	
	public static boolean validarTelefonoValladolid (String telefono) {
		String patron="^(983)[0-9]{6}$";
		boolean resultado=Pattern.matches(patron, telefono);
		return resultado;
	}
	public static boolean validarDni(String dni) {
		//IOUÑ no van
		String patron="^[0-9]{8}[A-HJ-NP-TV-Z]{1}$";
		boolean resultado=Pattern.matches(patron, dni);
		
		return resultado;
	}
	

}
