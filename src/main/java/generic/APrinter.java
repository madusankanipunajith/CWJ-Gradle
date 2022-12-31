package generic;

import java.io.Serializable;

public class APrinter <T extends Animal & Serializable>{
    private T thingToPrint;

    public APrinter(T thingToPrint){
        this.thingToPrint = thingToPrint;
    }

    public void setThingToPrint(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print(){
        System.out.println(thingToPrint);
    }
}
