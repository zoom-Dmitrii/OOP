package lesson5;

public class task5_1 {

    public static void main(String[] args) {
        ViewCalculator viewCalculator = new ViewCalculator();
        ModelCalcuator modelCalcuator = new ModelCalcuator();
        TestNumber testNumber = new TestNumber();
        PresenterCalculator presenterCalculator = new PresenterCalculator(viewCalculator, modelCalcuator, testNumber);

        presenterCalculator.performCalculation();
    }

}
