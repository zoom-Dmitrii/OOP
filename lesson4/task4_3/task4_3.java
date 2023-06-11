package lesson4.task4_3;

public class task4_3 {

    public static void main(String[] args) {
        MyMax<Integer, Integer> myMax = new MyMax(null, null);

        System.out.printf("Максимальное значение: %s \n", myMax.getMax(new MyMax(16, 28)).toString());

        System.out.printf("Максимальное значение: %s \n", myMax.getMax(new MyMax("Дело", "Слово")).toString());

        System.out.printf("Максимальное значение: %s \n", myMax.getMax(new MyMax(45.15, 99.99)).toString());

    }
}
