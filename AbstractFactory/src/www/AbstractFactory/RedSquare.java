package www.AbstractFactory;

public class RedSquare extends Square { 
	
	public RedSquare (float heigth) { 
		super(heigth, "RED"); 
		
	}
	public void draw() { 
		
		System.out.println("dentro do quadrado" +  getColor() + "de altura " + getHeigth() + "no metodo deaw()");
	}
	

}
