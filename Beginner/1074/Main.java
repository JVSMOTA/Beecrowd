import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int count = 0;
		String message = "";		

		while (count < n) {
			
			int number = scanner.nextInt();
			
			if (number != 0) {
				
				if (Math.abs(number) % 2 == 1) {
					message += "ODD";
				} else {
					message += "EVEN";
				}
			
				if (number > 0) {
					message += " POSITIVE\n";
				} else {
					message += " NEGATIVE\n";
				}

			} else {
				message += "NULL\n";
			}
			count++;
		}

		System.out.print(message);
	}
}
