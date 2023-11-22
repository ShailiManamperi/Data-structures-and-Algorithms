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

        int pop = stack.pop();
        System.out.println("return value "+pop);

        System.out.println("return value "+stack.pop());

        stack.printstack();

        stack.push(400);// replace the 400 for the 40 . because still that 3 elememt has 40 value it get replace by 400.
        stack.printstack();

    }
}
