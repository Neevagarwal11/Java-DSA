package Sorting;

import java.util.Arrays;
//Also known as Sinking Sort & Exchange Sort 

public class Bubble_Sort {

    public static void main(String[] args) {

        int[] arr = { 5, 4, 3, 2, 1 };
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void bubble(int[] arr) {

        boolean swapped;

        for (int i = 0; i < arr.length; i++) {
            swapped = false;

            for (int j = 1; j < arr.length - i; j++) {

                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped=true;
                }
            }

            //After 1st iteration if no swap occured that means array is already sorted thus it breaks the outer loop minimizing the time complexity.
            if(!swapped){
                break;
            }

        }

    }

}
