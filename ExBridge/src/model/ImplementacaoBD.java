package model;

public class ImplementacaoBD implements Implementacao {

	public ImplementacaoBD() {}
	
	public String gerarTipo(String titulo) {
		return (titulo + ".BD");
	}

}
