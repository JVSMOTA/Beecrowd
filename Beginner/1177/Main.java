import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		int[] vetor = new int[1000];
	
		int count = 0;
		for (int i = 0; i < 1000; i++) {
			if (count <= (T - 1)) {
				vetor[i] = count;
			} else {
				count = 0;
				vetor[i] = count;
			}
			System.out.println("N[" + i + "] = " + vetor[i]);
			count++;
		}	
    }

}
