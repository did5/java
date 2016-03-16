package SP1While;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class RandomNumberGame {

	public static void main(String[] args) throws IOException {
		int  userNumber = 0;
		int counter = 1;
		Random random = new Random();
		int randomNumber = random.nextInt(100) + 1;
		System.out.printf("Random number: %d\n", randomNumber);
		
		BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
		System.out.println("�������� ������� ��������� �����!");
		System.out.println("��� ���������� ���� ����� 0");
				
		do {
			System.out.println("����� ����� �� 1 �� 100:");
			userNumber = Integer.parseInt(reader.readLine());
			
			if (counter == 7){
				System.out.println("�� ��������! ������������ ���������� ������� 7");
				break;
			}
			
			if (userNumber == randomNumber) {
				System.out.printf("����������! �� ������. ��� �����: %d\n", userNumber);
				System.out.printf("����� �������: %d", counter);
			} else if (userNumber == 0){
				System.out.println("����� ����� �� ����!");
				break;
			} else if (userNumber > randomNumber) {
				System.out.println("�����! �������� ��� �����.");
			} else if (userNumber < randomNumber){
				System.out.println("����! �������� ��� �����.");
			} else {
				System.out.println("�� �����");
			}
			counter++;
		} while (userNumber != randomNumber);
	}
}
