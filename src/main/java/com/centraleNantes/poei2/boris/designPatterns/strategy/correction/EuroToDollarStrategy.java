package com.centraleNantes.poei2.boris.designPatterns.strategy.correction;

public class EuroToDollarStrategy implements OperationStrategy {
	@Override
	public Float doOperation(Float leftOperand, Float taux) {
		return leftOperand * taux;
	}
}
