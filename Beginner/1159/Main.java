import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
        int number;
        while ((number = scanner.nextInt()) != 0) {
            int sum = 0;

            if (number % 2 != 0) {
                number++;
            }

            for (int i = 0; i < 5; i++) {
                sum += number;
                number += 2;
            }
            System.out.println(sum);
        }
	
	}
}
