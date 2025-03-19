package org.eazybytes.JavaConcepts;

//control f12 to check inherited methods of the class
public class A6AccessModifiers {

    public int publicVar;
    private int privateVar;
    protected int protectedVar;
    int defaultVar; // only inside the package,

    public void publicMethod(){// can be accessed from anywhere from ur project even from other packages

        publicVar=20;// can be accessed from anywhere from ur project even from other packages

        privateVar=21;// can be accessed anywhere within  or inside the class only
        privateMethod();// can be accessed anywhere within  or inside the class only

        protectedVar=22;// can be access within the same package by any class or in any subclass of A6AccessModifiers class
        protectedMethod();// can be access within the same package by any class or in any subclass of A6AccessModifiers class

    }

    private void privateMethod(){// can be accessed anywhere within  or inside the class only

        publicVar=20;// can be accessed from anywhere from ur project even from other packages
        publicMethod();// can be accessed from anywhere from ur project even from other packages

        privateVar=21;// can be accessed anywhere within  or inside the class only

        protectedVar=22;// can be access within the same package by any class or in any subclass of A6AccessModifiers class
        protectedMethod();// can be access within the same package by any class or in any subclass of A6AccessModifiers class

    }

    protected void protectedMethod(){// can be access within the same package by any class or in any subclass of A6AccessModifiers class

        publicVar=20;// can be accessed from anywhere from ur project even from other packages
        publicMethod();// can be accessed from anywhere from ur project even from other packages


        privateVar=21;// can be accessed anywhere within  or inside the class only
        privateMethod();// can be accessed anywhere within  or inside the class only


        protectedVar=22;// can be access within the same package by any class or in any subclass of A6AccessModifiers class

    }

}
