package OOPs.Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {

    private int[] data;
    private static int DEFAULT_SIZE =10;
    private int size = 0;
     

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];

    }
    public void add(int num) {
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    private boolean isFull(){
        return size == data.length;
    }
    private void resize(){
        int[] temp = new int[data.length *2];

        //copy the data into new array 
        for(int i=0 ; i< data.length; i++){
            temp[i] = data[i];
        }
        data= temp;
    }

    public int remove(){
        int removedItem = data[--size];
        return removedItem;
    }

    public int get(int index){
        return data[index];
    }
    public void set( int index , int value){
        data[index] = value;
    }


    @Override
    public String toString(){
        return "CustomArrayList{" + "data=" + Arrays.toString(data) + ", size=" + size + "}";
    }


    public static void main(String[] args) {
        ArrayList list1 = new ArrayList<>();
        CustomArrayList list = new CustomArrayList();

        list.add(3);
        list.add(5);
        list.add(7);

        System.out.println(list);
        
    }
}
