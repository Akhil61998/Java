package org.eazybytes.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueNumAndCount {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,10,10,3,5,6,2,4,2,3,355,4664,10,1,15);


        long distinctCount=list.stream().distinct().count();
        System.out.println("Count of distinct numbers = "+distinctCount);


        System.out.println("distinct numbers");
        List<Integer> distinct= list.stream().distinct().collect(Collectors.toList());

        distinct.forEach(System.out::println);
    }
}
