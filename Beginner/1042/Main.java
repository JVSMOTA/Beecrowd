import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		String inputValue = scanner.nextLine();
		String[] values = inputValue.split(" ");
		
		int a = Integer.parseInt(values[0]);
		int b = Integer.parseInt(values[1]);
		int c = Integer.parseInt(values[2]);
		
		int maior = 0;
		int meio = 0;
		int menor = 0;		

		if ( a >= b && a >= c) {
			maior = a;
			if (maior >= b && b >= c) {
				menor = c;
				meio = b;
			} else {
				menor = b;
				meio =  c;
			}
		} else if (b >= a && b >= c) {
			maior = b;
			if (maior >= a && a >= c) {
				menor = c;
				meio = a;
			} else {
				menor = a;
				meio = c;
			}
		} else if (c >= a && c >= b) {
			maior = c;
			if (maior >= a && a >= b) {
				menor = b;
				meio = a;
			} else {
				menor = a;
				meio = b;
			}
		}
		
		System.out.printf("%d\n%d\n%d\n",menor, meio, maior);
		System.out.printf("\n%d\n%d\n%d\n", a, b, c);
		
	}

}

