package herencia;

public class Hora {

	protected int hora;
	protected int minuto;
	
	public Hora(int hora, int minuto) {
		super();
		this.hora = hora;
		this.minuto = minuto;
	}
	
	public void inc() {
		minuto++;
		if (minuto==60) {
			minuto=0;
			hora++;
			if (hora==24) {
				hora=0;
			}
		}
	}
	public void setMinutos(int valor) {
		if(valor<60) {
			this.minuto=valor;
		}
	}
	
	public boolean setHora(int valor) {
		boolean isPosible=false;
		if(valor<24) {
			this.hora=valor;
			isPosible=true;
		}
		return isPosible;
	}
	@Override
	public String toString() {
		String resultado=this.hora+":"+this.minuto;
		if (hora<10&& minuto<10) {
			resultado="0"+this.hora+":0"+this.minuto;
		}
		if (hora<10 && minuto>9) {
			resultado="0"+this.hora+":"+this.minuto;
		}
		if (hora>9 && minuto <10) {
			resultado=this.hora+":0"+this.minuto;
		}
		return resultado;
	}
	
	
	
	
	
	
	
	
	
	
	
}