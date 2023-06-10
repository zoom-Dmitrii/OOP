package lesson4.task4_3;

public class task4_3 {

    public static void main(String[] args) {

        MyEquals<Integer, Integer> data = new MyEquals<Integer, Integer>(45, 25);
        data.getMax();

        MyEquals<String, String> data1 = new MyEquals<String, String>("Дело", "Слово");
        data1.getMax();

        MyEquals<Double, Double> data2 = new MyEquals<Double, Double>(45.15, 99.99);
        data2.getMax();
    }
}
