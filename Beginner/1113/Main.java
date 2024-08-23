import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int x = 0;
		int y = 1;
		
		String resposta = "";

		while (x != y) {
			x = scanner.nextInt();
			y = scanner.nextInt();

			if ( x > y) {
				resposta += "Decrescente\n";
			} else if (x < y) {
				resposta += "Crescente\n";
			} else {
				break;
			}
		}

		System.out.print(resposta);
		scanner.close();
	}
}

