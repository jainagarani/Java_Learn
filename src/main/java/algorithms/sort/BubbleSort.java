package algorithms.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BubbleSort {

    public static void main(String[] args){
        int[] arr ={1,-3,5,-8,9};
            List<Integer> arrNumbers = Arrays.asList(1,-3,5,-8,9);
            List<Integer> minList = new ArrayList<>();
            int min =0;
        minList =arrNumbers.stream().sorted().limit(4).collect(Collectors.toList());

    }
}
