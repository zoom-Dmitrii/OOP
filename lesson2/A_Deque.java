package lesson2;

import java.util.Deque;
import java.util.LinkedList;

abstract class A_Deque {

    Deque<Сustomer> queue;

    A_Deque() {
        queue = new LinkedList<>();
    }

    abstract String getAllQueue();

    abstract String getLast();

    abstract String getFirst();

    abstract void setFirstExpense(Double x);

}
