import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		
		int positivos = 0;
		int count = 0;
		
		while (count < 6) {
			double number = scanner.nextDouble();
			if (number >= 0) {
				positivos++;
			}
			count++;
		}

		System.out.println( positivos + " valores positivos");
	}

}
