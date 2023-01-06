package oop.factory.method;

public class Square implements Shape{
    private int x;

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public void draw() {
        System.out.println("Inside Square");
    }

    @Override
    public void area() {
        System.out.println(x*x);
    }
}
