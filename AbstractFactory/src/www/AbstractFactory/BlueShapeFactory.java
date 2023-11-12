package www.AbstractFactory;

public class BlueShapeFactory extends AbstractFactory {

    public Shape getCircle(float ray) { // Correção no nome do método
        return new BlueCircle(ray);
    }

    public Shape getRectangle(float base) {
        return new BlueRectangle(base);
    }

    public Shape getSquare(float height) { // Correção no nome do parâmetro
        return new BlueSquare(height);
    }
}
