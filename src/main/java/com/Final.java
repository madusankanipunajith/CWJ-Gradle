package com;

public class Final {
    public static void main(String[] args) {
        System.out.println("Madusanka Nipunajith");
        final Dog dog = new Dog("Alex", 3); // Initialize once only (final attribute/variable)
        dog.setAge(10);
        System.out.println(dog.getAge());
    }
}

// final classes can't be extended (final class)
class Animal {
      private String name;
      private Integer age;

      public Animal(String name, Integer age){
          this.name = name;
          this.age = age;
      }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    // can't override (final method)
    public final void setAge(Integer age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Dog extends Animal{

    public Dog(String name, Integer age) {
        super(name, age);
    }

}
