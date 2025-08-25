


public class Linear_search {

    public static void main(String[] args) {

//        int[] arr = {2344,2314,312,143,53,2323,11,21,43,31};
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter Element to be searched: ");
//        int tar = in.nextInt();
//        int ans = linearsearch(arr , tar);
//
//        if(ans == -1){
//            System.out.println("Element does not exist in the ARRAY!!");
//        }
//        else{
//            System.out.println("The Element exists in the " + ans +"nd index");
//        }



        //In String
//        String str = "Hello This is Neev learning DSA in JAVA";
//        boolean ans = stringsearch(str , 'z');
//
//        if(ans == true){
//            System.out.println("Element exists");
//        }
//        else{
//            System.out.println("Element does not exist");
//        }


        // Search in 2D Array

//        int[][] arr = {
//                {12,3241,234},
//                {433,234,543,2},
//                {345,234,2445}
//        };
//        int target = 2;
//        int [] ans =  search2D(arr,target);
//        System.out.println("The element lies in : " + Arrays.toString(ans));





//        Even Digits
    //     This can be done in 2 ways.
    //     1. Count the number of digits. ---->Using
    //     2. Convert the int into string and use .length to get the number of digits.

    //    int[] arr = {12,444,634,23,6666,234,43};
    //    System.out.println(even(arr));



        //Max Wealth

        int[][] arr = {
                {2,4,5},
                {3,5,5},
                {2,5,3},
                {6,2,1}
        };
        int[] ans = maxWealth(arr);

        System.out.println(ans[0]+1 + "nd person has the max salary of " + ans[1]);


    }


        //Max Wealth

    static int[] maxWealth(int[][] accounts){
        int ans= 0;
        int per =0;
        for (int person = 0; person < accounts.length; person++) {
            int sum =0;
            for (int indiaccount = 0; indiaccount < accounts[person].length; indiaccount++) {
                sum +=accounts[person][indiaccount];
            }
            if(sum>ans) {
                ans = sum;
                per = person;
            }
        }
        return new int[] {per , ans};
    }

        //Even Digits

        static int even(int[] arr){
            int times = 0;

            for (int i = 0; i < arr.length; i++) {
                int n = arr[i];
                int count =0;

                while(n>0){
                    count++;
                    n = n/10;
                }

                if(count %2==0){
                    times++;
                }
            }

            return times;
        }




    //Search in 2D Array

    static int[] search2D(int[][] arr , int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col <arr[row].length ; col++) {

                if(arr[row][col] == target){
                    int[] ans = {row,col};
                    return ans;
                }

            }

        }
        return new int[] {-1,-1};
    }

    //Search in String

    // static boolean stringsearch(String str , char search){
    //     if(str.length() == 0){
    //         return false;
    //     }
    //     for (int i = 0; i < str.length(); i++) {
    //         if(search == str.charAt(i)){
    //             return true;
    //         }
    //     }

    //     return false;
    // }


    //search in array

    static int linearsearch(int[] arr , int target){
        if(arr.length == 0){
            return -1 ;
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }

        //The below line would execute only if none of the above lines get executed which indicates that the element does not exist.
        return -1;

    }
}
