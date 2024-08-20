import java.io.IOException;

public class Main{
	public static void main(String[] args) throws IOException {
		int i = 1;
		int j = 7;
		while (i <= 9) {	
			System.out.printf("I=%d J=%d\n", i, j);
			if ( j == 7 || j == 6) {
				j--;	
			} else {
				j+=2;
				i+=2;
			}
		}
	}
}
