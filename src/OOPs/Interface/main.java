package OOPs.Interface;

public class main {

    public static void main(String[] args) {
        // Engine car = new Car(); //Left side determines the variable obj has access and the right side determines the functions it has access of 
        
        // int a = car.PRICE;
        // System.out.println(a);  //Accesible 
        // // car.a; Inaccesible as only engine interface is accesible by the car obj 
        // car.acc();
        // car.Start();
        // car.Stop();

        NiceCar car = new NiceCar();

        car.start();
        car.startMusic();

        car.upgradeEngine();
        car.start();

    }
    
}
