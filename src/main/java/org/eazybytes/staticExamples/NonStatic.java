package org.eazybytes.staticExamples;

public class NonStatic {

    String brand;
     int speed;
     int carCount;

     NonStatic(String brand, int speed){
         this.brand=brand;
         this.speed=speed;
         carCount++;

     }

     void displayCount(){
         System.out.println("Car count is" + carCount);


     }

    public static void main(String[] args) {
        NonStatic car1= new NonStatic("toyota", 100);
        NonStatic car2= new NonStatic("BMW", 200);

        car1.displayCount();
        car2.displayCount();
    }
}
