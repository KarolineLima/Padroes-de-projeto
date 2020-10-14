package view;
import model.Funcionario;
import model.Itens;
import model.PedidoBuilder;

public class Atendimento {

	
	 public static void main(String[] args) {
	
		Itens itens = new Itens();
		itens.setSanduiche("cheeseburger");
		itens.setBatata("batata média");
		itens.setBrinquedo("boneca");
		itens.setRefrigerante("guaraná");
		
		Funcionario funcionario = new Funcionario("Maria");

		PedidoBuilder pedido = new PedidoBuilder();
		pedido.setFuncionario(funcionario);
		pedido.setItens(itens);
		
		pedido.dentroDaCaixa();
		pedido.foraDaCaixa();
		
		System.out.println(pedido);
	
	}
}
