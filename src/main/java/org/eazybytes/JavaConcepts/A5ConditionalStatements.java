package org.eazybytes.JavaConcepts;

import java.util.Scanner;

public class A5ConditionalStatements  {
    /*

    achieved using

    1- selection statement using if-else or switch-case
    2- iteration statement using for, while, or do while

    3- branching statement using break , continue, or return
    4- exception-handeling statements using throw,try-catch or try-catch-finally

    */

    /*Ternary Operator : (if condition  ) ?true : false  */

    Scanner sc =new Scanner(System.in);

    String str=sc.next();
    public static void ifElse(){
        Scanner sc =new Scanner(System.in);

        String str=sc.next();
        if(str.equals("A")){

            System.out.println("Hurrey!.. got a gaming console");

        } else if (str.equals("B")) {

            System.out.println("Average");

        } else {
            System.out.println("Motivation speeech received ");
        }

    }

    /*Ternary Operator : (if condition  ) ?true : false
    * cannot be used for more than one statement if more than one the go for if else  */
    public static void ternaryOperator(){

        int x=10;
        int y;

        if(x>=10){
            y=20;
        }else {
            y=5;
        }

        /* the above condition can be written using ternary operator */

        y=(x>=10)? 20:5;


        System.out.println(y);
    }

    /* Switch -Case*/

    public static void switchCase(){


        String fruitName="Mango";

        switch (fruitName){
            case "Banana":
            case "Apple":
                System.out.println("$ 1.0 is charged");
                break;
            case "Grapes":
                System.out.println("$ 2.0 is charged");
                break;
            case "Mango":
                System.out.println("$ 3.0 is charged");
                break;
            default:
                System.out.println("pick a valid fruit");
                break;


        }
        System.out.println("we can follow this from java 14");

        switch (fruitName){
            case "Banana", "Apple" ->System.out.println("$ 1.0 is charged");
            case  "Grapes" ->System.out.println("$ 2.0 is charged");
            case  "Mango" ->System.out.println("$ 3.0 is charged");
            default   ->System.out.println("pick a valid fruit");
        }




    }

    //while  example
    //palindrome example without using extra space
    public static boolean whileExample(){


//sum of numbers up to 100
//        int sum = 0;
//        int number = 1;
//        while (number<=100){
//
//            sum +=number;
//            number++;
//        }
//        System.out.println(sum);
        String str ="madam";

        int left=0; int right= str.length()-1;



        while (left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;

        }
        return true;


    }

//    do while example- atleast executes one even condition is true or false

    public static void doWhileExample(){

        int i=6;

        do{
            System.out.println(i);
            i++;
        }while (i<10);

        long factorial = 1;
        int number = 1;

        // Write your logic below using do while
        do{
            factorial=factorial*number;
            System.out.println(factorial);
            number++;
        }
        while(number<=4);



    }

    //for - loop example
    public static void forLoopExample(){


        for (int i=1;i<=10;i++ ){
            int result=i*5;
            System.out.println("5 *" +i+"="+result);
        }

    }



}
