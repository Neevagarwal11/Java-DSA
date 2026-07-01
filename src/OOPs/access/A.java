package OOPs.access;

public class A {
    public int num;    //As this is private it cant be accesses by calling it from an obj
    String name;
    int[] arr;

    public int getNum(){       //getter and setter are used to access private variables in other files by calling the method through an obj
        return num;
    }
  
    public void setNum(int num){
        this.num = num;
    }


    public A(int num, String name , int[] arr){
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }


}
