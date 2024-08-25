import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		double sum = 0.0;
		while (count < 2) {
			double number = scanner.nextDouble();
			if (number >= 0 && number <= 10) {
				sum += number;
				count++;
			} else {
				System.out.println("nota invalida");
			}
		}
		System.out.printf("media = %.2f\n", (sum/2));
	}
}
