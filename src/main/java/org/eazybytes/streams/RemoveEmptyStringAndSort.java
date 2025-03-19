package org.eazybytes.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveEmptyStringAndSort {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Akhil","","Nikhil","Krishna","","");
        List<String> sortString=  names.stream().filter(n->!n.isEmpty()).sorted().collect(Collectors.toList());

        sortString.forEach(System.out::println);
    }
}
