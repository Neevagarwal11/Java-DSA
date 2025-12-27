package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

//This uses a  stack memory where all the funtions that are called are stored in the stack until the base condition is met.

//To identify if recursion can be used , check if the problem can be broken into smaller subproblems.

//When we write a recursive function into a formula it is called a recurrence relation.

public class recursion {

    public static void main(String[] args) {

        //Fibonachi Number
        // System.out.println(fibo(50));   //Will not give answer as it uses linear recursion and will take too much time. Hence very inefficient. Can be easily solved using DP.


        //Binary Search
        int[] arr = {1,3,5,6,8,9,11,15};
        // System.out.println(search(arr ,3, 0 , arr.length -1));        
        
        // Rotated Binary Search 
        // System.out.println(searchRotated(arr, 9, 0, arr.length-1));

        // Reverse a number
        // System.out.println(rev2(1234));


        // In ArrayList
        ArrayList<Integer> ans = findAllIndex2(arr, 5, 0);
        // System.out.println(findAllIndex2(arr, 5, 0));



        // Pattern 1 
        pattern1(4, 0);

        // Pattern 2
        pattern2(4, 0);


        // Bubble Sort
        int[] arr2 ={4,2,3,1};
        bubble(arr2 , arr2.length-1 , 0);
        // System.out.println(Arrays.toString(arr2));


        // Selection Sort
        int[] arr3 = {4,3,2,1};
        selection(arr3, arr3.length, 0, 0);
        // System.out.println(Arrays.toString(arr3));


        // Merge Sort

        int[] arr4 = {5,4,3,2,1};
        arr4 = mergeSort(arr4);
        System.out.println(Arrays.toString(arr4));



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

    static int fact(int n){     //Factorial of a number
        if(n<=1){
            return 1;
        }

        return n* fact(n-1);
    }

    static int sumOfDigits(int n){
        if(n ==0){
            return 0;
        }

        return (n%10) + sumOfDigits(n/10);
    }


    static int sum=0;
    static void rev1(int n){

        if(n==0){
            return;
        }
        int rem = n%10;
        sum = sum *10 +rem;
        rev1(n/10);
    }

    static int rev2(int n){

        int digits = (int)(Math.log10(n)) + 1; //Returns the total number of digits
        return helper(n,digits);
    }
    private static int helper(int n, int digits){
        if(n%10 == n){
            return n;
        }
        int rem = n%10;
        return (int) (rem * Math.pow(10,digits-1) + helper(n/10 ,digits-1));
    }


    static int linearSearch(int[] arr , int target , int index ){
        if(index == arr.length){
            return -1;
        }

        if(arr[index]== target){
            return index;
        }else{
            return linearSearch(arr, target, index+1);
        }

    }


    // In a ArrayList

    static ArrayList<Integer> findAllIndex(int[] arr , int target , int index , ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }

        if(arr[index] == target){
            list.add(index);
        }

        return findAllIndex(arr, target, index+1 , list);
    }


    // without passing ArrayList in parameter       ---------Not very optimized as new ArrayList is been made in each recursion call. 
    static ArrayList<Integer> findAllIndex2(int[] arr , int target , int index){

        ArrayList<Integer> list = new ArrayList<>();


        if(index == arr.length){
            return list;
        }


        if(arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> ansFromBelow = findAllIndex2(arr, target, index+1);    //In this the list coming from below carries the the answers from the above steps if there is any.

        list.addAll(ansFromBelow);

        return list;

    }



    // Rotated Binary Search
    static int searchRotated(int[] arr ,int target , int s , int e){
        if(s>e){
            return -1;
        }

        int m = s + (e-s)/2;
        if(arr [m] == target){
            return m;
        }

        if(arr[s] <= arr[m]){
            if(target >=arr[s] && target <= arr[m]){
                return searchRotated(arr,target,s,m-1);
            }else{
                return searchRotated(arr,target,m+1,e);
            }
        }

        if(target >= arr[m] && target <= arr[e]){
            return searchRotated(arr, target , m+1 ,e);
        }
        
        return searchRotated(arr, target , s ,m-1);


    }



    static void pattern1(int r , int c){
        if (r ==0){
            return;
        }
        if(c<r){
            System.out.print('*');
            pattern1(r, c+1);
        }else{
            System.out.println();
            pattern1(r-1, 0);
        }

    }

    
    static void pattern2(int r , int c){
        if (r ==0){
            return;
        }
        if(c<r){
            pattern2(r, c+1);
            System.out.print('*');
        }else{
            pattern2(r-1, 0);
            System.out.println();
        }

    }


    // Bubble Sort

    static  void bubble(int[] arr, int r , int c){
        if(r==0){
            return;
        }
        if(c<r){

            if(arr[c] > arr[c+1]){
                int temp = arr[c];
                arr[c] =arr[c+1];
                arr[c+1] = temp;
            }

            bubble(arr, r, c+1);
        }else{
            bubble(arr , r-1 , 0);
        }

    }



    // Selection Sort

    static void selection(int[] arr , int r , int c , int max){

        if(r ==0){
            return;
        }

        if(c<r){
            if(arr[c] > arr[max]){
                selection(arr, r, c+1, c);
            }else{
                selection(arr, r, c+1, max);
            }
        }else{
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp; 
            selection(arr, r-1, 0, 0);
        }


    }


    // Merge Sort

    static int[] mergeSort(int[] arr){

        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length /2 ;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left,right);

    }

    private static int[] merge (int[] first , int[] second){

        int[] mix = new int[first.length + second.length];

        int i =0;
        int j=0;
        int k =0;

        while( i<first.length && j<second.length){

            if(first[i] < second[j]){
                mix[k] =first[i];
                i++;
            }else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        // If any of the arrays is of greater length add the remaining elements the mix array.

        while(i<first.length){
            mix[k] = first[i];
            i++;
            k++;
        }

        while(j<second.length){
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;


    }





}
