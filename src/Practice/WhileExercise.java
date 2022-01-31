package Practice;

public class WhileExercise {

	public static void main(String[] args) {
		WhileExercise player = new WhileExercise(30);
		player.printSquaresUptoLimit();
		player.printCubesUptoLimit();

	}
	
	private int num = 0;
	
	WhileExercise(int num){
		this.num = num;
	}
	
	private void printSquaresUptoLimit() {
		int i = 1;
		while(i * i < num) {
			System.out.print((i * i) + " ");
			i++;
		}
	}
	
	private void printCubesUptoLimit() {
		int i = 1;
		while(i * i * i < num) {
			System.out.print((i * i * i) + " ");
			i++;
		}
		
	}

}
