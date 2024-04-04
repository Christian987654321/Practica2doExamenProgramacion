package maquinaria;

import personal.Maquinistas;

public class Trenes {
	
	private Locomotoras locomotora;
	private Maquinistas maquinista;
	private Vagones vagon;
	
	public Trenes(Locomotoras locomotora, Maquinistas maquinista, Vagones vagon) {
		super();
		this.locomotora = locomotora;
		this.maquinista = maquinista;
		this.vagon = vagon;
	}
	
	public Trenes(Locomotoras locomotora, Maquinistas maquinista, Vagones vagon, Vagones vagon2) {
		super();
		this.locomotora = locomotora;
		this.maquinista = maquinista;
		this.vagon = vagon;
		this.vagon = vagon2;
	}
	
	public Trenes(Locomotoras locomotora, Maquinistas maquinista, Vagones vagon, Vagones vagon2, Vagones vagon3) {
		super();
		this.locomotora = locomotora;
		this.maquinista = maquinista;
		this.vagon = vagon;
		this.vagon = vagon2;
		this.vagon = vagon3;
	}
	
	public Trenes(Locomotoras locomotora, Maquinistas maquinista, Vagones vagon, Vagones vagon2, Vagones vagon3, Vagones vagon4) {
		super();
		this.locomotora = locomotora;
		this.maquinista = maquinista;
		this.vagon = vagon;
		this.vagon = vagon2;
		this.vagon = vagon3;
		this.vagon = vagon4;
	}
	public Trenes(Locomotoras locomotora, Maquinistas maquinista, Vagones vagon, Vagones vagon2, Vagones vagon3, Vagones vagon4,Vagones vagon5) {
		super();
		this.locomotora = locomotora;
		this.maquinista = maquinista;
		this.vagon = vagon;
		this.vagon = vagon2;
		this.vagon = vagon3;
		this.vagon = vagon4;
		this.vagon = vagon5;
	}
	
	@Override
	public String toString() {
		String resultado="Matricula locomotora: "+this.locomotora.matricula+" .Conducida por :"+this.maquinista.nombre+".El primer vagon lleva: "+this.vagon.mercancia;
		System.out.println(resultado);
		return resultado;
	}
	


}
