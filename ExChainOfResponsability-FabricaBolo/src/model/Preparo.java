package model;

public abstract class Preparo{

	private String sabor;
	private String recheio;
	private Preparo proximaEtapa;
	
	public Preparo(String sabor, String recheio, Preparo proximaEtapa) {
		super();
		this.sabor = sabor;
		this.recheio = recheio;
		this.proximaEtapa = proximaEtapa;
	}
	
	public Preparo() {}

	public void producao() {
			status();
			
			if(proximaEtapa != null) {
				proximaEtapa.producao();
			}
			else {	
				System.out.println("-------------Pedido Finalizado---------------");
				}
	}

	public void status() {}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public String getRecheio() {
		return recheio;
	}

	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}


	public Preparo getProximaEtapa() {
		return proximaEtapa;
	}


	public void setProximaEtapa(Preparo proximaEtapa) {
		this.proximaEtapa = proximaEtapa;
	}



	
	
	
	
	
}
