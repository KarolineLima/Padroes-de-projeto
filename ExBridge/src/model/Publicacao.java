package model;

public abstract class Publicacao {

	private Implementacao impl;
	
	private String titulo;
	private String autor;
	
	
	public Publicacao(Implementacao impl, String titulo, String autor) {
		this.impl = impl;
		this.titulo = titulo;
		this.autor = autor;
	}
	
	public String publicar(String titulo) {
		return impl.gerarTipo(titulo);
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		autor = autor;
	}
	
}
