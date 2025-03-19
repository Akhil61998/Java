package org.eazybytes.streams;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateNumbers {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,10,10,3,5,6,2,4,2,3,355,4664,10,1,15);

        Set<Integer> dup =list.stream().filter(e-> Collections.frequency(list,e)>1).collect(Collectors.toSet());
        System.out.println("Duplicates : " +dup);

//      Map <Integer,Integer> dupMap=  list.stream().filter(e-> Collections.frequency(list,e)>1).collect(Collectors.toMap(integer -> integer, integer->integer));
//        System.out.println("Duplicates map : " +dupMap);

    }

}
