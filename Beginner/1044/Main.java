import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		String stringValue = scanner.nextLine();
		String[] values = stringValue.split(" ");
		int x = Integer.parseInt(values[0]);
		int y = Integer.parseInt(values[1]);
		
		if (y % x == 0 || x % y == 0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		}
		
	}

}


