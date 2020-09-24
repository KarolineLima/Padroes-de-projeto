package model;

public class Avatar {

	private String nome;
	private int id;
	private float fortuna;
	private Cabelo cabelo;
	private Vestimenta roupa;

	public Avatar() {}

	public Avatar(String nome, int id, float fortuna, Cabelo cabelo, Vestimenta roupa) {
		super();
		this.nome = nome;
		this.id = id;
		this.fortuna = fortuna;
		this.cabelo = cabelo;
		this.roupa = roupa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getFortuna() {
		return fortuna;
	}

	public void setFortuna(float fortuna) {
		this.fortuna = fortuna;
	}

	public Cabelo getCabelo() {
		return cabelo;
	}

	public void setCabelo(Cabelo cabelo) {
		this.cabelo = cabelo;
	}

	public Vestimenta getRoupa() {
		return roupa;
	}

	public void setRoupa(Vestimenta roupa) {
		this.roupa = roupa;
	}

	@Override
	public String toString() {
		return "Avatar [nome=" + nome + ", id=" + id + ", fortuna=" + fortuna + ", cabelo=" + cabelo + ", roupa="
				+ roupa + "]";
	}

	
	

}
