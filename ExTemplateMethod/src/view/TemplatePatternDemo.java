package view;

import model.AbstractGame;
import model.Cricket;
import model.Football;

public class TemplatePatternDemo {

	public static void main(String[] args) {

		AbstractGame cricket = new Cricket();
		
		System.out.println();

		AbstractGame football = new Football();
	}

}
