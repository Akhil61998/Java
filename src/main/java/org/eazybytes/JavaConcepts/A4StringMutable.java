package org.eazybytes.JavaConcepts;

public class A4StringMutable {

    /*String Class is immutable , which means that once a string is created its value cannot be changed
    *
    * there are several ways to create mutable strings
    *
    * 1) StringBuilder- probides various methods for -appending , inserting, replacing and deleting but not tread safe
    * 2) StringBuffer - provides same methods as stringbuilder but it is Thread safe*/



    public static void mutableStringBuffer(){
        StringBuffer stringBuffer= new StringBuffer();
        stringBuffer.append("World");
        stringBuffer.insert(0,"Hello");
        stringBuffer.deleteCharAt(4);
        stringBuffer.insert(4,"o");
        stringBuffer.setLength(5);
        stringBuffer.reverse();

        String str=stringBuffer.toString();
        System.out.println(str);

        // String to primitive data types value
        // this is done using the parsing
       /* //parsing involves converting string representaion of a value into corresponding primitive datatype
        commonly done using wrapper class
        */

        //parsing Integer value
        String  strNumber ="123";
        int parseNumber=Integer.parseInt(strNumber);

        System.out.println("Parsing Integer value :"+parseNumber);

        //parsing Double value
        String strDouble ="3.142";
        double parseDouble= Double.parseDouble(strDouble);
        System.out.println("Parsing Double value :"+parseDouble);


    }
}
