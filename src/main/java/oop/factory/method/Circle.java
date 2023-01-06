package oop.factory.method;

public class Circle implements Shape{

    private int r;

    public void setR(int r) {
        this.r = r;
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle");
    }

    @Override
    public void area() {
        float PI = 3.14f;
        System.out.println((float) (PI *r*r));
    }
}
