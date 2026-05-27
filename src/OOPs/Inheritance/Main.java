package OOPs.Inheritance;

public class Main {

    public static void main(String[] args) {

        // Box box1 = new Box(4);
        // Box box = new Box(box1);

        // System.out.println(box.l + " " + box.w + " " + box.h);

        BoxWeight box = new BoxWeight();
        BoxWeight box1 = new BoxWeight(2,4,2,45);
        
        System.out.println(box1.h + " " + box1.weight);
        
    }


    
}
