package com.centraleNantes.poei2.boris.designPatterns.strategy;

import com.centraleNantes.poei2.boris.designPatterns.strategy.correction.OperationStrategy;

import java.util.HashMap;
import java.util.Map;

public class Calculator {

	static Map<String, OperationStrategy> operationStrategyMap = new HashMap<>();

	public static void main(String[] args) {
		//operationStrategyMap.put("+",new AdditionStrategy());
		//operationStrategyMap.put("*",new MultiplicationStrategy());
		//....

		String[] operations = {"+", "1", "+", "2", "*", "3"}; // = 9
		float value = 0;
		String operator = null;
		for(int idx = 0; idx <operations.length ; idx++){
			if(idx%2==0){  // nombre impair alors c'est un operateur
				operator = operations[idx];
			} else {
				float operand = Float.parseFloat(operations[idx]);
				value = operationStrategyMap.get(operator).doOperation(value, operand);
			}
		}

		System.out.println(value);
	}
}
