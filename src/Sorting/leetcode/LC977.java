package Sorting.leetcode;

import java.util.Arrays;
// import java.util.Arrays.sort;

public class LC977 {

    public static void main(String[] args) {
        int[] arr = {-4,-1,0,3,10};

        System.out.println(Arrays.toString(sortedSquares(arr)));
    }

    static public int[] sortedSquares(int[] nums) {

        for(int i = 0 ; i<=nums.length-1 ; i++){
            nums[i] = nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;

    }

    
}
