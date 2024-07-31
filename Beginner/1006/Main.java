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

	double pesoA = 2.0;
	double pesoB = 3.0;
	double pesoC = 5.0;

	double a = scanner.nextDouble();
	double b = scanner.nextDouble();
	double c = scanner.nextDouble();
	
	double media = (pesoA * a + pesoB * b + pesoC * c) / (pesoA + pesoB + pesoC);

	System.out.printf("MEDIA = %.1f\n", media);

    }
 
}

