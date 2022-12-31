package generic;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Generics secure us from the casting issues
        Printer<Float> printer = new Printer<>(10f);
        printer.print();

        APrinter<Cat> aPrinter = new APrinter<>(new Cat("Alex"));
        aPrinter.print();

        List<Integer> lst = new ArrayList<>();
        lst.add(10);
        printList(lst);
        printList2(lst);
    }

    public static <T> void printList(List<T> list){
        System.out.println(list);
    }

    public static void printList2(List<?> list){
        System.out.println(list);
    }
}
