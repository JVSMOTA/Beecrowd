import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Integer[] vetor = new Integer[10];
        for (int i = 0; i <= 9; i++) {
            Integer num = scanner.nextInt();
            if (num <= 0) {
                vetor[i] = 1;
            } else {
                vetor[i] = num;
            }
        }

        for (int i = 0; i <= 9; i++) {
            System.out.println("X["+ i +"] = " + vetor[i]);
        }
    }

}
