package test.text;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestExample {
    public static void main(String[] args){
        int[] arr = {1,2,3,3,4,4,5,5,6,7};
        List<Integer> list = new ArrayList<>();
        for(int i =0 ; i< arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                //duplicate element
                if(arr[i] == arr[j]){
                    list.add(arr[i]);
                }
            }
        }
        Collections.sort(list, new  NumberComparator());

        list.forEach(e -> System.out.println(e));


    }
}
