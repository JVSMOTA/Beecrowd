import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[] par = new int[5];
        int[] impar = new int[5];
        int countPar = 0, countImpar = 0;

        for (int i = 0; i < 15; i++) {
            int valor = sc.nextInt();

            if (valor % 2 == 0) {
                par[countPar] = valor;
                countPar++;
                if (countPar == 5) {
                    imprimirVetor("par", par, countPar);
                    countPar = 0;
                }
            } else {
                impar[countImpar] = valor;
                countImpar++;
                if (countImpar == 5) {
                    imprimirVetor("impar", impar, countImpar);
                    countImpar = 0;
                }
            }
        }

        imprimirVetor("impar", impar, countImpar);
        imprimirVetor("par", par, countPar);

        sc.close();
    }

    public static void imprimirVetor(String nome, int[] vetor, int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            System.out.printf("%s[%d] = %d\n", nome, i, vetor[i]);
        }
    }

}
