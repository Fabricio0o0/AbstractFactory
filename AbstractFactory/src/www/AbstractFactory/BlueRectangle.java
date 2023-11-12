package www.AbstractFactory;

public class BlueRectangle extends Rectangle { 
	
	public BlueRectangle(float base) { 
		super(base, "BLUE") ; 
		
	}
	
	public void draw() { 
		System.out.println(" Dentro de retangulo " + getColor() + "base" + getBase() + " no metodo draw()" );
	}

}
