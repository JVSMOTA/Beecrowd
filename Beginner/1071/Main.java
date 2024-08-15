import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        
		int x = scanner.nextInt();
        int y = scanner.nextInt();
        
		int count = 1;
		int sum = 0;
		
		y++;
        while (y < x) {
            if (y % 2 != 0) {
                sum += y;
                y += 2;
          	} else {
				y++;
			}
        }
		System.out.println(sum);
	}
}

