package BinarySearch.Leetcode;

public class BinarySearch1482 {

    public static void main(String[] args) {
        int[] arr = {1,10,3,10,2};
        System.out.println(minDays(arr ,3,1));
    }

    static public int minDays(int[] bloomDay, int m, int k) {

        if(bloomDay == null || m*k > bloomDay.length || bloomDay.length==0) return -1;
        int lowerbound = bloomDay[0];
        int upperbound = bloomDay[0];


        for(int i=1 ; i< bloomDay.length ; i++){
            lowerbound = Math.min(lowerbound ,bloomDay[i]);
            upperbound = Math.max(upperbound , bloomDay[i]);
        }

        while(lowerbound < upperbound){

            
            int mid = lowerbound+(upperbound-lowerbound)/2;
            
            if(canMake(bloomDay,m,k , mid)){
                upperbound = mid;
            }else{
                lowerbound = mid +1;
            }
            
        }
     
            return lowerbound;
        
    }

    static boolean canMake(int[] bloomDay  , int total , int flowers , int mid){
        int flowerCount =0;

        for(int i=0 ; i < bloomDay.length ; i++){
            if(bloomDay[i] <= mid){
                flowerCount++;
                if(flowerCount == flowers){
                    total--;
                    flowerCount =0;
                    if(total ==0) return true;
                }

            }else {
                flowerCount=0;
            }
        }
        return false;
        

    }
    
}
