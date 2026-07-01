package OOPs.Interface;

public class NiceCar {
    private Engine engine;
    private media player = new CarMedia();
    public NiceCar(){
        engine = new ElectricEngine();
    }
    public NiceCar(Engine engine){
        this.engine = engine;
    }
    public void start(){
        engine.Start();
    }
    public void stop(){
        engine.Stop();
    }
    public void startMusic(){
        player.start();
    }
    public void stopMusic(){
        player.stop();
    }

    public void upgradeEngine(){
        this.engine = new PowerEngine();
    }

}
