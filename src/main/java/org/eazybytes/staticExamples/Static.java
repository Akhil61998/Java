package org.eazybytes.staticExamples;

public class Static {

    String brand ;
    int speed;

    static int carCount=0;


    Static( String brand, int speed ){
        this.brand=brand;
        this.speed=speed;
    carCount++;
    }

   static void displayCarCount(){
        System.out.println("Car count "+ carCount);

    }

    public static void main(String[] args) {
        Static car1= new Static("toyota", 100);
        Static car2= new Static("BMW", 200);

        Static.displayCarCount();

    }
}
