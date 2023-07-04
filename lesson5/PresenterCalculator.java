package lesson5;

public class PresenterCalculator {
    private ViewCalculator viewCalculator;
    private ModelCalcuator modelCalcuator;
    private TestOperation testOperation;
    private TestComplex testComplex;
    private Memory memory;
    private Boolean numComplex; // ожидаем комплексное число


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
        Boolean token = false; // ожидаем знак
        numComplex = viewCalculator.getTypeCalc();
        number = selectTestNum(numComplex);
        while (!number.equals("st")) { // выполняем до команды st
            if (number.equals("mem")) {
                viewCalculator.printMemory(memory.dequeMem);
                number = testOperation.testOperation(viewCalculator);
            } else {
                if (!number.equals("<")) { // проверка на команду отмены
                    if (token) {
                        token = false; // переключили, теперь ждем число
                        memory.addMem(number);
                        memory.addEl(number); // записали знак
                        number = selectTestNum(numComplex);
                    } else {
                        token = true; // переключили, теперь ждем знак
                        memory.addMem(number);
                        if (memory.deque.size() > 1) { // вывод ответа после первой операции
                            memory.addEl(process(number));
                            viewCalculator.printResult(memory.deque.peekLast());
                        } else {
                            memory.addEl(number); // число на процедуры и в список
                        }
                        number = testOperation.testOperation(viewCalculator);
                    }
                } else {
                    viewCalculator.delElement("Отмена: < Ответ: ", process(number));
                    token = true;
                    number = viewCalculator.getInputData("оператор: ");
                }
            }
        }
    }

    private String selectTestNum(Boolean numComplex) {
        if (!numComplex) {
            return testComplex.testNumber(this.viewCalculator);
        } else {
            return testComplex.testComplex(this.viewCalculator);
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
        }
        // отправка данных для подсчета. Взяли и удалили знак операции, взяли последний
        // результат и новое число
        if (numComplex) {
            return modelCalcuator.calcComplex(memory.deque.pollLast(), memory.deque.peekLast(), el);
        } else
            return modelCalcuator.calc(memory.deque.pollLast(), Float.parseFloat(memory.deque.peekLast()), Float.parseFloat(el));
    }
}
