package lesson5;

import java.util.ArrayDeque;
import java.util.Deque;

public class Memory {
    Deque<String> deque; // хранятся все опкрации
    Deque<String> dequeMem; // хранятся все введенные значения

    public Memory() {
        dequeMem = new ArrayDeque<>();
        deque = new ArrayDeque<>();
    }

    public void addEl(String el) {
        deque.add(el);
    }

    public void addMem(String el) {
        dequeMem.add(el);
    }
}
