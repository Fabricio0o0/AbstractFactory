package www.AbstractFactory;

public class RedRectangle  extends Rectangle {
	
	public RedRectangle (float base ) { 
		super(base, "RED"); 
		
	}
 
	public void draw() { 
		System.out.println("dentro de retangulo " + getColor() + "de base"  + getBase() + " no metodo draw"); 
	}
}
