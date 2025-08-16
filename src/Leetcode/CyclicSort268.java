package Leetcode;
import java.util.Arrays;

// https://leetcode.com/problems/missing-number/description/
// Amazon

public class CyclicSort268{

    public  void main(String[] args){
        int[] arr = {1,4,2,5};
        int ans = missingNumber(arr);
        System.out.println(ans);
        
    }

    int missingNumber(int[] nums){


        int i=0;
        while(i< nums.length){
            int correct = nums[i];
            if(nums[i]<nums.length && nums[i] != nums[correct]){
                swap(nums , i , nums[i]);
            }else{
                i++;
            }
        }


        for(int index=0 ; index< nums.length ; index++ ){

            // Case1: If any element from  the middle of the 0-n range is missing.
            if(nums[index] != index){
                return index;
            }
        }
        
        // Case2 : if the last element or the nth element is missing from the array.
        return nums.length;


    }

    void swap(int[] arr ,int first ,int second){
        int temp= arr[first];
        arr[first] = arr[second];
        arr[second]  =temp;

    }





}