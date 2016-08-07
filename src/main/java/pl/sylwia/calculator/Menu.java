package pl.sylwia.calculator;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Menu {
    private final String[] ALLOWED_OPERATIONS = new String[]{"0", "1", "2", "3", "4", "5"};
    private final Scanner scanner;
    private final BigDecimal[] choicedNumbers;
    private BigDecimal wynikObliczen;

    public Menu() {
        scanner = new Scanner(System.in);
        choicedNumbers = new BigDecimal[2];
        wynikObliczen = BigDecimal.ZERO;
    }

    public void showMenu() {
        System.out.println("Wybierz cyfę oznaczającą co chcesz zrobić:");
        System.out.println("1 Dodawanie");
        System.out.println("2 Odejmowanie");
        System.out.println("3 Mnożenie");
        System.out.println("4 Dzielenie");
        System.out.println("5 Chcę wprowadzić nowe liczby");
        System.out.println("0 Wyjście");
    }

    public String getOperation() {
        System.out.println("Wybierz liczbę określającą operację.");
        return scanner.next();
    }

    public void doOperation(String operation) {
        switch (operation) {
            case "5":
                wynikObliczen = BigDecimal.ZERO;
                break;
            case "0":
                break;
            default:
                if(Arrays.asList(ALLOWED_OPERATIONS).contains(operation)) {
                    new InputNumberReader(choicedNumbers).readInputNumbers(wynikObliczen);
                    wynikObliczen = new Calculation(choicedNumbers).doCalculation(operation);
                    showCurrentValue();
                } else {
                    System.out.println("Nieznana operacja.");
                }
        }
    }

    private void showCurrentValue() {
        System.out.println("Wynik to " + wynikObliczen);
    }

}
