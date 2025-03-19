package org.eazybytes.JavaConcepts;


//Jave supports multiple inheritance using interface
public class A13InterfaceImplementaion implements A12Interface,A14InterfaceForMultipleInheritance{

    @Override
    public String usePower() {
        return "Interface Using its power";
    }

    /**
     * If Y received kill the villain
     * If N received stop the villain
     *
     * @param c indicates Y or N
     * @return- Returns the Status
     */
    @Override
    public String stopVillain(char c) {
        if(c=='Y'){
            return "kill the villain";
        }else{

            return "stop the villain";
        }


    }

    @Override
    public String isPerson() {

        //Static method implementation call , Now, you can directly call it without implementing the interface:
        System.out.println(MathUtils.square(5)); // Output: 25

        return "yes he is person";
    }


}
