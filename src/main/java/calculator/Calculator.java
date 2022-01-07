package calculator;

import exceptions.NegativeNumbersNotAllowedException;
import strategy.AddingStrategy;

public class Calculator {
    private final AddingStrategy addingStrategy;

    public Calculator(AddingStrategy addingStrategy) {
        this.addingStrategy = addingStrategy;
    }

    public int add(String str) throws NegativeNumbersNotAllowedException {
        int ans = 0;
        try {
            ans = addingStrategy.add(str);
        } catch (NegativeNumbersNotAllowedException e) {
            throw new NegativeNumbersNotAllowedException("");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return ans;
    }
}
