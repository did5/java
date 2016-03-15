package SP1Boolean;

public class Main {

	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = false;
		boolean b3;
		
		// Логическое И
		b3 = b1 && b2;
		
		// Логическое ИЛИ
		b3 = b1 || b2;
		
		//Логическое НЕ
		b3 = !b1;
		
		//XOR (когда b1 и b2 не равны)
		b3 = b1^b2;
		
		System.out.println(b3);

	}

}
