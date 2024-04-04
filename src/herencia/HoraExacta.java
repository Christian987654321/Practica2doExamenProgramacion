package herencia;

public class HoraExacta extends Hora {

	private int segundos;
	

	public HoraExacta(int hora, int minuto, int segundos) {
		super(hora, minuto);
		this.segundos = segundos;
	}
	
	public boolean setSegundo(int valor) {
		boolean resultado=false;
		if(valor<60) {
			this.segundos=valor;
			resultado=true;
		}
		return resultado;
	}
	@Override
	public void inc() {
		segundos++;
		if(segundos==60) {
			segundos=0;
			minuto++;
			if(minuto==60) {
				minuto=0;
				hora++;
				if(hora==24) {
					hora=0;
				}
			}
		}
	}
	@Override
	public boolean equals(Object o) {
		HoraExacta he = (HoraExacta) o ;
		boolean coincide=this.hora==he.hora && this.minuto==he.minuto && this.segundos==he.segundos;
		return coincide;
		
	}

}
