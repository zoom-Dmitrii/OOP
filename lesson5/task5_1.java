package lesson5;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class task5_1 {

    public static void main(String[] args) {

        ViewCalculator viewCalculator = new ViewCalculator();
        ModelCalcuator modelCalcuator = new ModelCalcuator();
        //TestNumber testNumber = new TestNumber();
        TestComplex testComplex = new TestComplex();
        TestOperation testOperation = new TestOperation();
        Memory memory = new Memory();

        PresenterCalculator presenterCalculator =
                new PresenterCalculator(viewCalculator, modelCalcuator, testComplex, testOperation, memory);

        presenterCalculator.performCalculation();
    }

}
