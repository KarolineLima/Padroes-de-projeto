package model;

public class WindowDecorator extends Window{

	Window window;

	
	public WindowDecorator(Window window) {
		super();
		this.window = window;
	}

	public String draw() {
		
		return  window.draw() + " + " + super.draw(); 
	}
	
	
}

