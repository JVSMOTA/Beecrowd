import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();

		int proximo, anterior = 0, atual = 1;
        for (int i = 1; i <= number; i++) {
        	if (i == number) { 
				System.out.println(anterior);
			} else {
				System.out.print(anterior + " ");
        		proximo = anterior + atual;
        		anterior = atual;
        		atual = proximo;
			}
    	}
	}
}
