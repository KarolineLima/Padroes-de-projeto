package model;

public class PublicacaoRevista extends Publicacao{

	private String artigo;

	
	public PublicacaoRevista(Implementacao impl, String titulo, String autor) {
		super(impl, titulo, autor);
	}

	public String getArtigo() {
		return artigo;
	}

	public void setArtigo(String artigo) {
		this.artigo = artigo;
	}

	@Override
	public String toString() {
		return "Publicação da Revista:"
				+ "\n Autor: " + getAutor()
				+ "\n Título: " + getTitulo()
				+ "\n Publicação: " + publicar(getTitulo())
				;
	}

	
	
	
	
}
