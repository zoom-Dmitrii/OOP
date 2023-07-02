package lesson5;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadyComplex {
    public ReadyComplex () {

    }
    public ArrayList<String> parsNum(String num) {
        ArrayList parsOK = new ArrayList<>();
        String[] in1 = num.split("");
        String num1 = "";
        String num2 = "";
        String tmp = "";
        num1 = in1[0];
        int i = 1;
        while (Character.isDigit(in1[i].charAt(0)) || in1[i].equals(".") || in1[i].equals("i")) {
            num1 += in1[i];
            i++;
        }
        while (i < in1.length) {
            num2 += in1[i];
            i++;
        }
        if (num1.contains("i")) {
            tmp = num1.replace("i","");
            if (tmp.equals("+") || tmp.equals("")) {
                num1 = "+1";
            }   else if (tmp.equals("-")){
                num1 = "-1";
            }
            parsOK.add(num2);
            parsOK.add(num1.replace("i",""));
        } else {
            tmp = num2.replace("i","");
            if (tmp.equals("+") || tmp.equals("")) {
                num2 = "+1";
            } else if (tmp.equals("-")) {
                num2 = "-1";
            }
            parsOK.add(num1);
            parsOK.add(num2.replace("i",""));
        }
        return parsOK;
    }

}
