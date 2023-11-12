package www.AbstractFactory;

public class FactoryProducer {
    
    public static AbstractFactory getFactory(String color) {
        if (color.equalsIgnoreCase("BLUE")) {
            return new BlueShapeFactory();
        } else if (color.equalsIgnoreCase("RED")) {
            return new RedShapeFactory();
        }
        return null;  // Adicionei essa linha para manter consistência com o código original
    }
}
