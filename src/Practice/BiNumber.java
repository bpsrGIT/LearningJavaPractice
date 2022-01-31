package Practice;

public class BiNumber {
	private int firstInput;
	private int secondInput;

	BiNumber() {
		this(0, 0);
	}

	BiNumber(int a, int b) {
		firstInput = a;
		secondInput = b;
	}

	void getNumber(int input) {
		System.out.println(input);
	};

	void add() {
		int result = firstInput + secondInput;
		getNumber(result);
	};

	void multiply() {
		int result = firstInput * secondInput;
		getNumber(result);
	}

	void doubleInput() {
		firstInput = firstInput * 2;
		secondInput = secondInput * 2;
	}

	void getNumber1() {
		System.out.println(firstInput);
	}

	void getNumber2() {
		System.out.println(secondInput);
	}

}
