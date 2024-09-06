import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
		double s = 1;
		int j = 2;
		for (double i = 3.0; i <= 39; i++) {
			s += i / j;
			i++;
			j *= 2;
		}
		System.out.printf("%.2f\n", s);

    }

}
