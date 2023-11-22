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



}
