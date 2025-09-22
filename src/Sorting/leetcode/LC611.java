package Sorting.leetcode;
import java.util.Arrays;

public class LC611 {

    public static void main(String[] args) {
        int[] arr = {2,2,3,4};
        System.out.println(triangleNumber(arr));
    }



    static public int triangleNumber(int[] nums) {

        int  n = nums.length;
        int count =0; 

        Arrays.sort(nums);
        for(int i=0; i<n-2 ; i++){
            for(int j=i+1 ; j<n-1 ; j++){
                for(int k =j+1 ; k <n ; k++){
                    if(nums[i] + nums[j] > nums[k]){
                        count++;
                    }
                }
            }
        }
        return count;
        
    }
    
}
