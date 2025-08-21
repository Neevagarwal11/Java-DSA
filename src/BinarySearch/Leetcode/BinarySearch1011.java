package BinarySearch.Leetcode;

public class BinarySearch1011 {

    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7,8,9,10};
        System.out.println(shipWithinDays(arr ,5));

    }



    static public int shipWithinDays(int[] weights, int days) {

        int lowerbound = 0;
        int upperbound = 0;
        for(int w=0 ; w<weights.length ; w++){
            lowerbound = Math.max(lowerbound , weights[w]);
            upperbound += weights[w];
        }
        int mid;
        int ans = upperbound;


        while(lowerbound <= upperbound){
            mid= lowerbound + (upperbound -lowerbound)/2;

            if(canShip(weights, days , mid)){
                ans = mid;
                upperbound = mid-1;
            }else{
                lowerbound = mid +1;
            }
        }

        return ans ;
        
    }

    static boolean canShip(int[] weights , int days , int capacity){
        int requiredDays =1;
        int currentWeight = 0;

        for(int i =0 ; i<weights.length ; i++) {
            if(currentWeight +weights[i] > capacity){
                requiredDays++;
                currentWeight=0;
            }
            currentWeight += weights[i];
        }
        if(requiredDays > days) return false;
        return true;

    }


}
