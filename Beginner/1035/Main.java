import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        
        String inputValue = scanner.nextLine();
        String[] values = inputValue.split(" ");

        int a = Integer.parseInt(values[0]);
        int b = Integer.parseInt(values[1]);
        int c = Integer.parseInt(values[2]);
        int d = Integer.parseInt(values[3]);
        
        String message = "";        

        if (b > c && d > a && (c + d) > (a + b) && c > 0 && d > 0 && (a%2 == 0)) {
            message = "Valores aceitos";
        } else {
            message = "Valores nao aceitos";
        }

        System.out.println(message);
    }
}
