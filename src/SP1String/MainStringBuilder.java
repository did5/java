package SP1String;
import java.lang.*;

public class MainStringBuilder {

	public static void main(String[] args) {
		String hello = "Привет";
		String name = "Джон";
		String result = hello + " " + name; // плохой вариант, т.к. создается при 
		System.out.println(result);
		String r2 = String.format("%s, %s!", hello, name);
		System.out.println(r2);
		
		StringBuilder sb = new StringBuilder();
		sb.append(hello);
		sb.append(" ");
		sb.append(name);
		
		System.out.println(sb.toString());
	}

}
