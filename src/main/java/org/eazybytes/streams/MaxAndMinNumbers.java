package org.eazybytes.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;

public class MaxAndMinNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,10,10,3,5,6,2,4,2,3,355,4664,10,1,15);

      int  max=  list.stream().max(Comparator.comparing(Integer::valueOf)).get();

        System.out.println("Max number :" +max);

        int  min=  list.stream().min(Comparator.comparing(Integer::valueOf)).get();

        System.out.println("Min number :" +min);

        System.out.println("====================================different Approach====================================================");

        OptionalInt maxValue= list.stream().mapToInt(n->n).max();
        System.out.println("Max number :" +maxValue);

        OptionalInt minValue= list.stream().mapToInt(n->n).min();
        System.out.println("min number :" +minValue);
    }
}
