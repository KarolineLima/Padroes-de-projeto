package model;

import java.util.ArrayList;
import java.util.List;

public class Instituicao extends Participante{
	
	private String nome;
	private List<Participante> membros = new ArrayList<Participante>();
	

	
	public Instituicao() {
		super();
	}
	
	
	public Instituicao(String nome) {
		super();
		this.nome = nome;
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public void addParticipante(Participante p) {
		this.membros.add(p);
	}
	
	public List<Participante> getMembros() {
		return membros;
	}


	@Override
	public String toString() {
		return "\n" 
				+ "\n  Instituição " + nome 
				+" - Participantes da Instituição:" + membros 
				+"\n"
				+ "\n  Outros Participantes: " ;
	}
	
	
	
}
