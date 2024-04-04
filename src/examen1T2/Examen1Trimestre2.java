package examen1T2;
	import java.time.LocalDate;
	import java.time.LocalDateTime;
	import java.time.Period;
	import java.time.format.DateTimeFormatter;
	import java.util.Arrays;
	import java.util.Scanner;
	import java.util.regex.Pattern;

	public class Examen1Trimestre2 {
		public static void main (String[] args) {
			
			
			estadisticasFrase("aeiou asd");
			//System.out.println(calculadora("10x10"));
			
		}

		/*
		 * Escribe una función void tranformarFrase() que pida por pantalla una
	frase al usuario y le muestre el resultado de aplicar a esa frase la siguiente transformación:
	● Si la palabra tiene dos letras o menos, la palabra aparecerá en mayúsculas.
	● Si la palabra tiene 3 ó 4 letras, aparecerá en minúsculas.
	● Si la palabra tiene 5 letras, tendrá la primera y última letra en mayúsculas y el resto en
	minúsculas. Por ejemplo, “gasto” sería “GastO”.
	● Si la palabra tiene más de 6 letras, las letras que ocupan las posiciones pares
	aparecerán en mayúsculas y las que ocupan posiciones impares, en minúsculas. Se
	considera la posición 0 una posición para. Por ejemplo, “ventana” se transformaría en
	VeNtAnA
		 */
		public static void tranformarFrase() {
			Scanner teclado=new Scanner(System.in);
			System.out.println("Ingresa una frase");
			String frase=teclado.nextLine();
			String [] arrayFrase= frase.split(" ");
			
			for (int i=0; i<arrayFrase.length;i++) {
				if (arrayFrase[i].length()<=2) {
					arrayFrase[i]=arrayFrase[i].toUpperCase();
				}
				if (arrayFrase[i].length()==3 | arrayFrase[i].length()==4 ) {
					arrayFrase[i]=arrayFrase[i].toLowerCase();
				}
				if (arrayFrase[i].length()==5 ) {
					char principio='a', fnal='b';
					principio=arrayFrase[i].charAt(0);
					fnal=arrayFrase[i].charAt(arrayFrase[i].length()-1);
					principio=Character.toUpperCase(principio);
					fnal=Character.toUpperCase(fnal);
					String sub= arrayFrase[i].substring(1,arrayFrase[i].length()-1);
					arrayFrase[i]=principio+sub+fnal;
					System.out.println(arrayFrase[i].length());
				}
				if (arrayFrase[i].length()>= 6 ) {
					
					for(int j=0;j<arrayFrase[i].length();j++) {
						if (j==0 | j%2==0) {
							char cambio='a';
							cambio=arrayFrase[i].charAt(i);
							cambio=Character.toUpperCase(cambio);
							arrayFrase[i]="";
							arrayFrase[i]+=cambio;
						}else {
							char cambio='a';
							cambio=arrayFrase[i].charAt(i);
							cambio=Character.toUpperCase(cambio);
							arrayFrase[i]="";
							arrayFrase[i]+=cambio;
						}
						//System.out.println(arrayFrase[i].length());
					}
					//System.out.println(arrayFrase[i]);
					//System.out.println(arrayFrase[i].length());
				}
				
			}
			
			for (String valor:arrayFrase) {
				System.out.print(valor+ " ");
			}
		}
		
		public static void ejercicio4() {
			LocalDate fechaActual= LocalDate.now();
			DateTimeFormatter formato= DateTimeFormatter.ofPattern("dd/MM/yyyy");
			DateTimeFormatter formato1= DateTimeFormatter.ofPattern("d/M/yy");
			DateTimeFormatter formato2= DateTimeFormatter.ofPattern("d 'de' MMMM 'de 'yyyy");
			DateTimeFormatter formato3= DateTimeFormatter.ofPattern("d-MMMM-yy");
			
			System.out.println("Apartado A");
			System.out.println(formato.format(fechaActual));
			System.out.println(formato1.format(fechaActual));
			System.out.println(formato2.format(fechaActual));
			System.out.println(formato3.format(fechaActual));
			System.out.println(" ");

			LocalDateTime fechaMarzo= LocalDateTime.of(2017, 3, 1, 14, 30,17);
			DateTimeFormatter formatom= DateTimeFormatter.ofPattern("d/MM/yyyy 'a las' HH:mm:ss");
			DateTimeFormatter formatom1= DateTimeFormatter.ofPattern("HH:ss");
			DateTimeFormatter formatom2= DateTimeFormatter.ofPattern("'Son las 'HH'h y 'mm 'min del' d 'de' MMMM 'de' yyyy");
			System.out.println("Apartado B");
			System.out.println(formatom.format(fechaMarzo));
			System.out.println(formatom1.format(fechaMarzo));
			System.out.println(formatom2.format(fechaMarzo));
			System.out.println(" ");
			
			LocalDate fechaXBox= LocalDate.of(2020,11,10);
			Period p=Period.between(fechaXBox, fechaActual);
			System.out.println("Apartado C");
			System.out.println("La xbox series X salió al mercado hace "+p.getYears()+" años, "+p.getMonths()+" meses, "+p.getDays()+" días.");
			System.out.println(" ");
			
			LocalDate messi= LocalDate.of(1987,6,24);
			Period pe=Period.between(messi, fechaActual);
			System.out.println("Apartado D");
			System.out.println("Messi nació hace "+pe.getYears()+" años, "+pe.getMonths()+" meses, "+pe.getDays()+" días.");
			System.out.println(" ");
			
			LocalDate madrid= LocalDate.of(1966,5,11);
			Period per=Period.between(madrid, fechaActual);
			System.out.println("Apartado E");
			System.out.println("Desde que el Madrid gano la sexta Champion pasaron "+per.getYears()+" años, "+per.getMonths()+" meses, "+per.getDays()+" días.");
			System.out.println(" ");
		
		
		
		}
		public static int calculadora(String operacion) {
			int resultado=0;
			if (operacion.contains("+")) {
				String[] numeros=operacion.split("[+]");
				int a=Integer.parseInt(numeros[0]);
				int b=Integer.parseInt(numeros[1]);
				resultado=a+b;	
				System.out.println(a+"+"+b+" = "+resultado);
			}
			if (operacion.contains("-")) {
				String[] numeros=operacion.split("[-]");
				int a=Integer.parseInt(numeros[0]);
				int b=Integer.parseInt(numeros[1]);
				resultado=a-b;	
				System.out.println(a+"-"+b+" = "+resultado);
			}
			if (operacion.contains("x")) {
				String[] numeros=operacion.split("[x]");
				int a=Integer.parseInt(numeros[0]);
				int b=Integer.parseInt(numeros[1]);
				resultado=a*b;	
				System.out.println(a+"x"+b+" = "+resultado);
			}
			
			return resultado;
		}
		
		public static boolean verificarFrase(String frase) {
			String expresion="^[A-Z]{1}[a-z]{3,7}(\s[A-Z]{1}[a-z]{3,7}){2,4}$";
			Pattern.compile(expresion); 
			boolean resultado=frase.matches(expresion);
			
			return resultado;
		}
		
		public static void estadisticasFrase(String frase) {
			frase.toLowerCase();
			int contador=0 , contador2=0;
			char []  fraseArray=frase.toCharArray();
			for (int i=0;i<fraseArray.length;i++) {
				if (fraseArray[i]=='a' | fraseArray[i]=='e' | fraseArray[i]=='i' | fraseArray[i]=='o' | fraseArray[i]=='u') {
					contador++;
				}else if (fraseArray[i]!=' ') {
					contador2++;
				}
			}
			System.out.println("La frase contiene "+contador+" vocales");
			System.out.println("La frase contiene "+contador2+" consonantes");
			
			String[] fraseSplit=frase.split(" ");
			for (int i = 0;i< fraseSplit.length;i++) {
				
			}
		
			
			
		}
		
		
		
		
		
		
		
		
		
		
	}
// SUMADO A ESTO EL PAQUETE DEPORTISTAS
