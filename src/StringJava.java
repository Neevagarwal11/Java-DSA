import java.util.ArrayList;

public class StringJava {
    public static void main(String[] args) {
        // String a ="Neev";
        // String b ="Neev";
        // System.out.println(a == b); //Checks if the reference of a and b are same

        // String a = new String("Neev");
        // String b = new String("Neev");  // Creates two different objects in heap memory outside of String pool
        // System.out.println(a == b); // true

        // System.out.println(a.equals(b)); // true  //Checks only the value of a and b

        // System.out.println(a.charAt(0));   //N

        

        //--------->Pretty Printing
        float num = 1.1234567f;
        System.out.printf("Formatted number is: %.2f\n" ,num );

        String a = "Neev";
        String b = "Agarwal";
        System.out.printf("Hi I'm %s of the house %s" , a,b);


        System.out.println((char)('a' + 3));
        System.out.println("a" + 3); //a3     //integer will be converted into string by the .tostring method in the print class. 
        System.out.println("Neev"  + new ArrayList<>());

        // StringBuilder ------>allows us to create a mutable string...as a normal string this will not create new string the heap memory for the for loop instead will make changes in the same string saving the memory of the heap and creting no garbage memory.

        StringBuilder builder = new StringBuilder();
        for(int i= 0; i<26 ; i++){
            char ch = (char)('a'+i);
            builder.append(ch);
        }

        System.out.println(builder);

        // String Palindrome
        




    }
    
}
