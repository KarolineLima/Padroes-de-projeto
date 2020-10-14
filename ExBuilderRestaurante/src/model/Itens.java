package model;

public class Itens {


	private String batata;
	private String sanduiche;
	private String brinquedo;
	private String refrigerante;

	
	public Itens() {
		super();
	}

	public Itens(String batata, String sanduiche, String brinquedo, String refrigerante) {
		super();
		this.batata = batata;
		this.sanduiche = sanduiche;
		this.brinquedo = brinquedo;
		this.refrigerante = refrigerante;
	}
	
	public String getBatata() {
		return batata;
	}
	public void setBatata(String batata) {
		this.batata = batata;
	}
	public String getSanduiche() {
		return sanduiche;
	}
	public void setSanduiche(String sanduiche) {
		this.sanduiche = sanduiche;
	}
	public String getBrinquedo() {
		return brinquedo;
	}
	public void setBrinquedo(String brinquedo) {
		this.brinquedo = brinquedo;
	}
	public String getRefrigerante() {
		return refrigerante;
	}
	public void setRefrigerante(String refrigerante) {
		this.refrigerante = refrigerante;
	}

	@Override
	public String toString() {
		return "Itens [batata=" + batata + ", sanduiche=" + sanduiche + ", brinquedo=" + brinquedo + ", refrigerante="
				+ refrigerante + "]";
	}

	
	
	
	
}
