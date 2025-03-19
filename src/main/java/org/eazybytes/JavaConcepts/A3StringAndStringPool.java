package org.eazybytes.JavaConcepts;

public class A3StringAndStringPool {



    public static void main() {
            /* String is sequence of character and is and immutable object and
             is implemented as class so it can used as literal/variable like primitive data types and
             can be used using new keyword
         */


    /*String pool is special memory inside  heap memory  where java stores string literals to optimize
    the memory usage and performance
     */

        // Created in String Pool
        String str1 ="Akhil" ;

        // Same reference (No new object created)
        String str2 ="Akhil";

        // Created in Heap memory (New object)
        String useHeapMemory1= new String("Akhil");

        // Created in Heap memory (New object)
        String useHeapMemory2= new String("Akhil");

        /* So == checks the memory location pointing is same or not  where as .equals or .equalsignorecase will check
        * whether the value is same or not */

        System.out.println(str1==str2);// true (same object in pool )
        System.out.println(str1.hashCode());// helps to get the hashcode of the string

        System.out.println(str1==useHeapMemory1);// false (different objects one in string pool and another in heap memory)

        System.out.println(useHeapMemory1==useHeapMemory2);// false (different objects in different location )

        System.out.println(useHeapMemory1.equals(useHeapMemory2));/*/ true (different objects but here by using
                         .equals is will check value is same or no) */

        System.out.println(useHeapMemory1.equalsIgnoreCase(useHeapMemory2));/*/ true (different objects but here by using
                         .equalsIgnoreCase is will check value is same or no even if  case same or not ) */

        System.out.println(useHeapMemory1.compareTo(useHeapMemory2)); // it is also used to compare the strings so 0 means
        // both the strings is same

        System.out.println(str1.concat(useHeapMemory2));//helps to concat two strings

//string charAt
        //string is empty or not
        // string is blank or not
        // string to lower case and toUpperCase locale methods is used to language
        // convert values as string using String.valueOf()
        //searching for value in string using iundexof() if not present will givee -1 we can also do using contains() method
        // which returns boolend if presents true else false, also matches() etc
        // trimming the string using trim() method
        // substring(0,9)
        //replace(oldchar,newchar) replaceAll("a|b|c|d", "*")
        //String.join(delimiter,elemets); zstring rsult =zString.join(" ","hello","World","hava");


    }

}
