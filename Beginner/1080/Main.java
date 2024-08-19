import java.io.IOException;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int size = 100;
		int[] list = new int[size];

		int count = 0;
		int maior = 0;
		int indice = 0;
		while (count < size) {
			int number = scanner.nextInt();
			if (number > maior) {
				maior = number;
				indice = count + 1;
			}
			count++;
		}

		System.out.printf("%d\n%d\n",maior, indice);
	}
}
