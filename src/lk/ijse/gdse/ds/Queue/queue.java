package lk.ijse.gdse.ds.Queue;

public class queue {
    int[] elemenetdata;
    int froent = -1;
    int rear = -1;

    public queue(int capacity){
        elemenetdata = new int[capacity];
    }

    public void enQueue(int data){
        if (froent == -1){
            froent = 0;
        }
        elemenetdata[++rear] = data;
    }

    public int deQueue(){
        return elemenetdata[froent++];
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





}
