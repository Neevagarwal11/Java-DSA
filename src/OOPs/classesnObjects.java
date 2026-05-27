 package OOPs;

import java.util.Arrays;

public class classesnObjects {

    // 1. It is also called used defined data structure
    // 2. It's a name group of properties and functions 
    // 3. Class is a logical construct where as object is the physical construct. 
    
    

    // static variable
    static int a= 4;
    static int b;

    //Will only run once when the 1st object is created
    static{
        System.out.println("Hello from Staitc block");
        b = 4*5;
    }



    public static void main(String[] args) {

        // Accessing & Printing the staic variables
        classesnObjects obj = new classesnObjects();
        System.out.println(classesnObjects.a + " "  + classesnObjects.b);


        
        // Declaring the student 
    Student neev = new Student();  //Dynamically allocates memory and return a ref to the object stored in heap memory.


    // neev.roll = 21;
    // neev.name = "Neev Agarwal";
    // System.out.println(neev.roll);
    // System.out.println(neev.name);

        neev.greeting();   


        // Wrapper Class 
        // Interger class =45;

        final int INCREASE = 45;    //using the final keyword the variable is now fixed and is not allowed to change the value in it.

        final Student neev2 = new Student();
        neev2.name = "Neev Agarwal";    // final keyword does not change the value of primitive datatype like int,String,float but for objects it can change the value within the obj but the obj's structure itself cannot be changed.
        

    }

    
    //Create a class
    static class Student{
        int roll;
        String name;
        float marks;

        void greeting(){
            System.out.println("Hello my name is " + this.name );
        }
        Student(){
            this.roll = 21;
            this.name = "Neev";
            this.marks = 89.0f;
        }
        // Student neev = new Student(21 , "Neev" , 89.0f);     this will create a new obj named neev with the values of the passed arguments.
        Student(int roll , String name , float marks){
            this.roll = roll;
            this.name = name;
            this.marks = marks;

        }

    }


    static void fun(){

        // greeting()  Error---> As in static function a non-static function cannot be called directly

        classesnObjects obj = new classesnObjects();
        obj.greeting();     // An non-static function can be called by declaring and object and calling it through it 

    }

    void greeting(){

    }


    
}
