package lesson4.task4_2;

import java.util.ArrayList;

public class MyArray<T> {

    ArrayList<T> myData;

    public MyArray() {
        myData = new ArrayList<>();
    }

    public void addMyArray(T o) {
        myData.add(o);
    }

    public void printArray() {
        System.out.println("Элементы массива:");
        for (int i = 0; i < myData.size(); i++) {
            System.out.printf(" %s", myData.get(i));
        }

    }

}
