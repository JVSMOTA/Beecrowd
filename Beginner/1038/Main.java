import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		
		String inputValue = scanner.nextLine();
		String[] values = inputValue.split(" ");
		int code = Integer.parseInt(values[0]);
		int quantityOfItem = Integer.parseInt(values[1]);
		double total = 0;		

		if (code == 1) {
			total = quantityOfItem * 4.00;
		} else if (code == 2) {
			total = quantityOfItem * 4.50;
		} else if (code == 3) {
			total = quantityOfItem * 5.00;
		} else if (code == 4) {
			total = quantityOfItem * 2.00;
		} else {
			total = quantityOfItem * 1.50;
		}
		System.out.printf("Total: R$ %.2f\n", total);

	}
}
