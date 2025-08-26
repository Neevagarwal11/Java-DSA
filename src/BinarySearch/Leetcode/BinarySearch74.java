package BinarySearch.Leetcode;

public class BinarySearch74 {

    public static void main(String[] args) {
        int[][] arr ={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(searchMatrix(arr , 9));
    }

    static public boolean searchMatrix(int[][] matrix, int target) {
        int rows =  matrix.length;
        int cols = matrix[0].length;

        int top = 0;
        int bot = rows-1;

        while(top<=bot){
            int row = (top+bot) /2;
            if(target > matrix[row][cols -1]){
                top = row+1;
            }else if(target < matrix[row][0]){
                bot = row-1;
            }else{
                break;
            }
        }
        if(top > bot){
            return false;
        }
        int row = (top +bot) /2;
        int left =0;
        int right = cols-1; 

        while(left <= right){
            int mid= (left+right)/2;
            if(target > matrix[row][mid]){
                left = mid +1 ;
            }else if(target < matrix[row][mid]){
                right = mid -1;
            }else{
                return true;
            }
        }
        return false;
    }
    
}
