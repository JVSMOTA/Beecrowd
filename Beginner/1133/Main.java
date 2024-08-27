import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		int x = scanner.nextInt();
		int y = scanner.nextInt();

		for (int i = Math.min(x, y) + 1; i < Math.max(x, y); i++) {
			if (Math.abs(i) % 5 == 3 || Math.abs(i) % 5 == 2) {
				System.out.println(i);
			}
		}

	}
}

