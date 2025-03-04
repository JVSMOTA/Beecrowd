import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
	Double[] vetor = new Double[100];
	Double x = scanner.nextDouble();
	for (int i = 0; i < 100; i++) {
	    if (i == 0) {
	    	vetor[i] = x;
	    } else {
	    	x = x/2;
		vetor[i] = x;
	    }
	    System.out.println("N[" + i + "] = " + String.format("%.4f", x));
	}
    }

}
