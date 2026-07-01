package OOPs.access;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        A obj = new A(10, "nEev", null);    


        obj.setNum(10);
        obj.getNum();
        int num = obj.num; //Incase of public variable declaration in class it can be accessed anywhere , incase of private it's not accessible in other file , in default the variable is only accesible in the same package.



        ArrayList<Integer> list = new ArrayList<>();


    }
    
}
