package Practice;

public class Book {
	private int noOfCopies;
	private String bookName;

//	Constructor
	Book(int initialQty) {
		this.noOfCopies = initialQty;
	};

	void setNoOfCopies(int stocks) {
		if (noOfCopies > 0) {
			this.noOfCopies = stocks;
		} else {
			this.noOfCopies = 0;
		}

	};

	public int getNoOfCopies() {
		return this.noOfCopies;
	};

	void setBookName(String name) {
		this.bookName = name;
	};

	public void increaseStocks(int qty) {
		setNoOfCopies(this.noOfCopies + qty);
	};

	public void decreaseStocks(int qty) {
		setNoOfCopies(this.noOfCopies - qty);
	};

	void openBook() {
		System.out.printf("%s now open", this.bookName).println();
	};
}
