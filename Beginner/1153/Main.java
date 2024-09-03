import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		for (int i = number - 1; i > 0; i--) {
			number = number * i;
		}

		System.out.println(number);
    }
 
}


