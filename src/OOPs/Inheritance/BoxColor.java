package OOPs.Inheritance;

public class BoxColor extends BoxWeight  {  
    String Color;

    BoxColor(){
        this.Color = "No color";
    }
    BoxColor(double side, double weight, String color){
        super(side,side,side,weight);
        this.Color = color;
    }

}
