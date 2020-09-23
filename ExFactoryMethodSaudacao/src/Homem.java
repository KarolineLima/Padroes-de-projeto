
public class Homem extends Usuario{

	public Homem(String tipo) {
		super(tipo);
	}


	public String saudacoes() {
		return "Bem-vindo Sr."+this.nome;
	}
	

}
