import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int casos = scanner.nextInt();
        for (int i = 0; i < casos; i++) {
            int numero = scanner.nextInt();
            ehPrimo(numero);
        }
        scanner.close();
    }

    public static void ehPrimo(int numero) {
        if (numero < 2) {
            System.out.println(numero + " nao eh primo");
            return;
        }

        boolean primo = true;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                primo = false;
                break;
            }
        }

        if (primo) {
            System.out.println(numero + " eh primo");
        } else {
            System.out.println(numero + " nao eh primo");
        }
    }
}

