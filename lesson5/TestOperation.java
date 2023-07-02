package lesson5;

public class TestOperation {

    public String testOperation(ViewCalculator viewCalculator) {
        String operation = "";
        while (!"+-*/".contains(operation)) { // Должны ввести знак операции
            operation = viewCalculator.getInputData("оператор: ");
        }
        return operation;
    }
}
