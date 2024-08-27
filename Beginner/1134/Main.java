import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		int code = 0;

		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		while (code != 4) {
			code = scanner.nextInt();
			
			if (code == 1) {
				alcool++;
			} else if (code == 2) {
				gasolina++;
			} else if (code == 3) {
				diesel++;
			}
		}
		
		System.out.printf("MUITO OBRIGADO\nAlcool: %d\nGasolina: %d\nDiesel: %d\n", alcool, gasolina, diesel);

	}
}
