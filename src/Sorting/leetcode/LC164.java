package Sorting.leetcode;
import java.util.Arrays;


public class LC164 {

    public static void main(String[] args) {
        int[] arr = {3,6,11,1};
        System.out.println(maximumGap(arr));

    }

    static public int maximumGap(int[] nums) {

        if(nums == null || nums.length < 2) return 0;

        Arrays.sort(nums);

        int maxG = nums[1] - nums[0];

        for(int i=2 ; i < nums.length; i++){

            int diff = nums[i] - nums[i-1];
            if(diff > maxG){
                maxG = diff;
            }
        }
        return maxG;

    }
    
}
