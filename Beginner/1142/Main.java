import java.io.IOException;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();

		for (int i = 1; i <= (number * 4); i++) {
			if (i % 4 == 0) {
				System.out.print("PUM\n");
			} else {
				System.out.print(i + " ");
			}
		} 
	}
}

