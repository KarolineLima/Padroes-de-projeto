package model;

public class ImplementacaoXml implements Implementacao {

	public ImplementacaoXml() {}
	
	public String gerarTipo(String titulo) {
		return (titulo + ".xml");
	}
}
