package optional1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SmallestNumberInArray {

    public static int getSmallestNumber(Integer[] a, int total) {

        List<Integer> list = Arrays.asList(a);
        Collections.sort(list);
        int element = list.get(0);
        return element;
    }
}