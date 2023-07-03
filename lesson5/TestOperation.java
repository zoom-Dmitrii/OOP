package lesson5;

public class TestOperation {

    public String testOperation(ViewCalculator viewCalculator) {
        String operation = " ";
        while (!"+-*/".contains(operation) && !operation.equals("mem") && !operation.equals("st")) { // Должны ввести знак операции
            operation = viewCalculator.getInputData("оператор: ");
        }
        return operation;
    }
}
