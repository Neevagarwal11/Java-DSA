package OOPs.Abstract_Classes;

public abstract class parent {
    //When ever there is a need for a function to be overridden by the child class make it an abstract
    abstract void career(String name);  // For creating an abstract class we need to declare the function as well the parent class as abstract 
    abstract void partner(String name , int age);   //every abstract method shall be overridden in the child class 

    int age;    //This can be called using a constructor in the child class and it makes this variable neccesary for running the child class
    final int VALUE;


    public parent(int age){ //A variable can be defined using a constructor in the parent class aswell
        this.age= age;
        VALUE = 123;
    }

    // abstract parent();  Abstract constructors are not allowed

}
