package SP1While;

public class Main {

	public static void main(String[] args) {
		System.out.println("-------------WHILE-----------------");
		int a = 1;
		while (a < 1000){
			a *= 2;
			if (a == 32) continue; //пропустить эту итерацию
			if (a == 256) break; //завершить цикл на этой итерации, цикл завершиться на 128
			System.out.println(a);
		}
		
		System.out.println("-----------DO WHILE---------------");
		
		int b = 1001;
		do {
			b *= 2;
			if (b == 32) continue; 
			if (b == 256) break; 
			System.out.println(b);
		}
		while (b < 1000);
	}

}
