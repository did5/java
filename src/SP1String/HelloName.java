package SP1String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloName {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
		System.out.print("������� ���� ���:");
		String hello = String.format("������, %s!", reader.readLine());
		System.out.println(hello);

	}

}
