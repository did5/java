package SP1Boolean;

public class Main {

	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = false;
		boolean b3;
		
		// ���������� �
		b3 = b1 && b2;
		
		// ���������� ���
		b3 = b1 || b2;
		
		//���������� ��
		b3 = !b1;
		
		//XOR (����� b1 � b2 �� �����)
		b3 = b1^b2;
		
		System.out.println(b3);

	}

}
