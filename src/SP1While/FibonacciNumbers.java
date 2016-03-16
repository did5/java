package SP1While;

public class FibonacciNumbers {

	public static void main(String[] args) {
		// Числа Фибоначчи - каждое последующее число равно сумме двух предыдущих чисел
		// 0, 1, 1, 2, 3, 5, 8, 13, 21...
		// Задача - вывести все числа Фибоначии меньше 1000
		int a = -1;
		int b = 1;
		int sum = a + b;
		System.out.println("-----------DO WHILE---------------");
		do {
			System.out.printf("%4d", sum);
			sum = a + b;
			a = b;
			b = sum;
		} while (sum < 1000);
		
		/*System.out.println("-------------WHILE-----------------");
		while (sum < 1000){
			System.out.printf("%4d", sum);
			sum = a + b;
			a = b;
			b = sum;
		}*/
	}

}
