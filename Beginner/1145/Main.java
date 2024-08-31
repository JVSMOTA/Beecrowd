import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = 1; i <= y; i++) {
            if (count < (x - 1)) {
                sb.append(i).append(" ");
                count++;
            } else {
                sb.append(i).append("\n");
                count = 0;
            }
        }

        System.out.print(sb.toString());
    }
}

