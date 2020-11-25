package main;

import model.Confeitar;
import model.Cozimento;
import model.Embalagem;
import model.Entrega;
import model.Preparo;

public class ChainPatternDemo {

	
	private static Preparo encomenda(){ 
		
		Preparo cozimento = new Cozimento();
		Preparo confeitar = new Confeitar();
		Preparo embalagem = new Embalagem();
		Preparo entrega = new Entrega();

		cozimento.setProximaEtapa(confeitar);
		confeitar.setProximaEtapa(embalagem);
		embalagem.setProximaEtapa(entrega);
		entrega.setProximaEtapa(null);
		
		
		return cozimento;
	}
		
	 
	
	public static void main(String[] args) {
		Preparo encomenda = encomenda();
		
		encomenda.producao();

	}

}