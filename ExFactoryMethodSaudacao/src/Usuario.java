
public class Usuario {

	String nome;

	public Usuario(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public String saudacoes() {
		return "Bem-vindo "+this.nome;
	}
	

		
}
