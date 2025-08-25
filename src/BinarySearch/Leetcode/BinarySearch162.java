package BinarySearch.Leetcode;


class BinarySearch162{

    public static void main(String[] args) {
        int[] arr ={1,2,3,1};
        System.out.println(findPeakElement(arr));
    }

    static public int findPeakElement(int[] nums) {

        int left =0;
        int right = nums.length-1;  

        while(left< right){
            int mid = left + (right-left)/2;

            if(mid >0 && nums[mid] < nums[mid-1]){
                right = mid -1;
            }else if(mid < nums.length-1 && nums[mid] < nums[mid+1]){
                left = mid+1;
            }else{
                return mid;
            }
        }

        return left;
        
    }


}