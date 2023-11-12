package www.AbstractFactory;

public class BlueSquare extends Square { 
	public BlueSquare (float heigth ) { 
		super(heigth, "BLUE");
		
	}
	
	public void draw() { 
		System.out.println("dentro do quadrado " + getColor() + " de altura " + getHeigth() + "no metodo draw") ;
	}

}
