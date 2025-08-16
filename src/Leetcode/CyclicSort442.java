package Leetcode;
import java.util.ArrayList;
// https://leetcode.com/problems/find-all-duplicates-in-an-array/
// Amazon Microsoft

import java.util.List;

public class CyclicSort442 {

    public static void main(String[] args){

        int[] arr= {4,3,2,7,8,8,3,1};
        CyclicSort442 obj = new CyclicSort442();
        List<Integer> ans = obj.findDuplicates(arr);
        System.out.println(ans);

    }


    public List<Integer> findDuplicates(int[] nums) {

        int i=0;
        while(i<nums.length){
            int correct = nums[i] -1;

            if(nums[i] != nums[correct]){
                swap(nums , i , correct);
            }else{
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();

        for(int index=0 ; index < nums.length ; index++){

            if(nums[index] != index+1){
                ans.add(nums[index]);
            }

        }
        return ans;

    }

    static void swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    
}
