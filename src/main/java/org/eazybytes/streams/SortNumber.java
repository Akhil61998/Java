package org.eazybytes.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,10,10,3,5,6,2,4,2,3,355,4664,10,1,15);

        List<Integer> sortedAscNumbers=list.stream().sorted().collect(Collectors.toList());

        System.out.println("Ascending order sorting : " +sortedAscNumbers);

        List<Integer> sortedDscNumbers=list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());

        System.out.println("Descending  order sorting : " +sortedDscNumbers);



    }
}
