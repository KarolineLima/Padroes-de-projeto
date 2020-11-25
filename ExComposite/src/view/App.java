package view;

import model.CongressoComposite;
import model.Individuo;
import model.Instituicao;
import model.Participante;

public class App {

	public static void main(String[] args) {
		
		CongressoComposite congresso = new CongressoComposite();
		congresso.setTotalAssentos(20);

		Participante p1 = new Individuo("A");	
		Participante p2 = new Individuo("B");	
		Participante p3 = new Individuo("C");
		Participante p4 = new Individuo("D");

		Participante instituicao = new Instituicao("IFPB");
		instituicao.addParticipante(p2);
		instituicao.addParticipante(p4);
		
		congresso.addParticipante(instituicao);
		congresso.addParticipante(p1);
		congresso.addParticipante(p3);
		
		
		System.out.println(congresso);
	}

}
