import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int sum = 0;
        for (int i = Math.min(x, y); i <= Math.max(x, y); i++) {
            if (i % 13 != 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
