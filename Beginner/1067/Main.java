import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int count = 1;
		
		while (count <= number) {
			if (count % 2 != 0) {
				System.out.println(count);
			}
			count++;
		}
	}
}

