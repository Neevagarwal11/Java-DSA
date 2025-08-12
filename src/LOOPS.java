

import java.util.Scanner;

public class LOOPS {
    public static void main(String[] args) {

                //CONDITIONS

//        Scanner sal = new Scanner(System.in);
//        int salary = sal.nextInt();
//        if (salary > 10000) {
//            salary =+ 2000;
//        }else{
//            salary =+1000;
//        }
//        System.out.println(salary);


//        LOOPS

        //FOR LOOP

//        for(int i =1 ; i <=5 ; i++){
//            System.out.println(i + " for loop");
//        }

        //While loop

//        int num = 1;
//        while(num<=5){
//            System.out.println("Hello NEEV (While Loop)");
//            num+=1;
//        }


        //DO While Loop
//        int n = 1;
//        do{
//            System.out.println(n);
//            n++;
//        }while(n<=5);



        //Questions --->Find the largest of the 3 numbers

//                    Scanner inp = new Scanner(System.in);
//                    int a = inp.nextInt();
//                    int b = inp.nextInt();
//                    int c = inp.nextInt();
//
//                    int max = a;
//                    if(b  > max){
//                        max = b;
//                    }
//                    if(c > max){
//                        max = c;
//                    }
//
//                    System.out.println(max);


        //Case Check

//                    Scanner in  = new Scanner(System.in);
//                    char c = in.next().trim().charAt(0);
//
//                    if ( c >='a' && c <= 'z'){
//                        System.out.println("Lowercase");
//                    }
//                    else if (c >= 'A' && c<= 'Z') {
//                        System.out.println("Uppercase");
//                    }
//                    else{
//                        System.out.println("Digit");
//                    }



        //FIBONACCI NUMBERS


//    Scanner in = new Scanner(System.in);
//    int n = in.nextInt();
//    int a = 0;
//    int b = 1;
//    int count = 2;
//    while(count <= n){
//        int temp = b;
//        b = b+a;
//        a = temp;
//        count++;
//
//    }
//        System.out.println(b);


        //Counting Digits

//        int  n = 5165456;
//        int count =0;
//
//        while(n>0){
//            int  rem = n%10;
//            if(rem == 5){
//                count++;
//            }
//                n = n/10;
//        }
//
//        System.out.println(count);



        //Reverse the Number

//        int n = 147626;
//        int ans =0;
//
//        while(n>0){
//            int rem = n%10;
//            n = n/10;
//            ans = ans *10+rem;
//        }
//
//        System.out.println(ans);



        //CALCULATOR

        Scanner in = new Scanner(System.in);
        int ans = 0;

        while(true){
            System.out.println("Enter Operator: ");
            char op = in.next().trim().charAt(0);

            if(op == '+' || op == '-' || op=='*' || op=='/' || op=='%'){

                System.out.println("Enter 2 numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if (op =='+'){
                    ans= num1+num2;
                }
                if(op == '-'){
                    ans = num1-num2;
                }
                if(op == '*'){
                    ans=num1*num2;
                }
                if(op == '/'){
                    if(num2 !=0){
                        ans = num1/num2;
                    }
                }
                if(op == '%'){
                    ans= num1%num2;
                }

                System.out.println(ans);


            } else if (op == 'x' || op =='X') {
                break;
            }
            else{
                System.out.println("Invalid Input!!");
            }
        }





    }
}
