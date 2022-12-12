package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        String result = "";
        while(number != 0){
            int lastDigit = number % 10;
            result += lastDigit + "";
            number /= 10;
        }
        System.out.println(Integer.parseInt(result));
    }

}
