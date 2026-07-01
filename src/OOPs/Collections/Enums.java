package OOPs.Collections;

public class Enums {
    enum Week{
        ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN;
        //These are enum constants
        //they are public,static and final
        //since its final u can create child enums
        //type is Week

        Week(){
            System.out.println("Constructor called for" + this);
        } //This constructor is not public or protected, only private or default
        //


    }

    public static void main(String[] args) {
        Week week;
        week = Week.TWO;

        // for(Week day : Week.values()){
        //     System.out.println(day);
        // }
        System.out.println(week.ordinal()); //.ordinal is used to get the position of the element in the enum
        System.out.println(week.valueOf("ONE")); //.ordinal is used to get the position of the element in the enum


    }


}
