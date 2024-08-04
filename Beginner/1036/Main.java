import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
	Scanner scanner = new Scanner(System.in);

	String inputValues = scanner.nextLine();
	String[] values = inputValues.split(" ");
		
	double a = Double.parseDouble(values[0]);
  	double b = Double.parseDouble(values[1]);
	double c = Double.parseDouble(values[2]);

	if (a == 0) {
            System.out.println("Impossivel calcular");
            return;
        }
		
	double delta = Math.pow(b, 2) - 4 * a * c;

	if (delta < 0) {
            System.out.println("Impossivel calcular");
            return;
        }	

	double r1 = (-b + Math.sqrt(delta)) / (2 * a);
	double r2 = (-b - Math.sqrt(delta)) / (2 * a);

	System.out.printf("R1 = %.5f\n", r1);
	System.out.printf("R2 = %.5f\n", r2);	
	
    }
}
