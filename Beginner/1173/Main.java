import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
	int inteiro = scanner.nextInt();
	int[] vetor = new int[10];
	vetor[0] = inteiro;
	System.out.println("N[0] = "+ inteiro);
	for (int i = 1; i < 10; i++) {
	    vetor[i] = vetor[i-1] * 2;
	    System.out.println("N[" + i + "] = " + vetor[i]);
	}

    }

}
