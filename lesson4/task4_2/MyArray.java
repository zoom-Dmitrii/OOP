package lesson4.task4_2;

import java.util.ArrayList;

public class MyArray<T> extends SuperMyArray{

    public MyArray() {
        super();
    }

    public void addMyArray(T o) {
        super.getMyData().add(o);
    }

    public ArrayList<T> getMyData() {
        return super.getMyData();
    }

}
