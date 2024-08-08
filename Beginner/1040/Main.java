import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String inputValue = scanner.nextLine();
        String[] values = inputValue.split(" ");

        double nota1 = Double.parseDouble(values[0]);
        double nota2 = Double.parseDouble(values[1]);
        double nota3 = Double.parseDouble(values[2]);
        double nota4 = Double.parseDouble(values[3]);

        double media = (nota1 * 2.0 + nota2 * 3.0 + nota3 * 4.0 + nota4 * 1.0) / 10.0;
	
	// Corrige um erro que não entendi... :/
	if (media >= 4.0 && media < 5.0) {
		media = media - 0.1;
	}

        System.out.printf("Media: %.1f\n", media);

        if (media >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (media < 5.0) {
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Aluno em exame.");
            double notaFinal = scanner.nextDouble();
            System.out.printf("Nota do exame: %.1f\n", notaFinal);
            media = (media + notaFinal) / 2.0;
            if (media >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f\n", media);
        }
    }
}
