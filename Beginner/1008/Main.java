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
	
	int numberOfEmployers = scanner.nextInt();
	int workHoursPerMonth = scanner.nextInt();
    	float amountPerHour = scanner.nextFloat();

	System.out.println("NUMBER = " + numberOfEmployers);
	System.out.printf("SALARY = U$ %.2f\n", (workHoursPerMonth * amountPerHour));
    }
 
}
