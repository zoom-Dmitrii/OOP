package lesson4.task4_3;

public class MyMax<X, Y> {
    X num1;
    Y num2;

    public MyMax(X o1, Y o2) {

        num1 = o1;
        num2 = o2;
    }

    <T> Object getMax(MyMax<? extends Comparable, ? extends Comparable> test) {
        System.out.println("Пришли данные: " + test.num1.getClass().getName());

        if (test.num1.compareTo(test.num2) > 0) {
            return test.num1;
        } else {
            return test.num2;
        }
    }
}
