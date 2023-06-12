package lesson5;

public class ModelCalcuator {

    public ModelCalcuator() {

    }

    public Boolean testNumber(String txt) {
        // Модуль обработки корректного ввода данных
        try {
            Double.parseDouble(txt);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public String calc(String operator, Float num1, Float num2) {

        switch (operator) {
            case "*":
                return Float.toString(num1 * num2);
            case "/": {
                if (num2 == 0)
                    return "Делить на 0 нельзя";
                else
                    return Float.toString(num1 / num2);
            }
            case "+":
                return Float.toString(num1 + num2);
            case "-":
                return Float.toString(num1 - num2);
        }
        return "Что-то пошло не так";
    }

}
