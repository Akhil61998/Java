package org.eazybytes.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddAndEvenNumbers {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(13,34,6,1,56,68,342,87,5,93,54);

        List< Integer> evenList =list.stream().filter(e->e%2==0).collect(Collectors.toList());

        System.out.println("even list :" +evenList);

        List< Integer> oddList =list.stream().filter(e->e%2!=0).collect(Collectors.toList());

        System.out.println("odd list :" +oddList);
    }
}
