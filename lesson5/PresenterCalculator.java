package lesson5;

import java.util.ArrayDeque;
import java.util.Deque;

public class PresenterCalculator {
    private ViewCalculator viewCalculator;
    private ModelCalcuator modelCalcuator;
    private TestOperation testOperation;
    private TestComplex testComplex;
    private Memory memory;


    public PresenterCalculator(ViewCalculator viewCalculator, ModelCalcuator modelCalcuator,
                               TestComplex testComplex, TestOperation testOperation, Memory memory) { //TestNumber testNumber
        this.viewCalculator = viewCalculator;
        this.modelCalcuator = modelCalcuator;
        this.testComplex = testComplex;
        this.testOperation = testOperation;
        this.memory = memory;

    }

    public void performCalculation() {
        String number = " ";
        Boolean numComplex; // ожидаем комплексное число
        Boolean token = false; // ожидаем знак
        numComplex = viewCalculator.getTypeCalc();
        if (!numComplex) {
            number = testComplex.testNumber(this.viewCalculator);
        } else {
            number = testComplex.testComplex(this.viewCalculator);
        }

        while (!number.equals("st")) { // выполняем до команды st
            if (number.equals("mem")) {
                viewCalculator.printMemory(memory.dequeMem);
            }
            if (!number.equals("<")) { // проверка на команду отмены
                if (token) {
                    number = testOperation.testOperation(viewCalculator);
                    token = false; // переключили, теперь ждем число
                    memory.addMem(number);
                    memory.addEl(number); // записали знак
                    number = testComplex.testNumber(this.viewCalculator);
                } else {
                    token = true; // переключили, теперь ждем знак
                    memory.addMem(number);
                    memory.addEl(number); // число на процедуры и в список
                    if (memory.deque.size() > 1) { // вывод ответа после первой операции
                        viewCalculator.printResult(memory.deque.peekLast());
                    }
                    //number = viewCalculator.getInputData("оператор: ");
                }
            } else {
                viewCalculator.delElement("Отмена: < Ответ: ", process(number));
                token = true;

            }
            number = viewCalculator.getInputData("оператор: ");
        }
    }

    public String process(String el) { // Достаем значения из списка и отправляем в калькулятор
        try {
            if (memory.deque.size() == 0) { // Далее после первого элемента возвращаем результат операции
                return el;
            }
            if (el.equals("<") && memory.deque.size() == 1) { // отмена максимум до первого числа
                return memory.deque.peekLast();
            }
            if (el.equals("<")) { // если значений много, можно отменять
                memory.deque.pollLast();
                return memory.deque.peekLast();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } // отправка данных для подсчета. Взяли и удалили знак операции, взяли последний
        // результат и новое число
//        if (el.contains("i")) {
//            return modelCalcuator.calcComplex(memory.deque.pollLast(), memory.deque.peekLast(), el);
//        }
        return modelCalcuator.calc(memory.deque.pollLast(), Float.parseFloat(memory.deque.peekLast()), Float.parseFloat(el));
    }
}
