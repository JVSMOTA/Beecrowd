import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
	int[] vetor = new int[20];
	for (int i = 19; i >= 0; i--) {
	    vetor[i] = scanner.nextInt();
	}
	for (int i = 0; i < 20; i++) {
	    System.out.println("N[" + i + "] = " + vetor[i]);
	}
    }

}
