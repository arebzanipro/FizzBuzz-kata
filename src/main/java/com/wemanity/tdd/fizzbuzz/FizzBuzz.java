package com.wemanity.tdd.fizzbuzz;

import java.util.Iterator;
import java.util.List;

public class FizzBuzz {
    private final String FIZZ = "Fizz";
    private final String BUZZ = "Buzz";
    private final int FIVE = 5;
    private final int TREE = 3;

    public String evaluate(int incomingFizzBuzzValue) {
        StringBuffer result = new StringBuffer();        
        appendFizzIfMultipleOf3(incomingFizzBuzzValue, result);
        appendBuzzIfMultipleOf5(incomingFizzBuzzValue, result);
        appendNumberIfNotMultipleOf3And5(incomingFizzBuzzValue, result);
        return result.toString();
    }
    
    public String evaluate(List incomingListToFizzBuzz){
    	Iterator iterator = incomingListToFizzBuzz.iterator();
    	while(iterator.hasNext()){
    		evaluate((int) iterator.next());
    	}
		return BUZZ;
    	
    }
    
    private void appendFizzIfMultipleOf3(int incomingFizzBuzzValue, StringBuffer result){
    	if (isMultibleOf3(incomingFizzBuzzValue)) {
            result.append(FIZZ);
        }
    }
    private void appendBuzzIfMultipleOf5(int incomingFizzBuzzValue, StringBuffer result){
    	if (isMultibleOf5(incomingFizzBuzzValue)) {
            result.append(BUZZ);
        }
    }
    
    private void appendNumberIfNotMultipleOf3And5(int incomingFizzBuzzValue, StringBuffer result){
    	if (result.length() == 0) {
            result.append(incomingFizzBuzzValue);
        }
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
