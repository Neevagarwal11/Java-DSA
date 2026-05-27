package OOPs.Inheritance;

public class BoxWeight extends Box { //extends keyword gets the properties/variable of the Box(parent) class such that BoxWeight class can use it .

    double weight;
    BoxWeight(){
        this.weight = -1;
    }

    BoxWeight(double l , double h , double w , double weight){
        super(l,h,w);   //super is used to call the constructor of the parent class
        System.out.println(super.h); //super can also be used to call the variable of the parent class
        this.weight = weight;
    }
    
}
