import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int pares = 0; int impares = 0;
		int positivos = 0; int negativos = 0;

		int count = 0;

        while (count < 5) {
            double number = scanner.nextDouble();
            if (number % 2 == 0) {
                pares++;
            } else {	
				impares++;
			}

			if (number > 0) {
				positivos++;
			} else if (number < 0) {
				negativos++;
			}
            count++;
        }

        System.out.println( pares + " valores par(es)");
        System.out.println( impares + " valores impar(es)");
        System.out.println( positivos + " valores positivo(s)");
        System.out.println( negativos + " valores negativo(s)");
    }

}
