package ej2;

public class Entradas {
	
	int zonaPrincipal;
	int zonaPlateada;
	int zonaVip;
	
	
	public Entradas(int zonaPrincipal, int zonaPlateada, int zonaVip) {
		super();
		this.zonaPrincipal = zonaPrincipal;
		this.zonaPlateada = zonaPlateada;
		this.zonaVip = zonaVip;
	}


	public int getZonaPrincipal() {
		return zonaPrincipal;
	}


	public void setZonaPrincipal(int zonaPrincipal) {
		this.zonaPrincipal = zonaPrincipal;
	}


	public int getZonaPlateada() {
		return zonaPlateada;
	}


	public void setZonaPlateada(int zonaPlateada) {
		this.zonaPlateada = zonaPlateada;
	}


	public int getZonaVip() {
		return zonaVip;
	}


	public void setZonaVip(int zonaVip) {
		this.zonaVip = zonaVip;
	}


	@Override
	public String toString() {
		return "Entradas [zonaPrincipal=" + zonaPrincipal + ", zonaPlateada=" + zonaPlateada + ", zonaVip=" + zonaVip
				+ "]";
	}
	
	

}
