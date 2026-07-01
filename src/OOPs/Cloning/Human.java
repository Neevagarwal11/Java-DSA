package OOPs.Cloning;

public class Human implements Cloneable{    // Cloneable is an interface class 
    int age;
    String name;
    int[] arr;

    public Human(int age, String name , int[] arr){
        this.age = age;
        this.name = name;
        this.arr = new int[5];
    }
    public Human(Human other){
        this.age = other.age;
        this.name = other.name;
    }

    // @Override
    // public Object clone() throws CloneNotSupportedException{    //When ever there is a possibility where the body can throw an exception we need to specify it in the head of the function.
    //     // Shallow Copy
    //     return super.clone();   // .clone is a function inside cloneable which can be used to clone any obj.
    // }

    @Override
    public Object clone() throws CloneNotSupportedException{
        // This is deep copy
        Human twin = (Human)super.clone();  

        twin.arr = new int[twin.arr.length];
        for (int i = 0; i < twin.arr.length; i++) {
            twin.arr[i] = this.arr[i];
        }
        return twin;


    }

}
