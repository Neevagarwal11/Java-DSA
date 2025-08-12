

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
//       String greet =  greet();
//        System.out.println(greet);
//        sum();
        int ans = sum3(20 ,40);
        System.out.println(ans);
    }


        /*      ----->SYNTAX<------
                return_type name(){
                    //body
                    return statement;
                 }
         */

    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Num1 :");
        int num1= in.nextInt();
        System.out.println("Num2 :");
        int num2 = in.nextInt();
        int sum = num1+num2;
        System.out.println("Sum = " + sum);
    }

    static String greet(){
        String greeting = "This is a string return";
        return greeting;
    }


    //With Parameters

    static int sum3(int a , int b){
        int sum  = a +b;
        return sum;
    }

}
