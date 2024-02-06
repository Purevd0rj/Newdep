package CircleCalc;

import java.util.ArrayDeque;
import java.util.Deque;

public class MyArrayDeque {
    public static void main(String[] args) {
        Deque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.add(5);
        arrayDeque.add(10);
        arrayDeque.add(15);

        System.out.println("ArrayDeque: " + arrayDeque);
    }
}

