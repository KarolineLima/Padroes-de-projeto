package model;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Pedido {

	private Funcionario funcionario;
	private Itens itens;
	private List<String> dentroDaCaixa = new ArrayList();
    private List<String> foraDaCaixa = new ArrayList();
    
    public Pedido() {
		super();
	}

	public Pedido(Funcionario funcionario, Itens itens) {
		super();
		this.funcionario = funcionario;
		this.itens = itens;
	}

	public void dentroDaCaixa() {}
	
	public void foraDaCaixa() {}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Itens getItens() {
		return itens;
	}

	public void setItens(Itens itens) {
		this.itens = itens;
	}

	public List<String> getDentroDaCaixa() {
		return dentroDaCaixa;
	}

	public void setDentroDaCaixa(List<String> dentroDaCaixa) {
		this.dentroDaCaixa = dentroDaCaixa;
	}

	public List<String> getForaDaCaixa() {
		return foraDaCaixa;
	}

	public void setForaDaCaixa(List<String> foraDaCaixa) {
		this.foraDaCaixa = foraDaCaixa;
	}

	@Override
	public String toString() {
		

		return "Pedido Entregue : \n"
				+ " Funcionário responsável pela produção do pedido: " + funcionario 
				+ "\n Produtos na Caixa: " + dentroDaCaixa 
				+ "\n Produtos fora da Caixa: " + foraDaCaixa 
				+ "\n Obrigado,volte sempre!";
	}
	
	
}
