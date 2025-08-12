

public class Arrays {
    public static void main(String[] args) {
        // int[] rno = new int[5];     // This is to make an array which could store 5 int values.
        // int[] rnos = {19,21,22,14};
        //1. Array objects are in heap
        //2. Heap Objects are not continuos.
        //3. Array Declaration happens at COMPILE time but actual creation of Array in the memory happens at RUNTIME. DYNAMIC MEMORY ALLOCATION.

        //1. Strings are immutable in JAVA whereas Arrays are mutable

//        int[] arr = new int [5];
//        Scanner in = new Scanner(System.in);
//
//        //input using FOR LOOP
//        for (int i = 0 ; i<arr.length ; i++){
//            arr[i] = in.nextInt();
//        }
//
//        //Displaying Using for Loop
////        for(int i = 0 ; i<arr.length ; i++){
////            System.out.print(arr[i] +" ");
////        }
//
//        System.out.println(java.util.Arrays.toString(arr));
//
//
//
//        //Array Of Strings
//
//        String[] str = new String[4];
//
//        for (int j =0 ; j< str.length ; j++){
//            str[j] = in.next();
//        }
//
//        System.out.println(java.util.Arrays.toString(str));



        //2D ARRAYS

//        int [][] array = new int [3] [2]; //Specifying the no. of columns are not mandatory.
//
//        int[][] arr2D = {
//                {2,3,4},
//                {32,54,3,34},
//                {34,231,5345}
//        };
//        System.out.println(arr2D[2][1]);
        
        //Taking input using for Loop
//
//        Scanner in = new Scanner(System.in);
//
//
//        for (int row = 0; row < array.length ; row++) {
//
//            for (int col = 0; col < array[row].length ; col++) {
//                        array[row][col] = in.nextInt();
//            }
//        System.out.println(java.util.Arrays.toString(array[row]));
//        }



        //ArrayList // Dynamic Array

        //Same as array for any undefined/unknown size of an Array.
        // If an initial size is given let's say 5, when the arraylist is half full an new arraylist is created double the size of the inital arraylist made and the old one is deleted.

//        ArrayList<Integer> = new ArrayList<>();




        //Questions

//        1.Swap
//
//        int[] arr = {23, 3,543,323 ,3445};
//        swap(arr , 2,0);



//            2. Finding MAX Value

        int[] arr = {23, 3,543,323 ,3445};
//
//        System.out.println(max(arr));


//        3.Reverse Array

        reverse(arr);
        System.out.println(java.util.Arrays.toString(arr));


    }

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start<end) {
            swap(arr , start , end);
            start++;
            end--;
        }
    }

    static int max(int[] arr){
        int maxValue = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    static void swap(int[] arr ,int index1 , int index2 ){
        System.out.println(java.util.Arrays.toString(arr));
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

//        System.out.println(java.util.Arrays.toString(arr));
    }
}