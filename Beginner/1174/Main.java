import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
	double[] vetor = new double[100];
	for (int i = 0; i < 100; i++) {
	    vetor[i] = scanner.nextDouble();
	    if (vetor[i] <= 10) {
	    	System.out.println("A[" + i + "] = " + vetor[i]);
	    }
	}
    }

}
