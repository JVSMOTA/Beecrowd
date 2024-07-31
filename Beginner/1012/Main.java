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
    	
	String stringValue = scanner.nextLine();
	String[] values = stringValue.split(" ");

	Double a = Double.parseDouble(values[0]);
	Double b = Double.parseDouble(values[1]);
	Double c = Double.parseDouble(values[2]);

	double triangulo = (a * c) / 2.0;
	double circulo = 3.14159 * Math.pow(c, 2);
	double trapezio = (a + b) / 2.0 * c;
	double quadrado = b * b;
	double retangulo = a * b;
	
	System.out.printf("TRIANGULO: %.3f\n", triangulo);
    	System.out.printf("CIRCULO: %.3f\n", circulo);
	System.out.printf("TRAPEZIO: %.3f\n", trapezio);
	System.out.printf("QUADRADO: %.3f\n", quadrado);
	System.out.printf("RETANGULO: %.3f\n", retangulo);

    }
 
}

