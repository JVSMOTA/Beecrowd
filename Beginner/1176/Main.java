import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
	int T = scanner.nextInt();
        long[] fib = new long[61]; 

        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i <= 60; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt();
            System.out.printf("Fib(%d) = %d\n", N, fib[N]);
        }
    }

}
