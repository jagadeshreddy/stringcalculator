import calculator.Calculator;
import exceptions.NegativeNumbersNotAllowedException;
import strategy.AddingStrategy;
import strategy.AddingStrategyImplementation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NegativeNumbersNotAllowedException {
        AddingStrategy addingStrategy = new AddingStrategyImplementation();
        Calculator calculator = new Calculator(addingStrategy);
        Scanner scanner = new Scanner(System.in);
        //Take Input...
    }
}
