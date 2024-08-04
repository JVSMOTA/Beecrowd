import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        double money = scanner.nextDouble();

        int nota100 = 0;
        int nota50 = 0;
        int nota20 = 0;
        int nota10 = 0;
        int nota5 = 0;
        int nota2 = 0;

        int moeda1 = 0;
        int moeda50 = 0;
        int moeda25 = 0;
        int moeda10 = 0;
        int moeda05 = 0;
        int moeda01 = 0;

        // Convertendo para centavos para evitar problemas de precisão
        int centavos = (int) Math.round(money * 100);

        nota100 = centavos / 10000;
        centavos %= 10000;

        nota50 = centavos / 5000;
        centavos %= 5000;

        nota20 = centavos / 2000;
        centavos %= 2000;

        nota10 = centavos / 1000;
        centavos %= 1000;

        nota5 = centavos / 500;
        centavos %= 500;

        nota2 = centavos / 200;
        centavos %= 200;

        moeda1 = centavos / 100;
        centavos %= 100;

        moeda50 = centavos / 50;
        centavos %= 50;

        moeda25 = centavos / 25;
        centavos %= 25;

        moeda10 = centavos / 10;
        centavos %= 10;

        moeda05 = centavos / 5;
        centavos %= 5;

        moeda01 = centavos;

        System.out.println("NOTAS:");
        System.out.printf("%d nota(s) de R$ 100.00\n", nota100);
        System.out.printf("%d nota(s) de R$ 50.00\n", nota50);
        System.out.printf("%d nota(s) de R$ 20.00\n", nota20);
        System.out.printf("%d nota(s) de R$ 10.00\n", nota10);
        System.out.printf("%d nota(s) de R$ 5.00\n", nota5);
        System.out.printf("%d nota(s) de R$ 2.00\n", nota2);

        System.out.println("MOEDAS:");
        System.out.printf("%d moeda(s) de R$ 1.00\n", moeda1);
        System.out.printf("%d moeda(s) de R$ 0.50\n", moeda50);
        System.out.printf("%d moeda(s) de R$ 0.25\n", moeda25);
        System.out.printf("%d moeda(s) de R$ 0.10\n", moeda10);
        System.out.printf("%d moeda(s) de R$ 0.05\n", moeda05);
        System.out.printf("%d moeda(s) de R$ 0.01\n", moeda01);
    }
}
