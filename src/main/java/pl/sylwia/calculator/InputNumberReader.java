package pl.sylwia.calculator;

import java.math.BigDecimal;
import java.util.Scanner;

public class InputNumberReader {
    private final Scanner scanner;
    private final BigDecimal[] choicedNumbers;

    public InputNumberReader(BigDecimal[] choicedNumbers) {
        scanner = new Scanner(System.in);
        this.choicedNumbers = choicedNumbers;
    }

    public void readInputNumbers(BigDecimal wynikObliczen) {
        if (wynikObliczen.equals(BigDecimal.ZERO)) {
            readTwoNumbers();
        } else {
            readOneNumber(wynikObliczen);
        }
    }

    private void readOneNumber(BigDecimal wynikObliczen) {
        System.out.println("Podaj liczbę.");
        choicedNumbers[1] = new BigDecimal(scanner.next());
        choicedNumbers[0] = wynikObliczen;
    }

    private void readTwoNumbers() {
        System.out.println("Podaj pierwszą liczbę.");
        choicedNumbers[0] = new BigDecimal(scanner.next());
        System.out.println("Podaj drugą liczbę.");
        choicedNumbers[1] = new BigDecimal(scanner.next());
    }

}
