package org.eazybytes.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitAndSkipNumbers {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(13,34,6,1,56,68,342,87,5,93,54);

        List<Integer> limit = list.stream().limit(5).collect(Collectors.toList());

        System.out.println("Limit number to 5 : " +limit );

        int sumOflimitedNumbers= list.stream().limit(5).reduce((a,b)->a+b).get();

        System.out.println("sumOflimitedNumbers : " +
                " " + sumOflimitedNumbers);

        List<Integer> skip = list.stream().skip(5).collect(Collectors.toList());

        System.out.println("skip number till 5 : " +skip );


    }

}
