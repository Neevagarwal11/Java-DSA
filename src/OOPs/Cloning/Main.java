package OOPs.Cloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human neev = new Human(21 , "neev");
        // Human twin = new Human(neev);   
        Human twin= (Human)neev.clone();

        System.out.println(twin.age + " " + twin.name);



    }
}
