package lesson5;

public class TestNumber {
    public String testNumber(ViewCalculator viewCalculator) {
        Float digit = null;
        while (digit == null) {
            try {
                digit = Float.parseFloat(viewCalculator.getInputData("Число: "));
            } catch (NumberFormatException e) {
                System.out.println("Нужно ввести число");
            }
        }
        return digit.toString();
    }

    public Boolean testNumber(String digit) {
        try {
            Float.parseFloat(digit);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
