
public class Cliente {

	private SomadorEsperado somador;
	
	private Cliente(SomadorEsperado somador) {
		this.somador=somador;	
	}
	
	public void executar() {
		int[] vetor = new int[] {};
		int soma = somador.somaVetor(vetor);
		System.out.println("Resultado: " + soma);
	}
}
