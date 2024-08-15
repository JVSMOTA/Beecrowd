import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int pares = 0;
        int count = 0;

        while (count < 5) {
            double number = scanner.nextDouble();
            if (number % 2 == 0) {
                pares++;
            }
            count++;
        }

        System.out.println( pares + " valores pares");
    }

}
