

public class StringJava {
    public static void main(String[] args) {
        // String a ="Neev";
        // String b ="Neev";
        // System.out.println(a == b); //Checks if the reference of a and b are same

        String a = new String("Neev");
        String b = new String("Neev");  // Creates two different objects in heap memory outside of String pool
        // System.out.println(a == b); // true

        System.out.println(a.charAt(0));   //N


    }
    
}
