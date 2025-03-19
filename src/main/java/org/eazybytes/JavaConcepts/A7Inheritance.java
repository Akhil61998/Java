package org.eazybytes.JavaConcepts;


/*Inheritance : Acquiring the properties one class to another class*/

/*Super class or base class or parent class  */


//A9InheritanceUpcastingAndDownCasting will explain upcasting and downCasting

//upcasting:assigning subclass object to super class object
//downCasting :assigning super class object to   subclass object
public class A7Inheritance {

    private String name;
    private String breed;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

  public void eat(){
      System.out.println("Animal eating ");
  }


}
