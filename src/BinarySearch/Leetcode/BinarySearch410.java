package BinarySearch.Leetcode;

public class BinarySearch410 {

    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        System.out.println(splitArray(arr ,2));
    }
    
    static public int splitArray(int[] nums, int k) {
        int lowerbound =0;
        int upperbound =0;

        for(int i=0 ; i< nums.length ; i++){
            lowerbound = Math.max(lowerbound , nums[i]);
            upperbound += nums[i];
        }

        while(lowerbound < upperbound){

            int mid = lowerbound + (upperbound-lowerbound)/2;
            if(canSplit(nums ,mid , k)){
                upperbound = mid;
            }else{
                lowerbound = mid +1;
            }   
        }

        return lowerbound;
        
    }

    static boolean canSplit(int[] nums , int sum , int k){
        int count = 1 ;
        int total =0;

        for(int i=0; i< nums.length ;i++){

            total += nums[i];
            if(total > sum){
                total = nums[i];
                count++;
            }
            if(count > k) return false;
        }
        return true;

    }

}
