package generic;

import annot.ImportantString;
import annot.RunImediately;

import java.io.Serializable;

public class Cat extends Animal implements Serializable {

    private final int age = 10;
    @ImportantString
    private String name;

    public Cat(String name){
        this.name = name;
    }

    @RunImediately(times = 10)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
