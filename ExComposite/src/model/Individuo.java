package model;

public class Individuo extends Participante{

	private String nome;
	private String assento;
	
	public Individuo() {
		super();
	}
	
	public Individuo(String nome) {
		super();
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAssento() {
		return assento;
	}
	public void setAssento(String assento) {
		this.assento = assento;
	}

	@Override
	public String toString() {
		return  "\n   Participante:"
				+ "nome:" + nome ;
	}
	
	
	
}
