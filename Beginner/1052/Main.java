import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

		int inputMes = scanner.nextInt();
		String mes = "December";

        if (inputMes == 1) {
			mes = "January";
        } else if (inputMes == 2) {
			mes = "February";	
        } else if (inputMes == 3) {
			mes = "March";
        } else if (inputMes == 4) {
			mes = "April";
        } else if (inputMes == 5) {
			mes = "May";
        } else if (inputMes == 6) {
			mes = "June";
        } else if (inputMes == 7) {
			mes = "July";
        } else if (inputMes == 8) {
			mes = "August";
        } else if (inputMes == 9) {
			mes = "September";
        } else if (inputMes == 10) {
			mes = "October";
        } else if (inputMes == 11) {
    		mes = "November";
		}

		System.out.println(mes);

	}
}

