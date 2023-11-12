package www.AbstractFactory;

public abstract class Square extends Shape { 
	private float heigth; 
	
	public Square( float heigth, String color) { 
		super(color); 
		this.heigth = heigth; 
		
	}
	public float getHeigth() { 
		return heigth; 
		
	}
	
	public void setHeigth(float heigth)  { 
		this.heigth = heigth; 
	}

}
