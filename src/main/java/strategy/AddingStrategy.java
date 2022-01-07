package strategy;

import exceptions.NegativeNumbersNotAllowedException;

public interface AddingStrategy {
    int add(String input) throws NegativeNumbersNotAllowedException;

}
