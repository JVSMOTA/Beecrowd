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
        
        String stringValue1 = scanner.nextLine();
        String stringValue2 = scanner.nextLine();

        String[] values1 = stringValue1.split(" ");
        String[] values2 = stringValue2.split(" ");

        double x1 = Double.parseDouble(values1[0]);
        double y1 = Double.parseDouble(values1[1]);
        
        double x2 = Double.parseDouble(values2[0]);
        double y2 = Double.parseDouble(values2[1]);

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.printf("%.4f\n", distance);
    
    }
 
}
