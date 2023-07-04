package lesson5;

import java.util.ArrayList;

public class ModelCalcuator implements Operation {

    public ModelCalcuator() {

    }

    public String calcComplex(String operator, String complex1, String complex2) {
        ReadyComplex readyComplex = new ReadyComplex();
        String res = "";
        String answer = "";
        ArrayList num1 = readyComplex.parsNum(complex1);
        ArrayList num2 = readyComplex.parsNum(complex2);

        if (operator.equals("+") || operator.equals("-")) {
            res = calc(operator, Float.parseFloat((String) num1.get(0)), Float.parseFloat((String) num2.get(0)));
            answer = res;
            res = calc(operator, Float.parseFloat((String) num1.get(1)), Float.parseFloat((String) num2.get(1)));
            if (Float.parseFloat(res) >= 0) {
                answer += "+" + res;
            } else {
                answer += res;
            }
            answer += "i";
            return answer;
        } else {
            return calcComplex(operator, num1, num2);
        }
    }

    public String calcComplex(String operator, ArrayList num1, ArrayList num2) {
        String tmp = "";
        String tmpComplex = "";
        String result = "";
        Float a1 = Float.parseFloat((String) num1.get(0));
        Float b1 = Float.parseFloat((String) num1.get(1));
        Float a2 = Float.parseFloat((String) num2.get(0));
        Float b2 = Float.parseFloat((String) num2.get(1));
        switch (operator) {
            case "*": {
                tmp = String.valueOf(difference(multiplication(a1, a2), multiplication(b1, b2)));
                tmpComplex = String.valueOf((sum(multiplication(a1, b2), multiplication(b1, a2))));
                if (Float.parseFloat(tmpComplex) >= 0) {
                    tmp += "+";
                }
                result = tmp + tmpComplex + "i";
                return result;
            }
            case "/": {
                tmp = String.valueOf(division(sum(multiplication(a1, a2),
                        multiplication(b1, b2)), sum(multiplication(a2, a2), multiplication(b2, b2))));
                tmpComplex = String.valueOf(division(difference(multiplication(a2, b1), multiplication(a1, b2)),
                        sum(multiplication(a2, a2), multiplication(b2, b2))));
                if (Float.parseFloat(tmpComplex) >= 0) {
                    tmp += "+";
                }
                result = tmp + tmpComplex + "i";
                return result;
            }
        }
        return "Что-то пошло не так";
    }

    public String calc(String operator, Float num1, Float num2) {

        switch (operator) {
            case "*":
                return multiplication(num1, num2).toString();
            case "/": {
                try {
                    if (num2 == 0)
                        throw new ArithmeticException();
                } catch (ArithmeticException e) {
                    System.out.println("Деление на 0!");
                    System.exit(0);
                }
                return division(num1, num2).toString();
            }
            case "+":
                return sum(num1, num2).toString();
            case "-":
                return difference(num1, num2).toString();
        }
        return "Что-то пошло не так";
    }

    @Override
    public Float sum(Float x1, Float x2) {
        return x1 + x2;

    }

    @Override
    public Float difference(Float x1, Float x2) {
        return x1 - x2;
    }

    @Override
    public Float multiplication(Float x1, Float x2) {
        return x1 * x2;
    }

    @Override
    public Float division(Float x1, Float x2) {
        if (x2 == 0)
            return null;
        else
            return x1 / x2;
    }

    public String multiplicationComplex(Float x1, Float x2) {
        String res = "";

        return res;
    }
}
