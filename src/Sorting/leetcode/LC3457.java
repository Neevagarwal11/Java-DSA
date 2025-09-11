package Sorting.leetcode;
import java.util.Arrays;
import java.util.Comparator;

// Refer
// https://www.youtube.com/watch?v=RcFEP6D5MTk

public class LC3457{

    public long maxWeight(int[] pizzas) {

        Arrays.sort(pizzas);    //Array is sorted

        int size = pizzas.length;
        int totalDays = size/4;
        int currentIndex = size-1;

        long maxTotalWeight = 0;

        for(int day = 1 ; day<=totalDays ; day+=2){     //For odd days 
            maxTotalWeight += pizzas[currentIndex--];   //For odd days the heaviest pizza is taken into account
        }
        currentIndex--; 

        for(int day =2 ; day <= totalDays; day+=2){     //For Even days
            maxTotalWeight += pizzas[currentIndex];     //For even days the 2nd heaviest pizza is taken into account
            currentIndex -=2;
        }

        return maxTotalWeight;

    }





    
}