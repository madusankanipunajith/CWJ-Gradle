package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BubbleSort {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,5,3,7,8,9,0,22,11);

        boolean isNotSorted = true;
        while (isNotSorted){
            isNotSorted = false;
            for (int index = 0; index < list.size()-1; index++){
                if (list.get(index) > list.get(index+1)){
                    isNotSorted = true;
                    int temp = list.get(index+1);
                    list.set(index+1,list.get(index));
                    list.set(index, temp);
                }
            }
        }

        System.out.println(new ArrayList<>(list));

    }
}
