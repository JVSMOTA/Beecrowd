import java.io.IOException;

public class Main{
	public static void main(String[] args) throws IOException {
		int i = 1;
		int j = 7;
		int count = 2;
		while (i <= 9) {
			System.out.printf("I=%d J=%d\n", i, j);
			if (count != 0) {
				j -= 1;
				count--;
			} else {
				i += 2;
				j += 4;
				count = 2;
			}
		}
	}
}
