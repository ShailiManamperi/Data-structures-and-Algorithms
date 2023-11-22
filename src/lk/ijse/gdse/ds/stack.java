package lk.ijse.gdse.ds;

public class stack {
    private int[] elementData;
    private int top;  //pointer to the top of the stack

    public stack(int initicalCapacity) {
        elementData = new int[initicalCapacity];
        top =-1;
    }

    public  void push(int data){
        elementData[++top] =data;
    }

    public int peek(){
        return elementData[top];
    }




}
