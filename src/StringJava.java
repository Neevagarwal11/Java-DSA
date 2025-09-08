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
        // float num = 1.1234567f;
        // System.out.printf("Formatted number is: %.2f\n" ,num );

        // String a = "Neev";
        // String b = "Agarwal";
        // System.out.printf("Hi I'm %s of the house %s" , a,b);


        // System.out.println((char)('a' + 3));
        // System.out.println("a" + 3); //a3     //integer will be converted into string by the .tostring method in the print class. 
        // System.out.println("Neev"  + new ArrayList<>());

        // StringBuilder ------>allows us to create a mutable string...as a normal string this will not create new string the heap memory for the for loop instead will make changes in the same string saving the memory of the heap and creting no garbage memory.

        // StringBuilder builder = new StringBuilder();
        // for(int i= 0; i<26 ; i++){
        //     char ch = (char)('a'+i);
        //     builder.append(ch);
        // }

        // System.out.println(builder);

        // // String Palindrome

        // String str = "abcddcba";
        // System.out.println(isPalindrome(str));


        // -------------------->Pattern Questions

            // 1.no. of lines = no of rows  = no of times outer loop will run
            // 2.Identify for every row number
                    // i.how many cols are there
                    //ii.Types of elements in col
            // 3. What do you need to print

            pattern6(5);




    }

    static void pattern1(int n){                        
        for(int row =1 ; row <=n ; row++){

            for(int col=1; col<=row ; col++){
                System.out.print("*");
            }
            System.out.println();
        }
        // *
        // **
        // ***
        // ****
    }

    static void pattern2(int n){
        for(int row = 1 ; row<=n ; row++){
            for(int col =1 ; col <=n-row+1 ; col++){
                System.out.print("*");
            }
            System.out.println();
        }
        // ****
        // ***
        // **
        // *
    }

    static void pattern3(int n){
        for(int row = 1; row<=n ; row++){
            for(int col =1 ; col <=row ; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
        // 1 
        // 1 2
        // 1 2 3
        // 1 2 3 4
        // 1 2 3 4 5
    }

    static void pattern4(int n){
        for(int row = 0 ; row<2*n ; row++){

            int totalColsInRow = row > n ? 2*n -row : row;
            for(int col = 0; col<totalColsInRow ; col++){
                System.out.print("* ");
            }

            System.out.println();

        }
        // *
        // * *
        // * * *
        // * * * *
        // * * * * *
        // * * * *
        // * * *
        // * *
        // *
    }

    static void pattern5(int n ){
        for(int row =0 ; row<2*n ; row++){

            int totalColsInRow = row>n ? 2*n -row : row; 
            int noOfSpaces = n- totalColsInRow;
            for(int space=0 ; space<noOfSpaces; space++){
                System.out.print(" ");
            }

            for(int col =0; col < totalColsInRow ; col++){
                System.out.print("* ");
            }

            System.out.println();
        }

//     *
//    * *
//   * * *
//  * * * *
// * * * * *
//  * * * *
//   * * *
//    * *
//     *
}


    static void pattern6(int n){

        for(int row =1 ; row<=n ; row++){

            int noOfSpaces = n - row;
            for(int space=0 ; space <=noOfSpaces ; space++){
                System.out.print("  ");
            }


            for(int col =row ; col >=1 ; col--){
                System.out.print(col + " ");
            }
            for(int col =2 ; col<=row ; col++){
                System.out.print(col + " ");
            }

            System.out.println();
        }
//           1 
//         2 1 2 
//       3 2 1 2 3
//     4 3 2 1 2 3 4
//   5 4 3 2 1 2 3 4 5

    }






    static boolean isPalindrome(String str){
        str = str.toLowerCase();
        if(str == null|| str.length() == 0){
            return true ;
        }
        for(int i=0; i <= str.length() /2 ; i++){
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);

            if(start != end){
                return false;
            }
        }
        return true;
    }
    
}
