
public class FactorySaudacoes {

	String genero;
	
	
	public FactorySaudacoes(String genero) {
		this.genero = genero;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Usuario getSaudacao(String nome) {
		
		if(genero.equals("Feminino")) {
			return new Mulher(nome) ;
		}
		
		else if(genero.equals("Masculino")) {
			return new Homem(nome);
		}
	
		else 
			return new Usuario(nome);
	}

}
