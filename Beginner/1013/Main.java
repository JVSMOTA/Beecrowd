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
	Scanner sc = new Scanner(System.in);

	String stringValue = sc.nextLine();
	String[] values = stringValue.split(" ");

	int a = Integer.parseInt(values[0]);
	int b = Integer.parseInt(values[1]);
	int c = Integer.parseInt(values[2]);

        int maiorAB = (a + b + Math.abs(a - b)) / 2;
        int maior = (maiorAB + c + Math.abs(maiorAB - c)) / 2;

        System.out.printf("%d eh o maior\n", maior);	
    }
 
}

