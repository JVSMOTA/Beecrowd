import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		double salary = scanner.nextDouble();
		
		int percentual = 0;

		if (salary >= 0 && salary <= 400) {
			percentual = 15;
		} else if (salary >= 400.01 && salary <= 800) {
			percentual = 12;
		} else if (salary >= 800.01 && salary <= 1200) {
			percentual = 10;
		} else if (salary >= 1200.01 && salary <= 2000) {
			percentual = 7;
		} else if (salary >= 2000.01) {
			percentual = 4;
		}

		double newSalary = (salary * percentual / 100) + salary;
		
		System.out.printf("Novo salario: %.2f\n", newSalary);
		System.out.printf("Reajuste ganho: %.2f\n", (newSalary - salary));
		System.out.println("Em percentual: " + percentual + " %");

	}
	
}
