import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int n = scanner.nextInt();
		int soma = 0;

		while (n <= 0) {
			n = scanner.nextInt();
		}

		for (int i = 1; i <= n; i++) {
			soma += a;
			a++;
		}
		System.out.println(soma);

	}
}
