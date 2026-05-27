package OOPs.Polymorphism;

public class main {

    // Polymorphism is the act of represting the same thing in multiple ways
    // Types: 
        //1. Compile time/Static Polymorphism: Achieved via method/function overloading(same name of function but types,arguments,return types are different).
        //2. Runtime/Dynamic Polymorphism: Achieved my method overriding (When a parent and child class has the same name of the method in it.)




    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();
        Shapes squaree = new Square(); //This will run the function of Square when called but to access the function area it shall exist in the reference type which is Shapes in this case.

        shape.area();   //This will call the area function in the shape class
        circle.area();  //This will call the are function in the circle class

        square.area();  //Return ths function area in the square class
        squaree.area();
 
    }
    
}
