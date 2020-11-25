package model;

public class Football extends AbstractGame {

	public Football() {}

	public boolean initialize() {
		System.out.println("O Jogo de Football foi inicializado");
		return true;
	}
	
	public void startPlay() {
		System.out.println("O Jogo de Football começou");

	}
	
	public void endPlay() {
		System.out.println("O Jogo de Football finalizou");
	}
	
	public boolean play() {
		System.out.println("O Jogo de Football está em andamento"); 
		return true;
	}
}
