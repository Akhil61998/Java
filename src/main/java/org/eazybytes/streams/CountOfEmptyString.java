package org.eazybytes.streams;

import java.util.Arrays;
import java.util.List;

public class CountOfEmptyString {


    public static void main(String[] args) {

        List<String> names = Arrays.asList("Akhil","","Nikhil","Krishna","","");

        Long emptyStringCount= names.stream().filter(n-> n.isEmpty()).count();

        System.out.println("Count of empty string = "+emptyStringCount);

    }


}
