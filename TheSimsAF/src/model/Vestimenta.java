package model;

public class Vestimenta {

	private String camisa;
	private String sapato;
	private String acessorio;

	public Vestimenta() {
		super();
	}

	public Vestimenta(String camisa, String sapato, String acessorio) {
		super();
		this.camisa = camisa;
		this.sapato = sapato;
		this.acessorio = acessorio;
	}

	public String getCamisa() {
		return camisa;
	}

	public void setCamisa(String camisa) {
		this.camisa = camisa;
	}

	public String getSapato() {
		return sapato;
	}

	public void setSapato(String sapato) {
		this.sapato = sapato;
	}

	public String getAcessorio() {
		return acessorio;
	}

	public void setAcessorio(String acessorio) {
		this.acessorio = acessorio;
	}

	@Override
	public String toString() {
		return "Vestimenta [camisa=" + camisa + ", sapato=" + sapato + ", acessorio=" + acessorio + "]";
	}

	
	
}
