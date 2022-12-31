package annot;

@VeryImportant
public class Cat {

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
}
