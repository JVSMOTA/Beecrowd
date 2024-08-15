import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int count = 1;

		int in = 0; int out = 0;

        while (count <= x) {
			int number = scanner.nextInt();
            if (number <= 20 && number >= 10) {
                in++;
            } else {
                out++;
            }
			count++;
        }
        System.out.println(in + " in");
        System.out.println(out + " out");
    }
}
