package SP1While;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhatIsYourName {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
		String name = "";
		
		while (name.isEmpty()) {
			System.out.print("Введите ваше имя:");
			name = reader.readLine();
		}
		System.out.println(String.format("Привет, %s!", name));
	}

	
}
