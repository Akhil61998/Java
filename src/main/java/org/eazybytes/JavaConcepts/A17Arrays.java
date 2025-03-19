package org.eazybytes.JavaConcepts;

/*Arrays:  An array is a data structure that stores a fixed-size sequence of elements of the same data type.
 It allows random access to elements using an index.*/
public class A17Arrays {


    public static void arraysExplanation(){
        int[] array;// array declaration

        int[] nums=new int[10]; //declaration and initialization of size

        int[] num={10,2,45,5,5,5};//declaration and initialization of values

        System.out.println("length of array"+num.length);
    }

    //Array iteration using for loop
    public static void iterateArray(){
        int[] mobileNumbers= new int[116];
        mobileNumbers[0]=707070760;
        mobileNumbers[16]=707070760;
        mobileNumbers[24]=707070760;
        mobileNumbers[38]=707070760;
        mobileNumbers[94]=707070760;

        for(int i=0; i<mobileNumbers.length; i++){
            System.out.println("The elements at index :"+i+" is :" +mobileNumbers[i]);
        }
        //Array iteration using for each loop

        for(int num:mobileNumbers){
            System.out.println("The elements is :" +num);
        }

    }



}
