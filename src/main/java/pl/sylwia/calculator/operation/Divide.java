package pl.sylwia.calculator.operation;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Divide implements Register {

	@Override
	public BigDecimal calculate(BigDecimal number1, BigDecimal number2) {
		if(number2.equals(BigDecimal.ZERO))
			throw new UnsupportedOperationException("Dzielenie przez zero.");
		return number1.divide(number2, 2, BigDecimal.ROUND_HALF_UP);
	}
}
