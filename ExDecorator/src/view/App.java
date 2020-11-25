package view;

import model.Border;
import model.ScrollbarHorizontal;
import model.ScrollbarVertical;
import model.Window;

public class App {

	public static void main(String[] args) {

		Window w1 = new Window();
		Window w2 = new Window();
		Window w3 = new Window();

		w1 = new ScrollbarVertical(w1);
		System.out.println(w1.draw());
		
		System.out.println();
		System.out.println("---------------------------------------------------------------");
		System.out.println();
		
		w2 = new ScrollbarHorizontal(w2);
		System.out.println(w2.draw());
		
		System.out.println();
		System.out.println("---------------------------------------------------------------");
		System.out.println();
		
		
		w3 = new Border(w3);
		System.out.println(w3.draw());

		System.out.println();
		System.out.println("---------------------------------------------------------------");
		System.out.println();

		w1 = new ScrollbarVertical(w2);
		System.out.println(w1.draw());
		
		System.out.println();
		System.out.println("---------------------------------------------------------------");
		System.out.println();
		
		w3 = new Border(w1);
		System.out.println(w3.draw());
		
	
	}

}
