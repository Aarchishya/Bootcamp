package org.example;

//The primary purpose of a java Singleton class is to restrict the limit of the number of object
// creations to only one.
//In terms of instantiation as for normal class we use a constructor, whereas for singleton class
// we use the getInstance() method

public class Singleton {
    // Static variable reference of single_instance of type Singleton
    private static Singleton single_instance = null;
    public String s;
    private Singleton()
    {
        s = "Hello I am a string part of Singleton class";
    }
    public static Singleton getInstance()
    {
        if (single_instance == null)
            single_instance = new Singleton();

        return single_instance;
    }

}
class test {

    public static void main(String args[])
    {
        // Instantiating Singleton class with variable x,y,z
        Singleton x = Singleton.getInstance();
        Singleton y = Singleton.getInstance();
        Singleton z = Singleton.getInstance();
        System.out.println(x);

        // Printing the hash code for above variables declared
        System.out.println("Hashcode of x is " + x.hashCode());
        System.out.println("Hashcode of y is " + y.hashCode());
        System.out.println("Hashcode of z is " + z.hashCode());

        // Condition check
        if (x == y && y == z) {

            System.out.println(
                    "Three objects point to the same object");
        }

        else {
            System.out.println(
                    "Three objects DO NOT point to the same object");
        }
    }
}
