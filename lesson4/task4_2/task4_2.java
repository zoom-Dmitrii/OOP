package lesson4.task4_2;

import lesson4.task4_1.PrintElement;
import lesson4.task4_1.task4_1;

public class task4_2 {
    public static void main(String[] args) {
        PrintElement printElement = new PrintElement();
        MyArray<String> inData = new MyArray<String>();
        inData.addMyArray("a");
        inData.addMyArray("b");
        inData.addMyArray("c");
        printElement.printElement(inData);

        System.out.println();

        MyArray<Integer> inDataInt = new MyArray<Integer>();
        inDataInt.addMyArray(1);
        inDataInt.addMyArray(2);
        inDataInt.addMyArray(3);
        printElement.printElement(inDataInt);
    }
}
