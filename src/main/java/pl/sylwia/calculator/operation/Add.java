package pl.sylwia.calculator.operation;

import java.math.BigDecimal;

public class Add implements Register {

	@Override
	public BigDecimal calculate(BigDecimal number1, BigDecimal number2) {
		return number1.add(number2);
	}
}
