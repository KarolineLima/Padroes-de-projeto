package model;

import java.util.Iterator;

public class EsporteRepository implements Repository {

	private String esportes[] = {"Fox Esportes", "SPORTV", "ESPN Brasil"};

	public Iterator<String> getIterator() {
		return new EsporteIterator();
	}

	public String[] getEsportes() {
		return esportes;
	}

	public void setEsportes(String[] esportes) {
		this.esportes = esportes;
	}
	
	
}
