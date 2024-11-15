import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Integer casos = scanner.nextInt();

		for (int i = 0; i < casos; i++) {
			Integer numero = scanner.nextInt();
			ehPerfeito(numero);
		}
    }

    public static void ehPerfeito(int numero) {
		int total = 0;
		for (int i = 1; i < numero; i++) {
			if (numero % i == 0) {
				total += i;
			}
		}

		if (total == numero) {
			System.out.println(numero + " eh perfeito");
		} else {
			System.out.println(numero + " nao eh perfeito");
		}
	}

}
