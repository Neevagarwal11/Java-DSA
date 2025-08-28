package BinarySearch.Leetcode;

public class BinarySearch153 {

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(findMin(arr));
    }


    static public int findMin(int[] nums) {
        int res=nums[0];
        int left =0;
        int right = nums.length-1;
        
        while(left<=right){
            
            if(nums[left] < nums[right]){
                res = Math.min(res,nums[left]);
                break;
            }

            int mid = (left+right) /2;
            res = Math.min(res ,nums[mid]);

            if(nums[mid] >= nums[left]){
                left = mid +1;
            }else{
                right = mid -1; 
            }
            
        }
        return res;
        
    }
    
}
