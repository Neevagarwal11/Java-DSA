package BinarySearch.Leetcode;

public class LC374 {

    public int guessNumber(int n) {

        int left =1;
        int right =n;

        while(left<right){
            int mid = (left+right) /2;

            int res = guess(mid);

            if(res >0){
                left = mid +1;
            }else if(res<0){
                right = mid -1;
            }else{
                return mid;
            }
        }
    }
    
}
