package clasesYObjetos;

import java.time.LocalDate;

public class Calendario {
	
	protected int dia;
	protected int mes;
	protected int anyo;
	
	
	
	public Calendario() {
		super();
		LocalDate fecha=LocalDate.now();
		this.dia=fecha.getDayOfMonth();
		this.mes=fecha.getMonthValue();
		this.anyo=fecha.getYear();
	}

	public Calendario(int dia, int mes, int anyo) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.anyo = anyo;
	}

	public Calendario(int dia, int mes) {
		super();
		LocalDate anyo=LocalDate.now();
		this.dia = dia;
		this.mes = mes;
		this.anyo= anyo.getYear();
	}
	
	public void incrementarDia() {
		this.dia++;
		if (this.mes==1 | this.mes==3 | this.mes==5 | this.mes==7 | this.mes==8 | this.mes==10 && this.dia==32) {
			dia=1;
			mes++;
		}
		if (this.mes==4 | this.mes==6 | this.mes==9 | this.mes==11 && this.dia==31) {
			dia=1;
			mes++;
		}
		if (this.mes==2 && dia==29) {
			dia=1;
			mes++;
		}
		if (this.mes==12 && this.dia==32) {
			dia=1;
			mes=1;
			anyo++;
		}	
	}
	
	public void incrementarMes() {
		mes++;
		if (mes==13) {
			mes=1;
			anyo++;
		}
	}
	public void incrementarAño(int cantidad) {
		this.anyo+=cantidad;
		
	}
	public void mostrar() {
		String [] meses= {"enero", "febrero", "marzo" , "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
		String resultado= "Es el "+this.dia+" de "+meses[this.mes-1]+" de "+this.anyo;
		System.out.println(resultado);
	}
	public boolean equals(Calendario otraFecha) {
		boolean iguales= false;
		if(this.dia==otraFecha.dia && this.mes==otraFecha.mes && this.anyo==otraFecha.anyo) {
			iguales=true;
		}
		return iguales;
	}

}
