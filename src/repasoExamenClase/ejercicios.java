package repasoExamenClase;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ejercicios {
	
	public static void main (String[] args) {
		
		//String palabra="POLLO";
		//int resultado=calcularValorPalabra(palabra);
		//System.out.println(resultado);
		ejercicio2();
	}
	
	public static int calcularValorPalabra(String palabra) {
		int resultado=0;
		char[] letras = {'A','B','C','D','E','F','G','H','I','J','L','M','N','Ñ','O','P','Q','R','S','T','U','V','X','Y','Z'};
		for (int i=0;i<palabra.length();i++) {
		
			if (palabra.charAt(i)==letras[0] | palabra.charAt(i)==letras[4] | palabra.charAt(i)==letras[8] | palabra.charAt(i)==letras[10] | palabra.charAt(i)==letras[12] | palabra.charAt(i)==letras[14] | palabra.charAt(i)==letras[17] | palabra.charAt(i)==letras[18] | palabra.charAt(i)==letras[19] | palabra.charAt(i)==letras[20] ) {
			resultado+=1;//0 4 8 10 12 14 17 18 19 20
			}
			if (palabra.charAt(i)==letras[3] | palabra.charAt(i)==letras[6]) {
			resultado+=2;// 3 6
			}
			if (palabra.charAt(i)==letras[1] | palabra.charAt(i)==letras[2] | palabra.charAt(i)==letras[11] | palabra.charAt(i)==letras[15]) {
			resultado+=3;// 1 2 11 15 
			}
			if (palabra.charAt(i)==letras[5] | palabra.charAt(i)==letras[7] | palabra.charAt(i)==letras[21] | palabra.charAt(i)==letras[23]) {
			resultado+=4;//5 7 21 23
			}
			if (palabra.charAt(i)==letras[16]) {
			resultado+=5;//16
			}
			if (palabra.charAt(i)==letras[9] | palabra.charAt(i)==letras[13] | palabra.charAt(i)==letras[22]) {
			resultado+=8;//9 13 22
			}
			if (palabra.charAt(i)==letras[24] ) {
			resultado+=10;//24
			}
		}
		return resultado;
	}
	/*
 Ejercicio 2 (x puntos)  Escribe una función que pida por pantalla una frase al usuario y le muestre el resultado de
  aplicar la siguiente transformación a la frase:
Si la palabra tiene dos letras o menos, la palabra aparecerá en minúsculas.
Si la palabra tiene entre 3 y 5 letras, la palabra aparecerá en mayúsculas.
Si la palabra tiene más de 5 letras, la palabra tendrá la primera y última letra en mayúsculas y el resto en minúsculas.
Por ejemplo, la frase “el gato gris recorre el alfeizar de la ventana a todas horas” quedaría transformada en:
“el GATO GRIS RecorrE el AlfeizaR de la VentaA a TODAS HORAS”
Se asume que la frase solo contiene letras y espacios.

Además, la función debe calcular cuál es la palabra más larga y la más corta.

	 */
	public static void ejercicio2() {
		/*
		LocalDate fecha1=LocalDate.now();
		LocalDate fecha2=LocalDate.of(1990, 9, 28);
		Period p=Period.between(fecha2,fecha1);
		p.getDays();
		p.getMonths();
		p.getYears();
		System.out.print(p.getDays()+"dias"+ p.getMonths()+"meses"+p.getYears()+"años");
		*/
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe una frase");
		String frase=teclado.nextLine();
		String[] array=frase.split(" ");
		//System.out.println(array[0].length());
		//System.out.println(array[0].toLowerCase());
		//System.out.println(Arrays.toString(array));
		String a=(String)"a";
		 
		
		
		for (int i=0;i<array.length;i++) {
		
			if(array[i].length()<3) {
				array[i]=array[i].toLowerCase();
			}
			if(array[i].length()>2 && array[i].length()<6) {
				array[i]=array[i].toUpperCase();
			}
			if (array[i].length()>5) {
			//	array[i]=Character.toUpperCase(array[i].charAt(0))+array[i].substring(1,array[i].length()-1)+Character.toUpperCase(array[i].charAt(array[i].length()-1));
				//substring corta un trozo del string original
				char[] letras=array[i].toCharArray();
				letras[0]=Character.toUpperCase(letras[0]);
				letras[letras.length-1]=Character.toUpperCase(letras[letras.length-1]);
				//Con cualquiera de estas dos formas creamos un String a partir de un array de chars.
				array[i]=String.valueOf(letras);
				array[i]=new String(letras);
			}
		}
			for (String valor:array) {
				System.out.print(valor+" ");
		}
			// Pattern a=Pattern.compile(expresion);
			// Matcher b= a.matcher(cadena);
			// boolean loqsea=b.matches();
	}
	
	

//p=PeriodBetween(fecha1,fecha2)
	
	
	
	
	
	
	

}
