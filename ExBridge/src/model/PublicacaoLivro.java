package model;

public class PublicacaoLivro extends Publicacao{

	private String ISBN;
	
	public PublicacaoLivro(Implementacao impl, String titulo, String autor) {
		super(impl, titulo, autor);
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	
	@Override
	public String toString() {
		return "Publicação do Livro:"
				+ "\n Autor: " + getAutor()
				+ "\n Título: " + getTitulo()
				+ "\n Publicação: " + publicar(getTitulo())
				;
	}
	
	
}
