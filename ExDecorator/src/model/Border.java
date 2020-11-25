package model;

public class Border extends WindowDecorator {
	
	public Border(Window OneWindow) {
		super(OneWindow);
		super.setRecurso("Border");
		super.draw();
	}

}
