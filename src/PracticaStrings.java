import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PracticaStrings {
	
	public static void main (String[] args) {
		
		ej10("123-FDLM");
		System.out.println(ej10("la concha de"));
		//contadorLetras();
	}
	/*
	 * Diseña una aplicación en la que el usuario introduzca una frase y el programa le indique cuántos espacios tiene.
	 */
	
	
	public static void ejercicio1() {
		Scanner teclado= new Scanner(System.in);
		System.out.println ("Ingresa una frase y te diré cuantos espacios tiene");
		String frase=teclado.nextLine();
		
		String[] arrayString= frase.split(" ");
		
		Arrays.sort(arrayString);
		
		int espacios=arrayString.length-1;
		System.out.println("En esta frase hay: "+espacios+" espacios");
		
		
	}
	/*
	 * Diseña una función en la que el usuario introduzca una frase y ésta devuelva e imprima por pantalla la misma frase pero invertida.
	 *  Ejemplo: Para “hola buenos dias” devolvería “said soneub aloh”
	 */
	public static void ejercicio2() {
		Scanner teclado= new Scanner(System.in);
		System.out.println ("Ingresa una frase y te invertiré el orden de sus letras");
		String frase=teclado.nextLine();
		
		for (int i= frase.length()-1;i>=0;i--) {
			System.out.print(frase.charAt(i));
		}
		//char[] arrayString= new char[];

		
	}
	
	
	/*
	 * Escribe una función que pida el nombre completo al usuario y lo  muestre sin vocales. Ejemplo: Para “Jose” mostraría “Js”.
	 */
	public static void ejercicio3 () {
		Scanner teclado= new Scanner(System.in);
		System.out.println ("Ingresa tu nombre completo y eliminaré sus vocales");
		String frase=teclado.nextLine();
		String fraseTotal="";
		for (int i=0;i<frase.length();i++) {
			if (frase.charAt(i)!='a' && frase.charAt(i)!='e' && frase.charAt(i)!='i' && frase.charAt(i)!='o' && frase.charAt(i)!='u'&& frase.charAt(i)!='A' && frase.charAt(i)!='E' && frase.charAt(i)!='I' && frase.charAt(i)!='O' && frase.charAt(i)!='U'  ) {
				fraseTotal+=frase.charAt(i);
			}
		}
		System.out.print(fraseTotal);
		
		
	}
	/*
	 *   Diseñar una función que solicite al usuario una frase y una palabra. El programa le dirá al usuario cuántas veces aparece
	 * la palabra en la frase. Ten en cuenta que dos palabras 
	 * pueden estar separados por más caracteres que el espacio simple, como, por ejemplo, la coma y el punto.
	 */
	
	public static void ejercicio4() {
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("Ingresa una frase");
		String frase= teclado.nextLine();
		System.out.println("Ahora ingresa una plabra y te diré cuantas veces se encuentra en tu frase");
		String palabra= teclado.nextLine();
		int contador=0;
		for (int i=0;i<frase.length();i++) {
			
			boolean regionPalabra=frase.regionMatches(i, palabra, 0, palabra.length());
			//System.out.print(regionPalabra);
			if (regionPalabra==true) {
				contador++;
			}
		}
		System.out.println("La palabra se repite "+contador+" veces en tu frase");
	}
	
	/*
	 * Escribe un programa que solicite al usuario dos palabras y le diga si dos palabras son anagramas una de otra.
	 *  Recordatorio: una palabra es un anagrama de otra si una se puede construir con las mismas letras que la otra,
	 *   pero cambiadas de orden. Ejemplo: amor, roma y ramo son anagramas.
	 */
	public static void ejercicio5() {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Escribe una palabra");
		String palabra1= teclado.nextLine();
		System.out.println("Ahora escribe otra palabra y te diré si es un anagrama de la primera");
		String palabra2= teclado.nextLine();
		int resultado1=0, resultado2=0;
		boolean coincide=false;
		palabra1.toLowerCase();
		palabra2.toLowerCase();
		char[] p1=palabra1.toCharArray();
		char[] p2=palabra2.toCharArray();
		
		if (p1.length==p2.length) {
			for (int i=0;i<p1.length;i++) {
				resultado1+=p1[i];
				resultado2+=p2[i];
			}
		}else {
			resultado1=1;
		}
	    coincide=resultado1==resultado2;
		System.out.println(coincide);
		
	}
	
	/*
	 * Diseña un programa que para un texto que introducirá el usuario por teclado, le indique cuántas veces se repite cada letra.
	 */
	public static void ejercicio6() {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Ingresa una frase y te diré cuántes veces se repite cada letra");
		String frase=teclado.nextLine();
		int contador=0;
		char caracter='a';
		String recuentoLetra="";
		frase.toLowerCase();
		
		for (int i=0;i<frase.length();i++) {
			caracter=frase.charAt(i);
			contador=0;
			for (int j=0;j<frase.length();j++) {
				if(caracter==frase.charAt(j)) {
					contador++;
					//System.out.println("La letra: "+caracter+" se repite "+contador+" veces");
				}
				//System.out.println("La letra: "+caracter+" se repite "+contador+" veces");
			}
			
			System.out.println("La letra: "+caracter+" se repite "+contador+" veces");
		}
		
	}
	public static void contadorLetras() {
		//La posicion 0 almacena cuantas 'a' hay.
		//la posicion 1 cuántas 'b'
		//la posicion 25 almacena cuántas 'z' hay
		//la posición 26 (última) almacena cuántas ñ hay (de momento nos olvidamos)
		int[] repeticiones=new int[27];
		int valorLetra=-1;
		Scanner teclado=new Scanner(System.in);
		System.out.println("Ingresa una frase y te diré cuántes veces se repite cada letra");
		String frase=teclado.nextLine();
		frase=frase.toLowerCase();
		
		for(int i=0;i<frase.length();i++) {			
			if(Character.isLetter(frase.charAt(i))&&frase.charAt(i)!='ñ') {
				valorLetra=(int)frase.charAt(i);
				repeticiones[valorLetra-97]++;
			}
			if(frase.charAt(i)=='ñ') {
				repeticiones[26]++;
			}
		}
		char letra;
		for(int i=0;i<repeticiones.length-1;i++) {
			letra=(char)(97+i);
			System.out.println(letra+":"+repeticiones[i]);
			if(letra=='n') {
				System.out.println("ñ:"+repeticiones[26]);
			}
		}
	}
	/*
	 * Implementa una aplicación que, una vez introducido un texto, permita reemplazar todas las ocurrencias de una palabra por otra distinta. 
	 */
	public static void ejercicio7 () {
		Scanner teclado=new Scanner(System.in) ;
		System.out.println("Escribe un texto en el que se repita una palabra");
		String texto=teclado.nextLine();
		System.out.println("Ahora escritbe la palabra que se repite en el texto anterior");
		String palabraRepetida=teclado.nextLine();
		System.out.println("Ahora escribe la palabra por la que quieres reemplazar a la anterior");
		String palabraNueva= teclado.nextLine();
		
		String resultado=texto.replaceAll(palabraRepetida, palabraNueva);
		System.out.println(resultado);
		
	}
	
	
	/*
	 * Crea un programa que lea una frase  del usuario por teclado y muestre una frase que contenga las mismas palabras pero en la que éstas estén ordenadas de manera alfabética. Ejemplo: Para “El despertador es rojo” mostraría “despertador el es rojo”.
	 */
	public static void ejercicio8() {
		Scanner teclado=new Scanner (System.in);
		System.out.println ("Escribe una frase y te la devolveré ordenada alfabéticamente");
		String frase= teclado.nextLine();
		String[] arrayString= frase.split(" ");
		
		
		Arrays.sort(arrayString);
		System.out.println(Arrays.toString(arrayString));
		for (String valor:arrayString) {
			System.out.print(valor+" ");
		}
		
	}
	/*
	 * Diseña una aplicación que implemente una pequeña agenda. Mediante un menú, el usuario podrá:
1-Añadir un nuevo contacto (con nombre y teléfono)
2-Buscar un teléfono de un contacto a partir de un nombre.
3-Mostrar la información de todos los contactos ordenados alfabéticamente por nombre.
Puedes codificar el nombre y el teléfono en una única cadena mediante “nombre:teléfono”.

	 */
	public static void ejercicio9() {
		Scanner teclado=new Scanner (System.in);
		int ingreso=0;
		String ingresoFrase;
		String acumulador="";
		String [] contactos={};
		System.out.println("Bienvenido/a a tu agenda personal");
		do {
			System.out.println("Menú: \n 1.Añadir un nuevo contacto (con nombre y teléfono) \n 2.Buscar un teléfono de un contacto a partir de un nombre. \n 3.Mostrar la información de todos los contactos ordenados alfabéticamente por nombre.\n 4.Salir");
			ingreso=teclado.nextInt();
			if (ingreso==1) {
				teclado.nextLine();
				System.out.println("Ingresa el nuevo contacto en el siguiente orden 'Nombre' 'Teléfono'.");
				ingresoFrase=teclado.nextLine();
				acumulador+=ingresoFrase+",";
				contactos=acumulador.split(",");
			//	System.out.println(Arrays.toString(contactos));
			//	System.out.println(contactos[0]);
			}
			if (ingreso==2) {
				teclado.nextLine();
				System.out.println("Ingresa Nombre del contacto a buscar.");
				ingresoFrase=teclado.nextLine();
				boolean encontrado=false , resultado=false;
				for (int i=0;i<contactos.length;i++) {
					encontrado=contactos[i].contains(ingresoFrase);
					if (encontrado==true) {
						System.out.println(contactos[i]);
						resultado=true;
						continue;
					}
					if (!resultado) {
						System.out.println("No se han encontrado resultados.");
						break;
					}
				}
			}
			if (ingreso==3) {
				teclado.nextLine();
				Arrays.sort(contactos);
				for(String valor:contactos) {
					System.out.println(valor);
				}
			}
			
		}while(ingreso!=4);
		System.out.println("Hasta luego");
	}
	// 			HOJA DE TAREAS 6 EXTENSION
	
	public static void ej1() {
		LocalDate fecha=LocalDate.of(2023, 2, 8);
		DateTimeFormatter formato= DateTimeFormatter.ofPattern("d/MM/yyyy");
		DateTimeFormatter formato2= DateTimeFormatter.ofPattern("d/M/yyyy");
		DateTimeFormatter formato3= DateTimeFormatter.ofPattern("d/MM/yyyy");
		DateTimeFormatter formato4= DateTimeFormatter.ofPattern("d/MMMM/yy");
		DateTimeFormatter formato5= DateTimeFormatter.ofPattern("d' de 'MMMM 'del 'yyyy");
		DateTimeFormatter formato6= DateTimeFormatter.ofPattern("'Dia:'d 'Mes:'MMMM 'año:'yyyy");
		DateTimeFormatter formato7= DateTimeFormatter.ofPattern("d-MMMM-yyyy");
		DateTimeFormatter formato8= DateTimeFormatter.ofPattern("dd/MM/yy");

		System.out.println(fecha.format(formato)); 
		System.out.println(fecha.format(formato2)); 
		System.out.println(fecha.format(formato3)); 
		System.out.println(fecha.format(formato4)); 
		System.out.println(fecha.format(formato5)); 
		System.out.println(fecha.format(formato6)); 
		System.out.println(fecha.format(formato7)); 
		System.out.println(fecha.format(formato8));
	}
	public static void ej2() {
		LocalDateTime fecha=LocalDateTime.of(2023, 2, 8, 9, 8,36);
		DateTimeFormatter formato= DateTimeFormatter.ofPattern("h:mm:ss");
		DateTimeFormatter formato2= DateTimeFormatter.ofPattern("h'h' mm'min' ss's'");
		DateTimeFormatter formato3= DateTimeFormatter.ofPattern("'Son las 'h 'horas y 'mm 'minutos'");
		
		System.out.println(fecha.format(formato));
		System.out.println(fecha.format(formato2));
		System.out.println(fecha.format(formato3));
	}
	public static void ej3() {
		LocalDate  fecha = LocalDate.of(2014, 5, 6);
		DateTimeFormatter formato= DateTimeFormatter.ofPattern("d 'de' MMMM 'de' yyyy");
		System.out.println(fecha.format(formato));
	}
	public static void ej4() {
		LocalDateTime fecha= LocalDateTime.of(2022, 12, 18, 16, 00);
		DateTimeFormatter formato=DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy 'a las ' HH:mm 'horas'");
		System.out.println(fecha.format(formato));
	}
	public static void ej5() {
		LocalDate fechaActual= LocalDate.now();
		LocalDate fechaFin=LocalDate.of(fechaActual.getYear(), 12, 31);
		long cantidadDias= ChronoUnit.DAYS.between(fechaActual, fechaFin);
		System.out.println("Faltan "+cantidadDias+" días para que termine el año actual");
	}
	public static void ej6() {
		LocalDate fechaxBox= LocalDate.of(2020, 11, 10);
		LocalDate fechaActual=LocalDate.now();
		Period p = Period.between(fechaxBox, fechaActual);
		int dias=p.getDays(), meses=p.getMonths(),anyos=p.getYears();
		System.out.println("Desde el lanzamiento de la Xbox Series X, pasaron "+dias+" días,"+meses+" meses,"+anyos+" años.");
	}
	public static void ej7() {
		Scanner teclado= new Scanner(System.in);
		System.out.println("Escribe tu fecha de cumpleaños del año pasado en el formato dd/mm/yyyy y te dire cuanto falta para tu cumpleaños.");
		String fecha=teclado.nextLine();
		String[] fechaSplit= fecha.split("/");
		//System.out.println(Arrays.toString(fechaSplit));
		int anyo=Integer.parseInt(fechaSplit[2]);
		int mes=Integer.parseInt(fechaSplit[1]);
		int dia=Integer.parseInt(fechaSplit[0]);
		//System.out.println(dia+" "+mes+" "+anyo);
		//LocalDate fechaCumple=LocalDate.of(anyo, mes,dia);
		anyo++;
		LocalDate fechaActual=LocalDate.now();
		LocalDate fechaCumpleFinal=LocalDate.of(anyo, mes, dia);
		Period p = Period.between(fechaActual, fechaCumpleFinal);
		
		int dias=p.getDays(), meses=p.getMonths(),anyos=p.getYears();
		//System.out.println(dias+" "+meses);
		System.out.println("Para tu cumple de este año faltan "+dias+" días, y "+meses+" meses");
	}
	public static void ej8(double valor) {
		DecimalFormat formato=new DecimalFormat("#.##");
		System.out.println(formato.format(valor));
		
	}
	public static void ej9(double valor) {
		DecimalFormat formato=new DecimalFormat("0.000");
		System.out.println(formato.format(valor));
		
	}
	public static boolean ej10(String matricula) {
		String expresion="^[0-9]{4}-[B-DF-HJ-NP-TV-Z]{3}$";
		boolean resultado= Pattern.matches(expresion, matricula);
		return resultado;
	}
	public static boolean ej11(String frase) {
		String expresion="^[A-Za-z]+\s[A-Za-z]+\s[A-Za-z]+$";
		//               "^[a-zA-Z]+\s[a-zA-Z]+\s[a-zA-Z]+$"
		boolean resultado=Pattern.matches(expresion, frase);
		return resultado;
	}
	
}
