import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
		String total = "";
        while (true) {
            int M = scanner.nextInt();
            int N = scanner.nextInt();

            // Termina quando M ou N for menor ou igual a zero
            if (M <= 0 || N <= 0) {
                break;
            }

            // Determina os limites para a sequência
            int start = Math.min(M, N);
            int end = Math.max(M, N);

            int sum = 0;
            StringBuilder sequence = new StringBuilder();

            // Gera a sequência de números e calcula a soma
            for (int i = start; i <= end; i++) {
                sequence.append(i).append(" ");
                sum += i;
            }
			
			total += sequence.toString() + "Sum=" + sum + "\n";
        }
		
        System.out.print(total);
        scanner.close();
    }
}

