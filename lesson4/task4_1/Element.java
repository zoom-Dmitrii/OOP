package lesson4.task4_1;

public class Element<MyData> extends ElementSuperClass {

    public Element(MyData o) {
        super(o);
    }

    public Object getMyDataWork() {
        return super.getData();
    }

    public void setMyDataWork(MyData o) {
        super.setData(o);
    }

}
