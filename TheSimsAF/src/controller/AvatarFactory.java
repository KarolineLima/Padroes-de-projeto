package controller;

import model.Avatar;
import model.Cabelo;
import model.Vestimenta;

public  abstract class AvatarFactory {

	private Avatar avatar;
	
	public AvatarFactory() {}
	
	public AvatarFactory(Avatar avatar) {
		super();
		this.avatar = avatar;
	}

	public abstract Avatar criarAvatar();

	@Override
	public String toString() {
		return "AvatarFactory [avatar=" + avatar + "]";
	}


	
}
