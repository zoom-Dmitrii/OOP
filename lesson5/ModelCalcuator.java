package lesson5;

public class ModelCalcuator implements Operation{

    public ModelCalcuator() {

    }

    public String calc(String operator, Float num1, Float num2) {

        switch (operator) {
            case "*":
                return multiplication(num1,num2).toString();
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
}
