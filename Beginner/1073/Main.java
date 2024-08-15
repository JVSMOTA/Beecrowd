import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		int count = 1;

		while (count <= input) {
			if (count % 2 == 0) {
				int value = (int) Math.pow(count, 2);
				System.out.printf("%d^2 = %d\n", count, value);
				count += 2;
			} else {
				count++;
			}
		
		}

	}
}
