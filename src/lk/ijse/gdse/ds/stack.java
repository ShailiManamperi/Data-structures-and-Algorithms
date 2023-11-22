package lk.ijse.gdse.ds;

public class stack {
    private int[] elementData;
    private int top;  //pointer to the top of the stack

    public stack(int initicalCapacity) {
        elementData = new int[initicalCapacity];
        top =-1;
    }

    public  void push(int data){ //add value to the stack
//        if(top == elementData.length-1){
//            System.out.println("Stack is full");
//            return;
//        }
        if (isFull()){
            System.out.println("Stack is full");
        }
        elementData[++top] =data;  // frist increment and add the value for the element
    }

    public int peek(){   //return the top value
        return elementData[top];
    }

    public int pop(){   // remove the top value and return that value
        return elementData[top--]; // frist return the value and point the top for next element
    }

    public void printstack(){
        System.out.print("[ ");
        for (int i = 0; i<=top; i++){
            System.out.print(elementData[i]+" , ");
        }
        System.out.print("\b\b]\n");
    }

    public boolean isFull(){
        return top == elementData.length-1;
    }




}
