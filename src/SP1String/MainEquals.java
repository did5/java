package SP1String;

public class MainEquals {

	public static void main(String[] args) {
		String string1 = "hello";
		// String string2 = "hello";
		String string2 = new String("hello"); // == сравнивает адреса в памяти, а не значения
		
		if (string1 == string2){
			System.out.println("equals");
		} else {
			System.out.println("not equals");
		}
		
		if (string1.equals(string2)){
			System.out.println("equals");
		} else {
			System.out.println("not equals");
		}
	}

}
