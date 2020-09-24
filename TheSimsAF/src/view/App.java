package view;

import java.util.Scanner;

import controller.AvatarFactory;
import controller.AvatarFemininoFactory;
import controller.AvatarMasculinoFactory;
import model.Avatar;

public class App {

	 public static void main(String[] args) {
		 String genero;
		 AvatarFactory avatar;
		 Avatar personagem;
		 
		 
		 System.out.println("Qual personagem? feminino ou masculino?");
		 Scanner entrada = new Scanner(System.in);
		 genero = entrada.nextLine();
		 entrada.close();
		 
		 
		 System.out.println("-----------------------------------");
		 if(genero.equals("feminino")) {
			 System.out.println("Avatar Feminina");
			 avatar = new AvatarFemininoFactory();
			 personagem = avatar.criarAvatar();
			 System.out.println(personagem);
		 }
		 else if(genero.equals("masculino")) {
			 System.out.println("Avatar Masculino");
			 avatar = new AvatarMasculinoFactory();
			 personagem = avatar.criarAvatar();
			 System.out.println(personagem);
		 }
		 
		 
	 }
	
}
