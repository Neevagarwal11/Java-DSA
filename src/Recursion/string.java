package Recursion;

import java.util.ArrayList;
import java.util.List;

public class string {

    public static void main(String[] args) {

        // skip("" , "abbcda");
        // System.out.println(skipReturn( "abbccdda"));

        // System.out.println(skipApple("bcfapplebfg"));


        // ------------->Subsequence

        // System.out.println(subseqList("", "abc"));
        // subsqAcii("", "abc");


        // int[] arr = {1,2,3};
        // List<List<Integer>>  ans = subset(arr);
        // for(List<Integer> list : ans){
        //     System.out.println(list);
        // } 



        //-------------->Permutations

        permutations("", "abc");

        
    }


    static void skip(String p , String up){     //Pushing the answer String in the argument.

        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            skip(p, up.substring(1));   //This lets the processed stay unchanged incase the ch is 'a' and makes a substring of the unprocessed string which starts from the 1st index.
        }else{
            skip( p +ch , up.substring(1));    //Adds the ch in the processed string.
        }
    } 

    static String skipReturn(String up){        //Answer string is not passed in the argument

        if(up.isEmpty()){
            return "";            
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            return skipReturn(up.substring(1));
        }else{
            return ch + skipReturn(up.substring(1));
        }

    }

    static String skipApple(String up){

        if(up.isEmpty()){
            return "";
        }

        char ch = up.charAt(0);

        if(up.startsWith("apple")){
            return skipApple(up.substring(5));
        }else{
            return ch + skipApple(up.substring(1));
        }


    }


    // ---------->Subsequence 

    static void subseq(String p , String up ){

        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subseq( p + ch, up.substring(1));
        subseq(p, up.substring(1));

    }


    static ArrayList<String> subseqList(String p , String up){

        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> left = subseqList( p+ch , up.substring(1));
        ArrayList<String> right = subseqList(p, up.substring(1));

        left.addAll(right);
        return left; 
    }

    static void subsqAcii(String p , String up ){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subsqAcii(p + ch, up.substring(1));
        subsqAcii( p + ((int) ch)  , up.substring(1));
        subsqAcii( p , up.substring(1));
    }

    // ---------------->Using Iterative Method

    static List<List<Integer>> subset(int[] arr){

        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for(int num : arr){
            int n =outer.size();
            for(int i=0 ; i<n ; i++){
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }

        return outer;

    }


    //---------------------------------->Permutations

    static void permutations(String p , String up){

        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0); 

        for (int i = 0; i <= p.length() ; i++) {
            String f = p.substring(0, i);
            String s = p.substring(i , p.length());
            permutations(f + ch + s, up.substring(1));
            
        }




    }


    
}
