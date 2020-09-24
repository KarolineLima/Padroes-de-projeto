package model;

public class Cabelo {

	private String estilo;
	private String cor;
	private String tamanho;

	public Cabelo() {
		super();
	}

	public Cabelo(String estilo, String cor, String tamanho) {
		super();
		this.estilo = estilo;
		this.cor = cor;
		this.tamanho = tamanho;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	@Override
	public String toString() {
		return "Cabelo [estilo=" + estilo + ", cor=" + cor + ", tamanho=" + tamanho + "]";
	}

	
}
