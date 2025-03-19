package org.eazybytes.JavaConcepts;

public class A15InterfaceSuperMan implements A12Interface {
    @Override
    public String usePower() {
        return "Yes SuperMan Ues The Power";
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
}
