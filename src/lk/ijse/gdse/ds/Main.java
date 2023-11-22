package lk.ijse.gdse.ds;

public class Main {
    public static void main(String[] args) {
        stack stack = new stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        int peek = stack.peek();
        System.out.println(peek);  //30

        stack.push(40);
        System.out.println(stack.peek()); //40

        stack.push(50);
        System.out.println(stack.peek());  // 50

        int pop = stack.pop();
        System.out.println("return value "+pop); //return value 50
        System.out.println("top value "+stack.peek()); //top value 40

        System.out.println("return value "+stack.pop()); //return value 40
        System.out.println("top value "+stack.peek());   //top value 30

        stack.printstack(); //[ 10 , 20 , 30 ]

        stack.push(400);// replace the 400 for the 40 . because still that 3 elememt has 40 value it get replace by 400.

        System.out.println(stack.peek()); //400

        stack.printstack(); // [ 10 , 20 , 30 , 400 ]

        stack.push(500);
        stack.printstack(); //[ 10 , 20 , 30 , 400 , 500 ]
        stack.push(60);  // Stack is full


    }
}
