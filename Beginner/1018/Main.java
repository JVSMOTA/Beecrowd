import java.io.IOException;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        
        int value = scanner.nextInt();
        int copyValue = value;

        int notas100 = 0;
        int notas50 = 0;
        int notas20 = 0;
        int notas10 = 0;
        int notas5 = 0;
        int notas2 = 0;
        int notas1 = 0;

        while (value > 0) {
            
            if (value >= 100) {
                value -= 100;
                notas100++;
            } else if (value >= 50) {
                value -= 50;
                notas50++;
            } else if (value >= 20) {
                value -= 20;
                notas20++;
            } else if (value >= 10) {
                value -= 10;
                notas10++;
            } else if (value >= 5) {
                value -= 5;
                notas5++;
            } else if (value >= 2) {
                value -= 2;
                notas2++;
            } else if (value >= 1) {
                value -= 2;
                notas1++;
            }
        }
        System.out.println(copyValue);
        System.out.printf("%d nota(s) de R$ 100,00\n", notas100);
        System.out.printf("%d nota(s) de R$ 50,00\n", notas50);
        System.out.printf("%d nota(s) de R$ 20,00\n", notas20);
        System.out.printf("%d nota(s) de R$ 10,00\n", notas10);
        System.out.printf("%d nota(s) de R$ 5,00\n", notas5);
        System.out.printf("%d nota(s) de R$ 2,00\n", notas2);
        System.out.printf("%d nota(s) de R$ 1,00\n", notas1);
    
    }

}
