package lesson4.task4_2;

import java.util.ArrayList;

public class SuperMyArray<T> {
   private ArrayList<T> myData;

    public SuperMyArray() {
        myData = new ArrayList<>();
    }

    public ArrayList<T> getMyData() {
        return myData;
    }

}
