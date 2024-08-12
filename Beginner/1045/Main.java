import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		String inputValue = scanner.nextLine();
		String[] values = inputValue.split(" ");
	
		double a = Double.parseDouble(values[0]);
		double b = Double.parseDouble(values[1]);
		double c = Double.parseDouble(values[2]);
		
		String message = "";		

		if (a >= (b + c) | b >= (a + c) | c >= (a + b)) {
			message = "NAO FORMA TRIANGULO";
		} else if (Math.pow(a,2) == (Math.pow(b,2) + Math.pow(c,2)) | Math.pow(b,2) == (Math.pow(a,2) + Math.pow(c,2)) | Math.pow(c,2) == (Math.pow(a,2) + Math.pow(b,2))) {
			message = "TRIANGULO RETANGULO";
		} else if (Math.pow(a,2) > (Math.pow(b,2) + Math.pow(c,2)) | Math.pow(b,2) > (Math.pow(a,2) + Math.pow(c,2)) | Math.pow(c,2) > (Math.pow(a,2) + Math.pow(b,2))) {
			message = "TRIANGULO OBTUSANGULO";
		} else if (Math.pow(a,2) < (Math.pow(b,2) + Math.pow(c,2)) | Math.pow(b,2) < (Math.pow(a,2) + Math.pow(c,2)) | Math.pow(c,2) < (Math.pow(a,2) + Math.pow(b,2))) {
			message = "TRIANGULO ACUTANGULO";
		}
			
		if (!message.equals("NAO FORMA TRIANGULO")) {
			if (a == b && b == c) {
                        	message += "\nTRIANGULO EQUILATERO";
                	} else if ((a == b && b != c) | (a == c && b != c) | (b == c && a != c)) {
                        	message += "\nTRIANGULO ISOSCELES";
                	}			
		} 	

		System.out.println(message);
		
	}
	
}

