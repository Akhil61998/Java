package org.eazybytes.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartsWith {


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,232,33,22,4556,23,67,4,3,2);

       List<Integer> startsWith2= list.stream().map(e->String.valueOf(e)).filter(e->e.startsWith("2")).map(Integer::valueOf).collect(Collectors.toList());
        System.out.println("Number starts with : " +startsWith2);
    }
}
