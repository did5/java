package SP1MultiplicationTable;

public class Main {

	public static void main(String[] args) {
		for (int i = 1; i <= 10 ; i++) {
			for (int j = 1; j <= 10; j++) {
				int n = i*j;
				System.out.printf("%4d", n);
			}
			System.out.println();
		}
	}

}
