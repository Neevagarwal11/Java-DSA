

import java.util.Scanner;

public class Binary_Search {

    public static void main(String[] args) {
        int[] arr  = new int[10];

        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter the elements of the Array");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextInt();
            }
            System.out.println("Enter Target Element: ");
            int tar = in.nextInt();

            int ans = search(arr , tar);
            if(ans ==-1){
                System.out.println("The element does not exist in the Array");
            }
            else{
                System.out.println("The element exists in the " + ans + " index");
            }
        }

    }

    //Returning the index of the target
    //if doesn't exist return -1
    static int search(int[] arr , int target){

        int start =0 ;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + ((end-start)/2);

            if(target > arr[mid]){
                start = mid +1 ;
            }else if (target < arr[mid]){
                end = mid -1 ;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

}
