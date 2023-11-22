package lk.ijse.gdse.ds.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.insertAtBegining(10);
        ll.insertAtBegining(20);
        ll.printList();
        ll.insertAtBegining(30);
        ll.printList();

        ll.insertAtEnd(50);
        ll.printList();


    }
}
