package OOPs;

import java.util.Arrays;

public class classesnObjects {

    // 1. It is also called used defined data structure
    // 2. It's a name group of properties and functions 
    // 3. Class is a logical construct where as object is the physical construct.  

    public static void main(String[] args) {
        
        // Declaring the student 
    Student neev = new Student();  //Dynamically allocates memory and return a ref to the object stored in heap memory.


    // neev.roll = 21;
    // neev.name = "Neev Agarwal";
    // System.out.println(neev.roll);
    // System.out.println(neev.name);

        neev.greeting();   

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
    
}
