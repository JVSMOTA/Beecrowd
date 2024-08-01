import java.io.IOException;
import java.util.Scanner;

public class Main{
    
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int value = scanner.nextInt();

        int horas = value / 3600;
        int minutos = value % 3600 / 60;
        int segundos = value % 3600 % 60;
    
        System.out.printf("%d:%d:%d\n", horas, minutos, segundos);

    }
}
