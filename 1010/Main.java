import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String produto1 = scanner.nextLine();
        String produto2 = scanner.nextLine();

        String[] words1 = produto1.split(" ");
        String[] words2 = produto2.split(" ");

        int code1 = Integer.parseInt(words1[0]);
        int code2 = Integer.parseInt(words2[0]);
        int units1 = Integer.parseInt(words1[1]);
        int units2 = Integer.parseInt(words2[1]);
        double price1 = Double.parseDouble(words1[2]);
        double price2 = Double.parseDouble(words2[2]);

        double valorTotal = units1 * price1 + units2 * price2;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorTotal);
    }
}

