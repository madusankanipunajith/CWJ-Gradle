package oop.factory.method;

public interface Shape {

    String meta = "This is an Interface"; // public static final by default

    // Interface can have static methods
    static void shapeInfo(){
        System.out.println("This is a shape");
    }

    void draw(); // method signature
    void area(); // method signature
}
