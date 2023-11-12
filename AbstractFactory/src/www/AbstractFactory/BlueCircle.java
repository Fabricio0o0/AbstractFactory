package www.AbstractFactory;

public class BlueCircle  extends Circle{ 
	
	public BlueCircle(float ray) { 
		super(ray, "BLUE"); 
	} 
	
	public void draw() { 
		System.out.println("dentro do circulo " + getColor() + " de raio "  + getRay() + "no metodo draw()" );
	}
	

}
