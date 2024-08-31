import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		String line = "";	
		int x;
		while ((x = scanner.nextInt()) != 0) {
			line = "";
			for (int i = 1; i <= x; i++) {
				if (i != x) {
					line += i + " ";
				} else {
					System.out.println(line + i);
				}
			}
		}
	}
}
