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
		System.out.println("Попробуй угадать случайное число!");
		System.out.println("Для завершения игры введи 0");
				
		do {
			System.out.println("Введи число от 1 до 100:");
			userNumber = Integer.parseInt(reader.readLine());
			
			if (counter == 7){
				System.out.println("Ты проиграл! Максимальное количество попыток 7");
				break;
			}
			
			if (userNumber == randomNumber) {
				System.out.printf("Поздравляю! Ты угадал. Это число: %d\n", userNumber);
				System.out.printf("Число попыток: %d", counter);
			} else if (userNumber == 0){
				System.out.println("Игрок вышел из игры!");
				break;
			} else if (userNumber > randomNumber) {
				System.out.println("Много! Попробуй еще разок.");
			} else if (userNumber < randomNumber){
				System.out.println("Мало! Попробуй еще разок.");
			} else {
				System.out.println("Не понял");
			}
			counter++;
		} while (userNumber != randomNumber);
	}
}
