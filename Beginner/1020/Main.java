import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
	
	Scanner scanner = new Scanner(System.in);	
	
	int years = 0;
	int months = 0;	
	int days = scanner.nextInt();
	
	while (days > 29) {
	    if (days >= 365) {
		days -= 365;
		years++;   
	    } else {
	    	days -= 30;
		months++;
	    }
	}
	
	System.out.printf("%d ano(s)\n", years);
	System.out.printf("%d mes(es)\n", months);
	System.out.printf("%d dia(s)\n", days);
    }

}

