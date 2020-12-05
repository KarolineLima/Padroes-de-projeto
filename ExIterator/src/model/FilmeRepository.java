package model;

import java.util.Iterator;

public class FilmeRepository implements Repository {

	private String filmes[] = {"Telecine Premiun","Cinemax", "Megapix", "Paramount Channel", "HBO"};
	
	public Iterator<String> getIterator() {
		return new FilmeIterator();
	}

	public String[] getFilmes() {
		return filmes;
	}

	public void setFilmes(String[] filmes) {
		this.filmes = filmes;
	}

	

}
