
package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class ceiling {

    //1. Ceiling    ----- smallest number >= target
    public static void main(String[] args) {
    int[] arr = {-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
    int target = 21;
    int ans = ceilingNum(arr,target);
    System.out.println(arr[ans]);


    }

    static int ceilingNum(int[] arr , int target){
        int start = 0;
        int end = arr.length -1 ;

        while(start <= end){
            int mid = start +(end-start)/2;

            if( target < arr[mid]){
                end = mid -1 ;
            } else if (target > arr[mid]) {
                start = mid+1;
            }else{
                return mid;
            }

        }

        return start ; // Target not in arr Here the midpoint and the start will be the pointing to the same value which is the ceiling value.

        //For Floor
            // return end; In the floor case the largest number <= target will be returned.


    }

}
