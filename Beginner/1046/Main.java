import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		String inputValue = scanner.nextLine();
		String[] values = inputValue.split(" ");
		
		int inicio = Integer.parseInt(values[0]);
		int fim = Integer.parseInt(values[1]);
		
		int duracao = 0;
			
		if (fim > inicio) {
			duracao = fim - inicio;
		} else if (inicio > fim) {
			duracao = 24 - inicio + fim;
		} else {
			duracao = 24;
		}
		
		System.out.printf("O JOGO DUROU %d HORA(S)\n", duracao);	
	}
	
}

