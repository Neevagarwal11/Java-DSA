package Recursion;

//This uses a  stack memory where all the funtions that are called are stored in the stack until the base condition is met.

//To identify if recursion can be used , check if the problem can be broken into smaller subproblems.

//When we write a recursive function into a formula it is called a recurrence relation.

public class recursion {

    public static void main(String[] args) {

        //Fibonachi Number
        // System.out.println(fibo(50));   //Will not give answer as it uses linear recursion and will take too much time. Hence very inefficient. Can be easily solved using DP.


        //Binary Search
        int[] arr = {1,3,5,6,8,9,11,15};
        System.out.println(search(arr ,3, 0 , arr.length -1));        


    }

    static int fibo(int n){

        //base Conditions
        if(n < 2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }

    static int search(int[] arr , int target , int s , int e){      //if the variables are needed in the future function calls put it in argument else put it in the body.

        if(s>e){
            return -1; 
        }
        int m = s+ (e-s)/2;
        if(arr[m] == target){
            return m;
        }
        if(target < arr[m]){
            return search(arr , target , s , m-1);
        }
        return search(arr , target , m+1 , e);

    }




    
}
