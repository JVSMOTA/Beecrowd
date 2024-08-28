import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();

		for (double i = 1; i <= number; i++) {
			System.out.printf("%.0f %.0f %.0f\n", i, (Math.pow(i, 2)), (Math.pow(i, 3)));
		}
	}
}
