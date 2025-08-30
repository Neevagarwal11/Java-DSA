package BinarySearch.Leetcode;

public class Leetcode33 {

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(search(arr,0));
    }


    static public int search(int[] nums, int target) {

        int left =0 ; 
        int right = nums.length -1;

        while(left <=right){
            int mid = left+(right-left)/2;

            if(nums[mid] == target){
                return mid;
            }

            // Check which  part of sorted array is the mid pointer 

            if(nums[left] <= nums[mid]){

                if(target > nums[mid] || target < nums[left]){
                    left = mid +1;
                }else{
                    right = mid -1;
                }


            }else{

                if( target <nums[mid] || target > nums[right]){
                    right = mid-1;
                }else{
                    left =mid +1;
                }

            }

          
        }

        return -1;
    }
}
