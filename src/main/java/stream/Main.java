package stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        for (int x: arr) {
            System.out.println(x);
        }

        // we can create stream object within two ways

        // first way
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        Stream<Integer> streamObject = list.stream();
        // second way
        Stream<Integer> newStreamObject = Stream.of(1,2,3,4,5,6,7,8,9);

        System.out.println(newStreamObject.collect(Collectors.toList()));

        List<Integer> cubedNumbers= list.stream().map(x -> (int)Math.pow(x,3)).collect(Collectors.toList());

        System.out.println(cubedNumbers);

        // Flat Map
        List<Integer> list1 = Arrays.asList(1,2,3);
        List<Integer> list2 = Arrays.asList(4,5,6);
        List<Integer> list3 = Arrays.asList(7,8,9);

        List<List<Integer>> listOfNumbers = Arrays.asList(list1, list2, list3);

        List<Integer> intList = listOfNumbers.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(intList);

        int sum = list.stream().reduce(0, Integer::sum);
        System.out.println(sum);
    }
}
