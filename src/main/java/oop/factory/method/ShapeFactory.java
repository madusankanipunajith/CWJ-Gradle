package oop.factory.method;

public class ShapeFactory {
    public Shape getShape(String shape){
        if (shape == null){
            return null;
        }

        if (shape.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }
        if (shape.equalsIgnoreCase("TRIANGLE")){
            return new Triangle();
        }
        if (shape.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        return null;
    }
}
