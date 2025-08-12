

import java.util.Arrays;

public class BS2D{

    public static void main(String[] args) {

        //Not Strictly sorted.

//    int[][] arr = {
//            {1,5,7,10},
//            {2,6,8,12},
//            {4,9,11,16}
//    };
//    int tar = 12;
//    int[] ans= search(arr , tar);
//    System.out.println(Arrays.toString(ans));

        //Strictly Sorted

        int[][] arr ={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println(Arrays.toString(searchsort(arr , 6)));

    }

    //Sorted

        //Searching in the 2 rows remaining after BS in sorted 2D Array.
    static int[] searchrow(int[][] mat , int row , int cstart , int cend , int target){
        while(cstart<cend){
            int mid = cstart + (cend - cstart)/2;
            if(mat[row][mid] ==target){
                return new int[] {row,mid};
            } else if (mat[row] [mid] < target) {
                cstart = mid+1;
            }
            else{
                cend = mid-1;
            }
        }
        return new int[] {-1,-1};
    }

    static int[] searchsort(int[][] arr , int tar){
            int rows = arr.length;
            int col = arr[rows].length;

            if(rows ==1 ){
                return searchrow(arr , 0 , 0 , col-1 , tar);
            }

            //run loop till 2 rows are remaining.
            int  rstart = 0;
            int rend = rows-1;
            int cmid = col /2;

            while(rstart < (rend-1)) {       //While this is true it will have more than 2 nums of rows which is needed to be eliminated.
                int mid = rstart + ((rend - rstart) /2) ;

                if(arr[mid][cmid] == tar){
                    return new int[] {mid , cmid};
                }
                if(arr[mid][cmid] < tar){
                    rstart = mid;
                }
                else{
                    rend = mid;
                }

            }
            //Now we have 2 rows
            //Check wheather the target is in the col of 2 rows.

            if(arr[rstart][cmid] == tar){
                return new int[] {rstart , cmid};
            }
            if(arr[rstart+1][cmid] == tar){
                return new int[]{rstart+1 ,cmid};
            }

            //Search in 1st part
            if(tar <= arr[rstart][cmid-1]){
                return searchrow(arr , rstart, 0 , cmid-1 , tar);
            }
            //Search in 2nd part
            if(tar >= arr[rstart][cmid+1]){
                return searchrow(arr , rstart, cmid+1 , col-1 , tar);

            }
            //Search in 3rd part
            if(tar <= arr[rstart+1][cmid-1]){
                return searchrow(arr , rstart+1, 0 , cmid-1 , tar);

            }
            //Search in 4rt part
            if(tar >= arr[rstart+1][cmid+1]){
                return searchrow(arr , rstart+1, cmid+1 , col-1 , tar);

            }
        return new int[] {-1,-1};
    }


    //Not Strictly sorted

    static int[] search(int[][] mat ,int  target){
        int row = 0;
        int col = mat[row].length-1;

        while(row < mat.length && col>=0){
            if(mat[row][col] == target){
                return new int[] {row,col};
            } else if(mat[row][col] <target){
                row++;
            }else{
                 col--;
            }
        }
        return new int[] {-1,-1};
    }
}
