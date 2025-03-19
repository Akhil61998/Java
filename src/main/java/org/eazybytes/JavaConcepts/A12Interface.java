package org.eazybytes.JavaConcepts;


/*Interface : it is blueprint of a class where we can define abstract , default and static methods and the implementation
               class will implement the logic for the methods
* syntax of implementation class: <modifier> class <class-name> implements<comma-separated-by-list-of-interfaces>{
        class body
*Interfaces can be extended by another Interface

*Jave supports multiple inheritance using interface

* if you want to define constant in interface By default it will be static final

*Default methods: Before Java 8, if you added a new method to an interface, all implementing
 classes had to override it. This broke older code.
 so  With default methods, you can add new methods to an interface without breaking existing implementations.

}*/
public interface A12Interface {


    /* if you want to define constant in interface By default it will be static final */
    String NAME="Akhil";

//    instead of this we can define the above way, as both are same
//    static final String NAME="Akhil";




    /*in interface, we don't need to explicitly mention abstract key word by default all
     the method that they dont have any method body or method logic , they will be considered as abstract method by interface
     Also we dont have to mention public by default inside interface all methods are implicitly considered and public */

      String usePower();

    /**
     * If Y received kill the villain
     * If N received stop the villain
     * @param c indicates Y or N
     * @return- Returns the Status
     */
      String stopVillain(char c);

/*Default methods: Before Java 8, if you added a new method to an interface, all implementing
 classes had to override it. This broke older code.
 so  With default methods, you can add new methods to an interface without breaking existing implementations.*/
      default void defaultMethod(){
          System.out.println("Default method inside Interface ");
      }

      /*static Methods ::Key Reasons for Introducing static Methods in Interfaces
1. Utility Methods Inside Interfaces
🔹 Before Java 8, utility/helper methods had to be placed in separate utility classes (e.g., Collections, Arrays).
🔹 Now, with static methods, an interface can have related helper methods inside it.
2. Avoid Name Clashes in Implementing Classes
🔹 default methods (introduced in Java 8) can be overridden, but static methods cannot be overridden in subclasses.
🔹 This avoids ambiguity when multiple interfaces have similar methods.

✅  No Overriding Issues*/
      interface MathUtils {
          static int square(int x) {
              return x * x;
          }
      }

}
