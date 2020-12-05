package model;

import java.util.Iterator;

public class EsporteIterator implements Iterator<String> {

	int index = 0;
	EsporteRepository esporteRepository= new EsporteRepository();

	
	public boolean hasNext() {
		if(index < esporteRepository.getEsportes().length) {
			return true;
		}
		return false;
	}


	public String next() {
		if(this.hasNext()) {
			return esporteRepository.getEsportes()[index++];
		}
		return null;
	}

}
