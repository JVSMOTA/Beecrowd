import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			int password = scanner.nextInt();
			if (password == 2002) {
				System.out.println("Acesso Permitido");
				break;
			}
			System.out.println("Senha Invalida");
		}
	}
}

