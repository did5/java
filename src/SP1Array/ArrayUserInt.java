package SP1Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayUserInt {

	public static void main(String[] args) throws IOException {
		double average = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int[] array1 = new int[4];
		BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
		for (int i = 0; i < array1.length; i++){
			System.out.println("Введите целое число в массив:");
			array1[i] = Integer.parseInt(reader.readLine());
		}
		System.out.print("Получился следующий массив: ");
		for (int i = 0; i < array1.length; i++) {
			average += array1[i];
			if (array1[i] > max) max = array1[i];
			if (array1[i] < min) min = array1[i];
			System.out.printf("%5d", array1[i]);
		}
		
		for (int y : array1) {
			System.out.println(array1[y]);
		}
		System.out.println();
		System.out.println("Average = ");
		System.out.println(average/array1.length);
		System.out.printf("Max = %d", max);
		System.out.println();
		System.out.printf("Min = %d", min);
	}

}
