package model;

import java.util.Iterator;

public class FilmeIterator implements Iterator<String> {

	int index = 0;
	FilmeRepository filmeRepository= new FilmeRepository();

	
	public boolean hasNext() {
		if(index < filmeRepository.getFilmes().length) {
			return true;
		}
		return false;
	}


	public String next() {
		if(this.hasNext()) {
			return filmeRepository.getFilmes()[index++];
		}
		return null;
	}

}
