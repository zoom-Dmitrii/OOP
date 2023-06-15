package lesson4.task4_1;

public class task4_1 {
    public static void main(String[] args) {
        Element<String> inData = new Element<>("'Текст'");
        PrintElement printElement = new PrintElement();
        System.out.printf("Введенное значение: %s -> ", inData.getMyDataWork());
        printElement.printElement(inData.getMyDataWork());

        inData.setMyDataWork("'Проверка'");
        System.out.printf("Проверка SET. Введенное значение: %s -> ", inData.getMyDataWork());
        printElement.printElement(inData.getMyDataWork());

        Element<Integer> inDataInt = new Element<>(2023);
        System.out.printf("Введенное значение: %s -> ", inDataInt.getMyDataWork());
        printElement.printElement(inDataInt.getMyDataWork());

        Element<Long> inDataLong = new Element<>(202320232023L);
        System.out.printf("Введенное значение: %s -> ", inDataLong.getMyDataWork());
        printElement.printElement(inDataLong.getMyDataWork());

        Element<Double> inDataDouble = new Element<>(2023.06);
        System.out.printf("Введенное значение: %s -> ", inDataDouble.getMyDataWork());
        printElement.printElement(inDataDouble.getMyDataWork());

        Element<Boolean> inDataBoolean = new Element<>(5 < 2);
        System.out.printf("Введенное значение: '5 < 2' %s -> ", inDataBoolean.getMyDataWork());
        printElement.printElement(inDataBoolean.getMyDataWork());
    }
}
