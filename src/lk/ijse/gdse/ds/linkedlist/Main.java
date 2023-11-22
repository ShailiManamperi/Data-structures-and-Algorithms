package lk.ijse.gdse.ds.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.insertAtBegining(10);
        ll.insertAtBegining(20);
        ll.printList(); //[20, 10]
        ll.insertAtBegining(30);
        ll.printList(); // [30, 20, 10]

        ll.insertAtEnd(50);
        ll.printList(); //[30, 20, 10, 50]

        ll.insertAtPosition(60,2);
        ll.printList(); //[ 30 , 20 , 60 , 10 , 50 ]

        ll.insertAtPosition(70,0);
        ll.printList(); //[ 70 , 30 , 20 , 60 , 10 , 50 ]

        ll.deleteAtBegin();
        ll.printList();


    }
}
