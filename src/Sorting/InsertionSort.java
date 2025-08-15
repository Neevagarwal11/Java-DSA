package Sorting;
import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args){
        int[] arr = {4,2,5,6,3,9 , 0 ,-22 , -53};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }


    static void insertionSort(int[] arr){

        for(int i=0 ; i< arr.length -1 ; i++){  
            for(int j = i+1 ; j>0 ; j--){   //j always greater than 0 and i+1 initially. Used to check the j-1 element if it's greater then swaps

                if(arr[j] < arr[j-1]){
                    swap(arr , j , j-1);
                }else{
                    break; 
                }

            }

        }
        
    }

    static void swap(int[] arr , int first  , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }

    
}
