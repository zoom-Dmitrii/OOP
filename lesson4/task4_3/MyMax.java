package lesson4.task4_3;

public class MyMax<X, Y> {
    private X num1;
    private Y num2;
    private String typeData;

    public MyMax(X o1, Y o2) {
        this.num1 = o1;
        this.num2 = o2;
        this.typeData = (num1 == null) ? "Пусто": num1.getClass().getName();
    }

    public Object getMax(MyMax<? extends Comparable, ? extends Comparable> test) {
        if (test.num1.compareTo(test.num2) > 0) {
            return test.num1;
        } else {
            return test.num2;
        }
    }

    public String getTypeData() {
        return this.typeData;
    }
}
