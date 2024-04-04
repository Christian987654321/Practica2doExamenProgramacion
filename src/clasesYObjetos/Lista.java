package clasesYObjetos;

import java.util.Arrays;

public class Lista {
	
	public int[] arrayEnteros= new int [0];

	public Lista() {
		super();
	}
	
	public int length() {
		 return arrayEnteros.length;
		
	}
	
	public void insertAlFinal(int valor) {
		arrayEnteros=Arrays.copyOf(arrayEnteros, arrayEnteros.length+1);
		arrayEnteros[arrayEnteros.length-1]=valor;
	}
	public void insertAlPrincipio(int valor) {
		arrayEnteros=Arrays.copyOf(arrayEnteros, arrayEnteros.length+1);
		arrayEnteros[arrayEnteros.length-1]=valor;
		int aux=0;
		for (int i=arrayEnteros.length-1;i>0;i--) {
			aux=arrayEnteros[i];
			arrayEnteros[i]=arrayEnteros[i-1];
			arrayEnteros[i-1]=aux;
		}
	}
	public void mostrar() {
		System.out.println(Arrays.toString(arrayEnteros));
	}

	public void insertEnPosicion (int elemento, int posicion) {
		arrayEnteros=Arrays.copyOf(arrayEnteros, arrayEnteros.length+1);
		arrayEnteros[arrayEnteros.length-1]=elemento;
		int aux=0;
		for (int i=arrayEnteros.length-1;i>posicion;i--) {
			aux=arrayEnteros[i];
			arrayEnteros[i]=arrayEnteros[i-1];
			arrayEnteros[i-1]=aux;
		}
	}
	
	public void aniadirOtraLista(Lista otraLista) {
		int [] otra=new int[0];
		int aux=-1;
		for (int i=0;i<arrayEnteros.length+otraLista.length();i++) {
			if (i<arrayEnteros.length) {
				otra=Arrays.copyOf(otra, otra.length+1);
				otra[otra.length-1]=arrayEnteros[i];
			}
			if(i>arrayEnteros.length) {
				aux++;
				otra=Arrays.copyOf(otra, otra.length+1);
				otra[otra.length-1]=otraLista.arrayEnteros[aux];
			}
		}
		arrayEnteros=otra;
	}
	
	public void eliminarElementoEnPosicion(int posicion) {
		int [] aux= new int[0];
		for(int i=0;i<arrayEnteros.length;i++) {
			if (i!=posicion) {
				aux=Arrays.copyOf(aux, aux.length+1);
				aux[aux.length-1]=arrayEnteros[i];
			}
		}
		arrayEnteros=aux;
	}
	public int obtenerElemento (int indice) {
		System.out.println(arrayEnteros[indice]);
		return arrayEnteros[indice];
	}
	/*
	 * Buscar un número en la lista, devolviendo el índice del primer elemento donde se encuentre
	 *  Se devolverá -1 si el número no ha sido encontrado.
	 */
	public int buscarEnLista(int numero) {
		int resultado=-1;
		for (int i=0;i<arrayEnteros.length;i++) {
			if (arrayEnteros[i]==numero) {
				resultado=i;
				break;
			}
		}
		return resultado;
	}
	public static Lista concatena(Lista l1,Lista l2) {
		Lista li= new Lista();
		int [] otra=new int[0];
		int aux=-1;
		for (int i=0;i<l1.length()+l2.length()+1;i++) {
			if (i<l1.length()) {
				otra=Arrays.copyOf(otra, otra.length+1);
				otra[otra.length-1]=l1.arrayEnteros[i];
			}
			if(i>l1.length()) {
				aux++;
				otra=Arrays.copyOf(otra, otra.length+1);
				otra[otra.length-1]=l2.arrayEnteros[aux];
			}
		}
		li.arrayEnteros=otra;
		return li;
		
		
	}

	
	
	
	
	
	
}
