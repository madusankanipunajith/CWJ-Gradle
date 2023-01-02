package reflection;

public class Cat {
    private String name;
    private int age;

    public Cat(String name, int age){
        this.age = age;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    private static void staticMethod(int x){
        System.out.println("PSV "+ String.valueOf(x));
    }

    private static void privateStaticMethod(){
        System.out.println("PSM");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
