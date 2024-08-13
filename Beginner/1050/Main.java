import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		
		int ddd = scanner.nextInt();
		String local = "";

		if (ddd == 61) {
			local = "Brasilia";
		} else if (ddd == 71) {
			local = "Salvador";
		} else if (ddd == 11) {
            local = "Sao Paulo";
        } else if (ddd == 21) {
            local = "Rio de Janeiro";
        } else if (ddd == 32) {
            local = "Juiz de Fora";
        } else if (ddd == 19) {
            local = "Campinas";
        } else if (ddd == 27) {
            local = "Vitoria";
		} else if (ddd == 31) {
            local = "Belo Horizonte";
        } else {
			local = "DDD nao cadastrado";
		}
		
		System.out.println(local);
	}

}
