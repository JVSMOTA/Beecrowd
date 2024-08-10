import java.io.IOException;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		String inputValue = scanner.nextLine();
		String[] values = inputValue.split(" ");
		
		double a = Double.parseDouble(values[0]);
		double b = Double.parseDouble(values[1]);
		double c = Double.parseDouble(values[2]);
		
		double menor1 = 0;
		double menor2 = 0;
		double maior = 0;
	
		if ( a >= b && a >= c ) {
			maior = a;
			menor1 = b;
			menor2 = c;
		} else if (b >= a && b >= c) {
			maior = b;
			menor1 = a;
			menor2 = c;
		} else if (c >= a && c >= b) {
			maior = c;
			menor1 = a;
			menor2 = b;
		}
		
		if ( menor1 + menor2 > maior ) {
			double perimetro = a + b + c;
			System.out.printf("Perimetro = %.1f\n", perimetro);
		} else {
			double area = (a + b) * c / 2.0;
			System.out.printf("Area = %.1f\n", area);
		}		
	}
}

