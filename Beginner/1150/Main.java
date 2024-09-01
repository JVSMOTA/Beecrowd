import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        
        int x = scanner.nextInt();
        int z;

        while ((z = scanner.nextInt()) <= x) {
        }

		int count = 0;
    	int soma = 0;

		while (soma < z) {
			soma += x;
			count++;
			x++;
		}	
		System.out.println(count);
			
    }
}
