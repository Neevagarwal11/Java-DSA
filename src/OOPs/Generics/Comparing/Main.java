package OOPs.Generics.Comparing;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student neev = new Student(360, 918);
        Student kunal = new Student(361, 99);

        if(neev.compareTo(kunal) < 0){
            System.out.println("Kunal has more marks");
        }else{
            System.out.println("Neev has more marks");
        }
        
c
        // Lambda Expressions for comparision 
        Student[] list = {neev,kunal};
        Arrays.sort(list , (o1,o2) -> (int)(o1.marks - o2.marks));


    }
}