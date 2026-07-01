package OOPs.Interface;

public class ElectricEngine implements Engine {

    @Override
    public void Start(){
        System.out.println("Electric Engine Start");
    }
    @Override
    public void Stop(){
        System.out.println("Electric Engine Stop");
    }
    @Override
    public void acc(){
        System.out.println("Electric Engine acclerate");
    }
    
}
