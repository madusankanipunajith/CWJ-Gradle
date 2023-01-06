package oop.factory.method;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 =  shapeFactory.getShape("SQUARE");
        shape1.draw();

        Square square = (Square) shapeFactory.getShape("SQUARE");
        square.setX(7);
        square.draw();
        square.area();
    }
}
