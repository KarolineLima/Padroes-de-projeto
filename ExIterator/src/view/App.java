package view;

import java.util.Iterator;

import model.EsporteRepository;
import model.FilmeRepository;

public class App {

	public static void main(String[] args) {
		
		FilmeRepository filmeRepository = new FilmeRepository();
		EsporteRepository esporteRepository = new EsporteRepository();
		
		
		System.out.println("-----------CANAIS DE FILMES-----------");
		
		for(Iterator<String> iterator = filmeRepository.getIterator(); iterator.hasNext();) {
			String filme = iterator.next();
			System.out.println("Filme: " + filme);
		}
		
		
		System.out.println("");
		
		
		System.out.println("-----------CANAIS DE ESPORTES-----------");
		
		for(Iterator<String> iterator = esporteRepository.getIterator(); iterator.hasNext();) {
			String esporte = iterator.next();
			System.out.println("Esporte: " + esporte);
		}

	}

}
