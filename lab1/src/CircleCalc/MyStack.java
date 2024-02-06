package CircleCalc;

import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(10);
        stack.push(15);

        System.out.println("Stack: " + stack);
    }
}
