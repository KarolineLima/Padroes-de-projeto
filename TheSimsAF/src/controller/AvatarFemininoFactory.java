package controller;

import model.Avatar;
import model.Cabelo;
import model.CabeloEsportista;
import model.Vestimenta;
import model.VestimentaEsportista;

public class AvatarFemininoFactory extends AvatarFactory{

	public AvatarFemininoFactory() {
		super();
	}
	
	@Override
	public Avatar criarAvatar() {
		Cabelo cabelo = new CabeloEsportista();
		Vestimenta roupa = new VestimentaEsportista();
		
		Avatar avatarF = new Avatar("Maria",1, 500000 , cabelo,roupa);
		
		return avatarF;
	}
	
	
}
