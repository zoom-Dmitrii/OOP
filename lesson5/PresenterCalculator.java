package lesson5;

import java.util.ArrayDeque;
import java.util.Deque;

public class PresenterCalculator {
    private ViewCalculator viewCalculator;
    private ModelCalcuator modelCalcuator;
    private TestNumber testNumber;
    private static Deque<String> deque = new ArrayDeque<>(); // хранятся все введенные значения

    public PresenterCalculator(ViewCalculator viewCalculator, ModelCalcuator modelCalcuator, TestNumber testNumber) {
        this.viewCalculator = viewCalculator;
        this.modelCalcuator = modelCalcuator;
        this.testNumber = testNumber;
    }

    private static void addEl(String el) {
        deque.add(el);
    }

    public void performCalculation() {
        String number = " ";
        while (!testNumber.testNumber(number))
            number = viewCalculator.getInputData("Число: ");

        Boolean token = false; // ожидаем знак
        while (!number.equals("st")) { // выполняем до команды st
            if (!number.equals("<")) { // проверка на команду отмены
                if (token) {
                    while (!"+-*/".contains(number)) { // Должны ввести знак операции
                        number = viewCalculator.getInputData("оператор: ");
                    }
                    token = false; // переключили, теперь ждем число
                    addEl(number); // записали знак
                    while (!testNumber.testNumber(number))
                        number = viewCalculator.getInputData("число: ");
                } else {
                    token = true; // переключили, теперь ждем знак
                    addEl(process(number)); // число на процедуры и в список
                    if (deque.size() > 1) {
                        viewCalculator.printResult(deque.peekLast()); // вывод ответа после первой операции
                    }
                    number = viewCalculator.getInputData("оператор: ");
                }

            } else {
                viewCalculator.delElement("Отмена: < Ответ: ", process(number));
                token = true;
                number = viewCalculator.getInputData("оператор: ");
            }
        }
    }

    public String process(String el) { // Достаем значения из списка и отправляем в калькулятор
        try {
            if (deque.size() == 0) { // Далее после первого элемента возвращаем результат операции
                return el;
            }
            if (el.equals("<") && deque.size() == 1) { // отмена максимум до первого числа
                return deque.peekLast();
            }
            if (el.equals("<")) { // если значений много, можно отменять
                deque.pollLast();
                return deque.peekLast();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } // отправка данных для подсчета. Взяли и удалили знак операции, взяли последний
        // результат и новое число
        return modelCalcuator.calc(deque.pollLast(), Float.parseFloat(deque.peekLast()), Float.parseFloat(el));
    }

}
