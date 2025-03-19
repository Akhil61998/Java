package org.eazybytes.JavaConcepts;


/*Encapsulation : the process of hiding data and code together into single entity
*       We can achieve encapsulation by making fields in class as private or protected and have getters and setters
*       And use constructors to initialize the objects
* */
public class A2Encapsulation {

    // Step 1: Declare private variables
    private String hideData;


    // Step 2: Provide a constructor
    public A2Encapsulation(String hideData) {
        this.hideData = hideData;
    }

    // Step 3: Provide public getter methods
    public String getHideData() {
        return hideData;
    }

    // Step 4: Provide public setter methods (optional)
    public void setHideData(String hideData) {
        this.hideData = hideData;
    }
}
