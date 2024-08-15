import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
		
		double renda = scanner.nextDouble();
        double imposto = 0.0;

        if (renda > 4500.00) {
            imposto += (renda - 4500.00) * 0.28;
            renda = 4500.00;
        }
        if (renda > 3000.00) {
            imposto += (renda - 3000.00) * 0.18;
            renda = 3000.00;
        }
        if (renda > 2000.00) {
            imposto += (renda - 2000.00) * 0.08;
        }

        if (imposto == 0.0) {
            System.out.println("Isento");
        } else {
            System.out.printf("R$ %.2f\n", imposto);
        }
    }
}
