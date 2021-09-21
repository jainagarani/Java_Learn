package test.text;

import java.util.Comparator;

public class NumberComparator  implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1 == o2)
        return 0;
        else return o2-o1;
    }
}

