import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
	Scanner scanner = new Scanner(System.in);

	String name = scanner.nextLine();
	double salary = scanner.nextDouble();
	double sales = scanner.nextDouble();
	double bonus = 15.00;

	System.out.printf("TOTAL = R$ %.2f\n", (salary + (sales / 100.00 * bonus)));	
    }
 
}
