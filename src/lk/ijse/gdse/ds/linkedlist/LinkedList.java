package lk.ijse.gdse.ds.linkedlist;

public class LinkedList {
    private static class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data=data;
        }
    }
    private Node head;

    public void insertAtBegining(int data){
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    public void insertAtEnd(int data){
        Node node = new Node(data);
        Node temp = head;
        while (temp.next !=null){
            temp = temp.next;
        }
        temp.next = node;
    }

    public void printList(){
        System.out.print("[ ");
        if (head ==null){
            System.out.println(" ]");
            return;
        }
        Node temp = head;
        do{
            System.out.print(temp.data+" , ");
            temp = temp.next;
        }while (temp != null);
        System.out.println("\b\b]");

//        Node temp = head;
//
//        System.out.print("[");
//        while(temp != null) {
//            System.out.print(temp.data + ", ");
//            temp = temp.next;
//        }

//        System.out.println("\b\b]");
    }

    public void insertAtPosition(int data,int position){
        if (position == 0){
            insertAtBegining(data);
        }else {
            Node node = new Node(data);
            Node temp = head;

            // Traverse to the node at position - 1
            for (int i = 0; i < position - 1 ; i++) {
                temp = temp.next;
            }

            // Check if the position is valid
//            if (temp == null) {
//                System.out.println("Invalid position");
//                return;
//            }

            // Insert the new node after the temp node
            node.next = temp.next;
            temp.next = node;
        }
    }

    public void deleteAtBegin(){
        if (head == null){
            System.out.println("Linked List is empty");
            return;
        }
        Node temp = head;
        head  = temp.next;
    }

    public void deleteAtEnd(){
        if (head == null){
            System.out.println("Linked List is empty");
            return;
        }
        Node temp = head;
        while (temp.next.next != null){
            temp = temp.next;

        }
        temp.next =null;
    }

    public void deleteByPostion(int position){
        if (head == null){
            System.out.println("Linked List is empty");
            return;
        }
        if (position == 0) {
            deleteAtBegin();
            return;
        }

        Node temp = head;
        Node next = null;

        for (int i = 0; i < position; i++) {
            next = temp;
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }

        next.next = temp.next;

    }

    public int size(){
        int count = 0;
        Node temp = head;
        while (temp !=null){
            count++;
            temp= temp.next;
        }
        return count;
    }

    public int get(int postion){
        if (head==null){
            System.out.println("List is empty");
            return -1;
        }
        Node temp = head;
        for (int i=0; i<postion; i++){
            temp = temp.next;
        }
        return temp.data;
    }
}
