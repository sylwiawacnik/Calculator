package pl.sylwia.calculator;

import java.math.BigDecimal;

import pl.sylwia.calculator.operation.Add;
import pl.sylwia.calculator.operation.Divide;
import pl.sylwia.calculator.operation.Multiply;
import pl.sylwia.calculator.operation.Register;
import pl.sylwia.calculator.operation.Subtract;

public class Calculation {

    private final BigDecimal[] choicedNumbers;

    public Calculation(BigDecimal[] choicedNumbers) {
        this.choicedNumbers = choicedNumbers;
    }

    public BigDecimal doCalculation(String operation) {
        Register currentCalculation = prepareCalculation(operation);
        BigDecimal wynikObliczen = BigDecimal.ZERO;
        if (null != currentCalculation) {
            try {
                wynikObliczen = currentCalculation.calculate(choicedNumbers[0], choicedNumbers[1]);
            } catch (UnsupportedOperationException exception) {
                System.out.println(exception.getMessage());
            }
        } else {
            wynikObliczen = BigDecimal.ZERO;
            return wynikObliczen;
        }
        return wynikObliczen;
    }

    private Register prepareCalculation(String operation) {
        Register currentCalculation;
        switch (operation) {
            case "1":
                currentCalculation = new Add();
                break;
            case "2":
                currentCalculation = new Subtract();
                break;
            case "3":
                currentCalculation = new Multiply();
                break;
            case "4":
                currentCalculation = new Divide();
                break;
            default:
                currentCalculation = null;
                break;
        }
        return currentCalculation;
    }

}
