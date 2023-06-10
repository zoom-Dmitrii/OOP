package lesson4.task4_1;

public class task4_1 {
    public static void main(String[] args) {
        Element<String> inData = new Element<String>("'Текст'");
        System.out.printf("Введенное значение: %s -> ", inData.getData());
        inData.printElement();

        Element<Integer> inDataInt = new Element<Integer>(2023);
        System.out.printf("Введенное значение: %s -> ", inDataInt.getData());
        inDataInt.printElement();

        Element<Long> inDataLong = new Element<Long>(202320232023L);
        System.out.printf("Введенное значение: %s -> ", inDataLong.getData());
        inDataLong.printElement();

        Element<Double> inDataDouble = new Element<Double>(2023.06);
        System.out.printf("Введенное значение: %s -> ", inDataDouble.getData());
        inDataDouble.printElement();

        Element<Boolean> inDataBoolean = new Element<Boolean>(5 < 2);
        System.out.printf("Введенное значение: '5 < 2' %s -> ", inDataBoolean.getData());
        inDataBoolean.printElement();
    }
}
