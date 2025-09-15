package Sorting.leetcode;
import java.util.Arrays;


public class LC747 {

    public static void main(String[] args) {
        int[] arr ={3,6,1,0};
        System.out.println(dominantIndex(arr));
    }

    static public int dominantIndex(int[] nums) {

        int maxValue =0 ;
        int index = -1;
        for(int i =0 ; i<nums.length ; i++){
            if(nums[i] > maxValue){
                maxValue =nums[i];
                index = i;
            }
        }

        for(int i=0 ; i<nums.length ;i++){
            if(nums[i] *2 > maxValue && i!=index) return -1;
        }
        return index;
    }


    
}
