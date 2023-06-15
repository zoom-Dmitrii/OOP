package lesson4.task4_1;

public class ElementSuperClass<MyData> {
    private MyData data;

    public ElementSuperClass(MyData o) {
        data = o;
    }

    public MyData getData() {
        return data;
    }

    public void setData(MyData data) {
        this.data = data;
    }

}
