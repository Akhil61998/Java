package org.eazybytes.streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AvgOfNumbers {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5);

        double avg= list.stream().mapToInt(e->e).average().getAsDouble();

        System.out.println("Average :" +avg);
    }
}
