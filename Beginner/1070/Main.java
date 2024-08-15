import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = 1;

        while (count <= 6) {
            if (number % 2 != 0) {
                System.out.println(number);
				number += 2;
				count++;
			} else {
				number++;
			}
        }
    }
}
