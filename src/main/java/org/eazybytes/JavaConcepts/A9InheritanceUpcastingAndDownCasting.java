package org.eazybytes.JavaConcepts;

public class A9InheritanceUpcastingAndDownCasting {

    public static void main(String[] args) {
        A7Inheritance anm =new A7Inheritance();

        A8InheritanceDod dog =new A8InheritanceDod();
        anm= anm;//upcasting

        dog= (A8InheritanceDod) anm;


    }
}
