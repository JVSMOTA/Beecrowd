import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		int totalAnimals = 0;

		int c = 0;
		int r = 0;
		int s = 0;

		int tests = scanner.nextInt();

		 for (int i = 0; i < tests; i++) {
            int amount = scanner.nextInt();
            String animal = scanner.next();

            if (animal.equals("C")) {
                c += amount;
            } else if (animal.equals("R")) {
                r += amount;
            } else if (animal.equals("S")) {
                s += amount;
            }

            totalAnimals += amount;
        }

		double percentualC = ((double) c / totalAnimals ) * 100;
		double percentualR = ((double) r / totalAnimals ) * 100;
		double percentualS = ((double) s / totalAnimals ) * 100;

		System.out.printf("Total: %d cobaias\n", totalAnimals);
		System.out.printf("Total de coelhos: %d\n", c);
		System.out.printf("Total de ratos: %d\n", r);
		System.out.printf("Total de sapos: %d\n", s);
		System.out.printf("Percentual de coelhos: %.2f %%\n", percentualC);
		System.out.printf("Percentual de ratos: %.2f %%\n", percentualR);
		System.out.printf("Percentual de sapos: %.2f %%\n", percentualS);
		scanner.close();
	}
}
