package Practice;

public class BookRunner {
	public static void main(String[] args) {
		Book artOfComputerProgramming = new Book(100);
		Book effectiveJava = new Book(50);
		Book cleanCode = new Book(1000);

		cleanCode.setBookName("Clean Code");
		cleanCode.openBook();

		artOfComputerProgramming.increaseStocks(2);
		effectiveJava.increaseStocks(-10);
		cleanCode.increaseStocks(5);

		System.out.println(artOfComputerProgramming.getNoOfCopies());
		System.out.println(effectiveJava.getNoOfCopies());
		System.out.println(cleanCode.getNoOfCopies());
	}
}
