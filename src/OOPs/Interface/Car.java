package OOPs.Interface;

public class Car implements Engine, brake {

    @Override
    public void brake(){
        System.out.println(" brake");
    }

    int a = 2000;

    @Override
    public void Start(){
        System.out.println("Start");
    }

    @Override
    public void Stop(){
        System.out.println("Stop");
    }
    @Override
    public void acc(){
        System.out.println("accelarte");
    }


    
}
