

import java.util.Scanner;

public class Questions {

// -------->Checking if the number is Prime or Not<-----------
//
//    public static void main(String[] args) {
//
//
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//
//        boolean ans = isPrime(n);
//        if(ans == false){
//            System.out.println("Not prime");
//        }
//        else{
//            System.out.println("Prime");
//        }
//
//    }
//
//    static boolean isPrime(int n){
//        if(n <=1){
//            return false;
//        }
//        int c =2;
//        while(c*c <=n){
//            if(n %c ==0){
//                return false;
//            }
//            c++;
//        }
//        if(c*c > n){
//            return true;
//        }
//        return false;
//    }



// ----------->Taking out the armstrong number<--------------------

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//
//        boolean ans = isArmst(n);
//        if(ans == true){
//            System.out.println("IS Armstrong Number");
//        }
//        else{
//            System.out.println("Not an Armstrong Number");
//        }

        for (int i =100 ; i<1000 ; i++){
            if(isArmst(i)){
                System.out.print(i +" ");
            }
        }
    }


    static boolean isArmst(int n){
        int original= n;
        int sum = 0;

        while(n > 0){
            int rem = n %10;
            n = n/10;
            sum = sum + rem*rem*rem;

        }
        if(sum == original){
            return true;
        }
        else{
            return false;
        }
    }





}
