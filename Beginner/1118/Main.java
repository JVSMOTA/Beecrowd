import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        double sum = 0.0;

        while (true) {
            double nota = scanner.nextDouble();

            if (nota >= 0 && nota <= 10) {
                sum += nota;
                counter++;
                if (counter == 2) {
                    System.out.printf("media = %.2f\n", (sum / 2));
                    sum = 0;
                    counter = 0;

                    // Pergunta ao usuário se deseja um novo cálculo
                    int resposta;
                    do {
                        System.out.println("novo calculo (1-sim 2-nao)");
                        resposta = scanner.nextInt();
                    } while (resposta != 1 && resposta != 2);

                    if (resposta == 2) {
                        break; // Sai do loop se o usuário não quiser novo cálculo
                    }
                }
            } else {
                System.out.println("nota invalida");
            }
        }

        scanner.close();
    }
}

