import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
		
		int casos = scanner.nextInt();

		for (int i = 0; i < casos; i++) {
			int pA = scanner.nextInt();
			int pB = scanner.nextInt();
			double g1 = scanner.nextDouble();
			double g2 = scanner.nextDouble();
			
			int years = 0;
			while (true) {
				if (years > 100) {
					System.out.println("Mais de 1 seculo.");
					break;
				} else {
					if (pA > pB) {
						System.out.printf("%d anos.\n", years);
						break;
					}
				}
				
				pA += Math.floor(pA * g1 / 100);
				pB += Math.floor(pB * g2 / 100);

				years++;
			}
		}
	}
}
