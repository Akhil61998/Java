package org.eazybytes.JavaConcepts;


//we cannot create object of abstract class
public abstract class  A11Abstraction {

    public int marks;
    public static final int MIN_MARKS = 0;

    //concrete method
    public  int totalMarks(){
        return 90;
    }

//    public void teach(){
//       not ideal way to define the empty method so go for abstract class and abstract method
//    }

    /*if we don't want to write business logic in super class as business logic may differ in subclasses we have to
    * define empty methods that will be inherited and business will be implemented ,so we have to define the above
    * empty teach() method which is not an ideal way to define , instead we have to make class as abstract class
    * and define the abstract method as show below  */

    public abstract void  teach();
}
