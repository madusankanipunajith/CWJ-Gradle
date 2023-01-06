package oop.factory.method;

public class Triangle implements Shape{
    private int x;
    private int y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println("Inside Triangle");
    }

    @Override
    public void area() {
        System.out.println((float) (x*y)/2);
    }
}
