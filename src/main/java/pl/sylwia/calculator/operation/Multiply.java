package pl.sylwia.calculator.operation;

import java.math.BigDecimal;

public class Multiply implements Register {

	@Override
	public BigDecimal calculate(BigDecimal number1, BigDecimal number2) {
		return number1.multiply(number2);
	}
}
