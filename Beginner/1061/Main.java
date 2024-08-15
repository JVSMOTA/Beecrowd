import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		int secIniciais = 0;
		int secFinais = 0;

		while (count < 4) {
			
			String input = scanner.nextLine();
			
			if (count == 0) {
				String[] inputValues = input.split(" ");
				secIniciais = Integer.parseInt(inputValues[1]) * 86400;
			
			} else if (count == 1) {
				String[] inputValues = input.split(" : ");
				secIniciais += Integer.parseInt(inputValues[0]) * 3600;
				secIniciais += Integer.parseInt(inputValues[1]) * 60;
				secIniciais += Integer.parseInt(inputValues[2]);
			
			} else if (count == 2) {
				String[] inputValues = input.split(" ");
                secFinais = Integer.parseInt(inputValues[1]) * 86400;
			
			} else if (count == 3) {
				String[] inputValues = input.split(" : ");
                secFinais += Integer.parseInt(inputValues[0]) * 3600;
                secFinais += Integer.parseInt(inputValues[1]) * 60;
                secFinais += Integer.parseInt(inputValues[2]);
			}
			count++;
		}

		int secTotais = secFinais - secIniciais;

		System.out.printf("%d dia(s)\n", secTotais / 86400);
        secTotais %= 86400;
        System.out.printf("%d hora(s)\n", secTotais / 3600);
        secTotais %= 3600;
        System.out.printf("%d minuto(s)\n", secTotais / 60);
        System.out.printf("%d segundo(s)\n", secTotais % 60);

	}
}
