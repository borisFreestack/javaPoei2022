package com.centraleNantes.poei2.boris.designPatterns.strategy.correction;

public class AdditionStrategy
implements com.centraleNantes.poei2.boris.designPatterns.strategy.correction.OperationStrategy {

	@Override
	public Float doOperation(Float leftOperand, Float rightOperand) {
		return leftOperand + rightOperand;
	}
}
