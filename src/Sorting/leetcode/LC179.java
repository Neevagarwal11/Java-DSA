package Sorting.leetcode;
import java.util.Arrays;



public class LC179 {

    public static void main(String[] args) {
        int[] arr = {3,30,34,5,9};
        System.out.println(largestNumber(arr));
    }

    static public String largestNumber(int[] nums) {


        // Convert int array into string array
        int n = nums.length;
        String[] s = new String[n];
        for(int i =0; i<n ; i++){
            s[i] = String.valueOf(nums[i]);
        }

        // Sorts the array of strings in 
        Arrays.sort(s , (a,b) -> (b+a).compareTo(a+b)); //O(nlongn)

        StringBuilder sb = new StringBuilder();
        for(String str :s ){
            sb.append(str);
        }
        
        String result = sb.toString();
        return result.startsWith("0") ? "0" : result;

    }
    
}
