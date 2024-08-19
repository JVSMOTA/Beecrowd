import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        scanner.nextLine();

        double[] medias = new double[number];

        for (int i = 0; i < number; i++) {
            String inputValue = scanner.nextLine();
            String[] values = inputValue.split(" ");

            double nota1 = Double.parseDouble(values[0]);
            double nota2 = Double.parseDouble(values[1]);
            double nota3 = Double.parseDouble(values[2]);

            double media = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;
            medias[i] = media;
        }

        for (double media : medias) {
            System.out.printf("%.1f\n", media);
        }
    }
}

