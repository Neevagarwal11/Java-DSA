package Leetcode;

public class CyclicSort287 {

    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 4, 2 };
        int ans = findDuplicate(arr);
        System.out.println(ans);
    }

    static public int findDuplicate(int[] nums) {
        int i = 0;

        while(i < nums.length){

            if(nums[i] != i+1){

                int correct = nums[i]-1; 
                
                if(nums[i] != nums[correct]){
                    swap(nums , i , correct);
                }else{
                    return nums[i];
                }
            }else{
                i++;
            }
        }return-1;

    }

    
    static void swap(int[] arr , int first ,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}

