package lk.ijse.gdse.ds.Queue;

public class queue {
    int[] elemenetdata;
    int froent = -1;
    int rear = -1;

    public queue(int capacity){
        elemenetdata = new int[capacity];
    }

    public void enQueue(int data){
        if (isFull()){
            System.out.println("After stack full");
            grow();
        }
        if (froent == -1){
            froent = 0;
        }
        elemenetdata[++rear] = data;
    }



    public int deQueue(){
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return elemenetdata[froent++];
    }

    public int peek(){
        return elemenetdata[froent];
    }

    public void printQueue(){
        System.out.print("[ ");
        if (froent==-1){
            System.out.println(" ]");
            return;
        }
        for (int i= froent; i<=rear; i++){
            System.out.print(elemenetdata[i]+" , ");
        }
        System.out.println("\b\b]");
    }

   public boolean isFull(){
        return rear == elemenetdata.length-1;
   }

   public boolean isEmpty(){
        return froent == -1;
   }

    private void grow() {
        int[] temp = elemenetdata;   //length -> 5

        elemenetdata = new int[elemenetdata.length * 2];  //length -> 10
        for (int i = 0; i < temp.length; i++) {
            elemenetdata[i] = temp[i];
        }
    }



}
