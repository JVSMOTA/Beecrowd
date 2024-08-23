import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		
		int number = scanner.nextInt();

		for (int i = 0; i < number; i++) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();

			if (y != 0) {
				double result = (double) x / y;
				System.out.printf("%.1f\n", result);
			} else {
				System.out.println("divisao impossivel");
			}
		}
	}
}
