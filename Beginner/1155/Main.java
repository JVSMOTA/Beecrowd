import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
		double s = 1.0;
		for (double i = 2; i <= 100; i++) {
			s += (1.00/i);
		}
		System.out.printf("%.2f\n",s);
    }

}
