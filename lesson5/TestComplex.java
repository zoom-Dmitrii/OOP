package lesson5;

public class TestComplex extends TestNumber {

    public String testComplex(ViewCalculator viewCalculator) {
        String complex = "";
        while (complex == "") {
            complex = viewCalculator.getInputData("комплексное число: ");
            String[] test = complex.split("[+|\\-|*|/|i]");
            for (String i : test) {
                if (i != "") {
                    if (!testNumber(i)) {
                        complex ="";
                    }
                }
            }
        }
        return complex;
    }
}
