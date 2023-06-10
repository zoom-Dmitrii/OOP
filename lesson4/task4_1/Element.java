package lesson4.task4_1;

public class Element<MyData> {
    MyData data;

     Element (MyData o) {
        data = o;
    }

    public MyData getData() {
        return data;
    }

    void printElement(){
        System.out.println("Тип: " + data.getClass().getName());
    }
}
