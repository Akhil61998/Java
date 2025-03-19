package org.eazybytes.JavaConcepts;


/*packages : are used to organize classes into name spaces.. package is a collection related classes , interfaces , enums
* and annotations grouped together into single unit */
public class A1CompleteJava {/*  Class : this is the blue print of creating the object  which
                                       contains Fields/Attributes/Variables,
                                       Methods , Constructors , Instance Initializers/Blocks  ,
                                       Static Initializers/Blocks */

    int a;
    int b;

    String name;
    int age;

    static char gender;

    /*This is Static which will be same through class// stored in class area/memory or method memory not in heap memory*/
    /*so if we define final then the value defined cannot be changed */
    static final String EMPLOYER_NAME="GOOGLE";

    /*Method : Set of instructions used to perform specific tasks */
    public int sum(int a, int b){
        int sum = a+b;
        System.out.println("this is first method sum");
        return sum;
    }
    /*Method Overloading : class having many methods with same but differ in arguments*/
    public int sum(int a){
        int sum =a+a;  //Local variable cannot be accessed outside the method or specifically scope
        System.out.println("This is inside method overloading method sum ");
        return sum;

    }

    /*Constructor : Set of instruction used for initialization and instantiation  */
    public A1CompleteJava(){     /*This is default Constructor */
        System.out.println("This is inside default defined constructor");
    }

    /*Constructor Overloading: Class having multiple constructors with same name but differ in arguments*/
    public A1CompleteJava(String name, int age ){
        this.name=name;
        this.age=age;

        System.out.println("This is inside user defined constructor  "+name+" "+age);

    }

    /*  this is inside simple block or Instance Initializer or block  */
    {
        this.name="Akhil";
        this.age=26;
        System.out.println("this is inside simple block or Instance Initializer ot block");
    }


    /*  this is inside static bock or static Initializer which executes before the main method   */
    static {
        gender='M';
        System.out.println("this is inside static bock or static Initializer");
    }


    /* in Static methods we cannot invoke the non static or instance method so we have to invoke using creatig
    the object of the class as show in below examples*/
    public static void main(String[] args) {
        A1CompleteJava jave1= new A1CompleteJava(); //example 1: object creation


        int sum1=jave1.sum(10,10); // invoking the instance or non static methods
      int sum2=  jave1.sum(20);// invoking the instance or non static methods

//       String name= jave1.name="akhil";


        System.out.println("this is sum1 : " +sum1);

        System.out.println("this is sum2 : "+sum2);
        new A1CompleteJava("akhil" ,242);

//        System.out.println("this initialization of name from object ;" +name);

        System.out.println("this is inside instance block "+ jave1.name);

        System.out.println("This is static final :" + A1CompleteJava.EMPLOYER_NAME);

        System.out.println("This is static block  :" + A1CompleteJava.gender);

        /*Encapsulation Implementation */
        A2Encapsulation encapsulation= new A2Encapsulation("encapsulation");
        System.out.println("This is encapsulation explanation  class : "+encapsulation.getHideData());


        /*String and String pool Explanation*/

        System.out.println("this is string pool Explanation : " );

        A3StringAndStringPool.main();

        /*Mutable String and ways to create Mutable  String using StringBuffer and StringBuilder Explanation*/

        /*Mutable String and ways to create Mutable  String using StringBuffer and StringBuilder Explanation*/

        A4StringMutable.mutableStringBuffer();


        /*Conditional / control-flow statemets*/

        //if -else example

        System.out.println("Conditional / control-flow statemets : ");

        System.out.println("if -else example : Enter the grade :");
        A5ConditionalStatements.ifElse();


        //Ternary Operator example

        System.out.println("Ternary Operator example :");
        A5ConditionalStatements.ternaryOperator();

        //switch -case
        System.out.println("switch -case example :");
        A5ConditionalStatements.switchCase();


        //while example palindrome
        System.out.println("while example palindrome :");
       boolean whileOutput= A5ConditionalStatements.whileExample();
        System.out.println(whileOutput);


        //Do- while example
        System.out.println("Do- while example  :");
        A5ConditionalStatements.doWhileExample();

        //for-loop example
        System.out.println("for-loop example  :");
        A5ConditionalStatements.forLoopExample();


        //access modifiers example
        A6AccessModifiers a6AccessModifiers=new A6AccessModifiers();

/*Polymorphism Example*/

        System.out.println("Polymorphism Example :");
        A10Polymorphism a10Polymorphism=  new A10Polymorphism();
        a10Polymorphism.poly();
        a10Polymorphism.poly("Akhil");
        a10Polymorphism.eat();

        /*Interface Example*/
        System.out.println("Interface Example Multiple Inheritence:");
        A13InterfaceImplementaion a13InterfaceImplementaion = new A13InterfaceImplementaion();
        System.out.println(a13InterfaceImplementaion.isPerson());
        System.out.println(a13InterfaceImplementaion.usePower());
        System.out.println(a13InterfaceImplementaion.stopVillain('Y'));

        System.out.println("Interface Example Normal way :");
        A15InterfaceSuperMan a15InterfaceSuperMan= new A15InterfaceSuperMan();
        System.out.println(a15InterfaceSuperMan.usePower());
        System.out.println(a15InterfaceSuperMan.stopVillain('Y'));

        A16InterfaceSpiderMan a16InterfaceSpiderMan = new A16InterfaceSpiderMan();
        System.out.println(a16InterfaceSpiderMan.usePower());
        System.out.println(a16InterfaceSpiderMan.stopVillain('Y'));


        System.out.println("Interface Example how to use superclass as object and concise the code from the above code:");
        A12Interface superMan= new A15InterfaceSuperMan();
        invokeInterface(superMan);

        A12Interface spiderMan= new A16InterfaceSpiderMan();
        invokeInterface(spiderMan);

    }
    private static void invokeInterface(A12Interface a12Interface){
        System.out.println(a12Interface.usePower());
        System.out.println(a12Interface.stopVillain('Y'));
    }






}
