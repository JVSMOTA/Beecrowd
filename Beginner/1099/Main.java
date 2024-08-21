import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		
		int number = scanner.nextInt();
		int[] values = new int[number];
		
		for (int i = 0; i < number; i++) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			
			if (x <= y) {
				for (int j = x + 1; j < y; j++) {
                	if (j % 2 == 1) {
                    	values[i] += j;
                    	j++;
                	}
            	}
			} else {
				for (int j = y + 1; j < x; j++) {
                	if (j % 2 == 1) {
                    	values[i] += j;
                    	j++;
					}
				}
			}
		}

		for (int value : values) {
			System.out.println(value);
		}

	}
}

