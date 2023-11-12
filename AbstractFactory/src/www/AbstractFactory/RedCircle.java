package www.AbstractFactory;

public class RedCircle extends Circle {

    public RedCircle(Float ray) {
        super(ray, "RED");
    }

    public void draw() {
        System.out.println("dentro do circulo " + getColor() + " de raio " + getRay() + " no metodo draw()");
    }
}
