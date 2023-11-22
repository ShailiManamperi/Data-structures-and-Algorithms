package lk.ijse.gdse.ds.Queue;

public class Main {
    public static void main(String[] args) {
        queue q1 = new queue(5);

        q1.enQueue(10);
        q1.enQueue(20);

        q1.printQueue();

        q1.deQueue();

        q1.printQueue();

        q1.enQueue(30);
        q1.enQueue(40);

        q1.printQueue();
        q1.deQueue();
        q1.printQueue();

        System.out.println(q1.peek());
    }
}
