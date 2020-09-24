package controller;

import model.Avatar;
import model.Cabelo;
import model.CabeloClassico;
import model.Vestimenta;
import model.VestimentaClassica;

public class AvatarMasculinoFactory extends AvatarFactory{

	public AvatarMasculinoFactory() {
		super();
	}
	
	@Override
	public Avatar criarAvatar() {
		Cabelo cabelo = new CabeloClassico();
		Vestimenta roupa = new VestimentaClassica();
		
		Avatar avatarM = new Avatar("Joao",2,300000, cabelo,roupa);
		
		return avatarM;
	}
}
