import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
		int idade = 0;
		int soma = 0;
		int count = 0;
		while ((idade = scanner.nextInt()) >= 0) {
			soma += idade;
			count++;
		}
		double media = soma / (double) count;
		System.out.printf("%.2f\n", media);
    }

}
