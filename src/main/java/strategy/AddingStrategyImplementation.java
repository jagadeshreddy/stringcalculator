package strategy;

import exceptions.NegativeNumbersNotAllowedException;

public class AddingStrategyImplementation implements AddingStrategy {

    private String delimiter = ",|\n";

    @Override
    public int add(String input) throws NegativeNumbersNotAllowedException {
        int totalSum = 0;
        if (input == null || input.length() == 0) {
            return 0;
        }
        if (containsDelimter(input)) {
            String arr[] = input.substring(3).split(delimiter);
            delimiter = input.substring(2, 3).trim();
            for (String temp : arr) {
                String t[] = temp.split(delimiter);
                totalSum += calculateSum(t);
            }
        } else {
            String arr[] = input.split(delimiter);
            totalSum = calculateSum(arr);
        }

        return totalSum;
    }

    private int calculateSum(String[] arr) throws NegativeNumbersNotAllowedException {
        int sum = 0;
        for (String str : arr) {
            if (str != null && !str.equals("")) {
                int currNum = Integer.parseInt(str);
                if (currNum < 0) {
                    throw new NegativeNumbersNotAllowedException("Negative Numbers Not Allowed");
                }
                sum += currNum;
            }
        }
        return sum;
    }

    private boolean containsDelimter(String input) {

        if (input.substring(0, 2).equals("//")) {
            return true;
        }
        return false;
    }

}
