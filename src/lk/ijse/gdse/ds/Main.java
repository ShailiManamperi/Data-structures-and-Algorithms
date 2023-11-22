package lk.ijse.gdse.ds;

public class Main {
    public static void main(String[] args) {
        stack stack = new stack(10);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        int peek = stack.peek();
        System.out.println(peek);

        stack.push(40);
        System.out.println(stack.peek());

        stack.push(50);
        System.out.println(stack.peek());
    }
}
