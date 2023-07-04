package lesson5;

import java.util.Deque;
import java.util.Scanner;

public class ViewCalculator {
    private Scanner scanner;

    public ViewCalculator() {
        this.scanner = new Scanner(System.in);
        System.out.println("Калькулятор");
        System.out.println("Enter - подтверждение ввода числа или операции");
        System.out.println("st - для завершения работы");
        System.out.println("< - (знак меньше) для отмены последней операции");
        System.out.println("mem - лог всех операций");
    }

    public String getInputData(String txt) { // вводимые цифры и операции
        System.out.print(txt);
        return scanner.nextLine();
    }

    public void printResult(String txt) { // Вывод результата
        System.out.printf("Ответ: %s", txt);
        System.out.println();
    }

    public Boolean getTypeCalc() {
        System.out.print("Выберите тип калькулятора, complex - комплексный: ");
        if (scanner.nextLine().equals("complex"))
            return true;
        else return false;
    }

    public void delElement(String txt, String el) { // удаление последней операции
        System.out.println(txt + el);
    }

    public void printMemory(Deque<String> el) {
        for (String data : el) {
            System.out.println(data);
        }
    }

}