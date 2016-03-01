package com.xiaolu.item49_prefer_primitive_to_boxed;

import java.util.Comparator;

public class SomeComparator {

    public static void main(String[] args) {
        Comparator<Integer> naturalOrder = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
//                return o1 < o2 ? -1 : (o1 == o2 ? 0 : 1);

                int f = o1;
                int s = o2;
                return  f < s ? -1 : (f == s ? 0 : 1);
            }
        };

        System.out.println(naturalOrder.compare(new Integer(42), new Integer(42)));
    }
}
