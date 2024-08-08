import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		
		String inputValue = scanner.nextLine();
		String[] values = inputValue.split(" ");
	
		double x = Double.parseDouble(values[0]);
		double y = Double.parseDouble(values[1]);
	
		String message = "Origem";

		if (x != 0 && y == 0) {
			message = "Eixo X";
		} else if (y != 0 && x == 0) {
			message = "Eixo Y";
		} else if (x > 0 && y > 0) {
			message = "Q1";
		} else if (x < 0 && y > 0) {
			message = "Q2";
		} else if (x < 0 && y < 0) {
			message = "Q3";
		} else if (x > 0 && y < 0) {
			message = "Q4";
		}			
	
		System.out.println(message);	
	
	}

}
