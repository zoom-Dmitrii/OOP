package lesson4.task4_3;

import lesson4.task4_1.PrintElement;

public class task4_3 {

    public static void main(String[] args) {
        MyMax<Integer, Integer> myMax = new MyMax(null, null);
        PrintElement printElement = new PrintElement();

        myMax = new MyMax(16, 28);
        printElement.printElement(myMax.getMax(myMax).toString(), myMax.getTypeData());

        myMax = new MyMax(15.78, 28.54);
        printElement.printElement(myMax.getMax(myMax).toString(), myMax.getTypeData());

        myMax = new MyMax("Слово", "Дело");
        printElement.printElement(myMax.getMax(myMax).toString(), myMax.getTypeData());
    }
}
