package OOPs.Abstract_Classes;

public class son extends parent {
    @Override       //All the abstract functions in the parent class shall be overidden in the children class
    void career(String name){
        System.out.println("I am a"+ name);
    }

    @Override
    void partner(String name, int age){
        System.out.println("My partner is " + name +" of age " + age );
    }
    public son(int age){
        super(age); //When the variable is declared using a constructor in the parent class it shall be accessed using super in the child classs
        this.age = age;
        age = VALUE;
        System.out.println(age);
    }
}
