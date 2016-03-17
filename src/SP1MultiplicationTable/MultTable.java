package SP1MultiplicationTable;

public class MultTable {

	public static void main(String[] args) {
		for (int i = 1; i < 10; i++){
			for (int j = 1; j < 10; j++){
			//	System.out.println(j + " * " + i  + " == " + j * i);
				System.out.printf("%d * %d == %d\t\t", j, i, i * j);
			}
			System.out.println();
		}
		System.out.printf("число %d, строка %s, дробное %.1f", 100, "java", 22.12345);
	}
}
