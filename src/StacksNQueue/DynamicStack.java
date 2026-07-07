package StacksNQueue;

class DynamicStack extends CustomStack{

    public DynamicStack(){
        super();    //It will call the Default size CustomStack()
    }

    public DynamicStack(int size){
        super(size);
    }

    @Override
    public boolean push(int item){

        if(this.isFull()){
            //Double the array size
            int[] temp = new int[data.length *2];

            //copy all prev items in new data
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }

            data = temp;
        }

        //We now know array is not full
        //Insert Items
        return super.push(item);
    }

}