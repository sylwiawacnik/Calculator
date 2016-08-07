package pl.sylwia.calculator;

public class Calculator {

	public static void main(String[] args) {
		
		Menu menu = new Menu();
		menu.showMenu();
		while (true) {
			String operation = menu.getOperation();
			if(operation.equals("0")) break;
			menu.doOperation(operation);
		}
	}
}
