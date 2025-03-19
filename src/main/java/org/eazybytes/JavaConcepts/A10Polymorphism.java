package org.eazybytes.JavaConcepts;



/*Polymorphism:  Ability to perform single action in many ways
    there are two types of polymorphism
              1) compile time or static polymorphism :method overloading , constructor overloading
               2) Runtime or dynamic polymorphism : method overriding  */
public class A10Polymorphism extends A7Inheritance{


    String str;

    /*method overloading : class having 2 or more methods with same name but differ in arguments ,return type etc*/
    public void poly(String name){
        System.out.println("poly 1 method overloading 1");
    }
    /*method overloading : class having 2 or more methods with same name but differ in arguments ,return type etc*/
    public String poly(){
        System.out.println("poly2  method overloading 2 ");


        return "poly2";
    }

    /*Constructor Overloading : class having multiple constructor with same name but differ in arguments is called */
    A10Polymorphism(){
        System.out.println("default constructor inside polymorphism ");
    }
    /*Constructor Overloading : class having multiple constructor with same name but differ in arguments is called */
     A10Polymorphism(String str){
        this.str=str;
    }

    /*method overriding : inheriting the method and changing the behaviour or implementation of inherited method
    * is called method overloading  */
    @Override
    public void eat() {
        System.out.println("poly eats  Method Overriding");
    }
}
