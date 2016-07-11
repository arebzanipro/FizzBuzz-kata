package com.wemanity.tdd.fizzbuzz;

public class FizzBuzz {
    private final String FIZZ = "Fizz";
    private final String BUZZ = "Buzz";
    private final int FIVE = 5;
    private final int TREE = 3;

    public String evaluate(int incomingFizzBuzzValue) {
        StringBuffer result = new StringBuffer();
        if (isMultibleOf3(incomingFizzBuzzValue)) {
            result.append(FIZZ);
        }
        if (isMultibleOf5(incomingFizzBuzzValue)) {
            result.append(BUZZ);
        }
        if (result.length() == 0) {
            result.append(incomingFizzBuzzValue);
        }

        return result.toString();
    }
    private boolean isMultibleOf3(int value){
        return aMultipleOfB(value, TREE);
    }
    
    private boolean isMultibleOf5(int value){
        return aMultipleOfB(value, FIVE);
    }

    private boolean aMultipleOfB(int a, int b) {
        return (a % b) == 0;
    }
}
