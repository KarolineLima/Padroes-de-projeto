
public class Cliente {

	public static void main(String[] args) {

		//Feminino
		System.out.println("Saudação Feminina");
		FactorySaudacoes saudacaoF = new FactorySaudacoes("Feminino");
		Usuario clienteF = saudacaoF.getSaudacao("Maria");
		System.out.println(clienteF.saudacoes());
		System.out.println("-----------------------------------");
		
		//Masculino
		System.out.println("Saudação Masculina");
		FactorySaudacoes saudacaoM = new FactorySaudacoes("Masculino");
		Usuario clienteM = saudacaoM.getSaudacao("Joao");
		System.out.println(clienteM.saudacoes());
		System.out.println("-----------------------------------");
		
		//Outro
		System.out.println("Saudação");
		FactorySaudacoes saudacao = new FactorySaudacoes("");
		Usuario cliente = saudacao.getSaudacao("X");
		System.out.println(cliente.saudacoes());
		System.out.println("-----------------------------------");
		
	
	}
}
