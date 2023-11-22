package lk.ijse.gdse.ds;

public class stack {
    private static int[] elementData;
    private static int top;  //pointer to the top of the stack

    public stack(int initicalCapacity) {
        elementData = new int[initicalCapacity];
        top =-1;
    }

    public static void push(int data){
        elementData[++top] =data;
    }




}
