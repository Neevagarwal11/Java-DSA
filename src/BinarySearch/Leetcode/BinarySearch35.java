package BinarySearch.Leetcode;


public class BinarySearch35 {

    public static void main(String[] args) {
        int[] arr ={1,3,5,6};
        System.out.println(searchInsert(arr , 58));
        
    }

    static public int searchInsert(int[] nums, int target) {
        int start = 0;
        int last = nums.length - 1;

        while(start <= last){
            int mid = start + (last-start)/2;

            if(nums[mid] <target){
                start = mid +1 ;
            }else if(nums[mid] > target){
                last= mid -1;
            }else if(nums[mid] == target){
                return mid;
            }
        }

        return start;
    }
}
