package model;

import java.util.ArrayList;
import java.util.List;

public class CongressoComposite implements Congresso{

	List<Participante> participantes = new ArrayList<Participante>();
	
	private int totalAssentos;

	
	public CongressoComposite() {
		super();
	}
	
	public void addParticipante(Participante p) {
		if(totalAssentos > 0) {
			if(p.getMembros() == null) {
				System.out.println("Participante adicionado");
				participantes.add(p);
				totalAssentos--;
			}else {
				int membros = p.getMembros().size();
				if(membros <= totalAssentos) {
					System.out.println("Participante adicionado");
					participantes.add(p);
					totalAssentos -= membros;
				}
			}
		}
	}
	
	
	
	public int totalParticipantes() {
		int total = 0;
		for (Participante participante : participantes) {
			if (participante.getMembros() != null) {
				total += participante.getMembros().size();
			} else {
				total++;
			}
		}
		
		return total;
		
	}
	

	public int getTotalAssentos() {
		return totalAssentos;
	}

	public void setTotalAssentos(int totalAssentos) {
		this.totalAssentos = totalAssentos;
	}
	


	@Override
	public String toString() {
		return "\nCongresso Composite "
				+"\n"
				+ "\n Participantes Cadastrados : " + participantes.toString()
				+ "\n"
				+ "\n Assentos Disponíveis:" + getTotalAssentos()
				+ "\n Assentos Preenchidos:" + totalParticipantes()
				;
	}

	
	
	
	
}
