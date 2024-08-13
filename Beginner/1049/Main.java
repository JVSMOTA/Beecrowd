import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String primeiraPalavra = scanner.nextLine();
        String segundaPalavra = scanner.nextLine();
        String terceiraPalavra = scanner.nextLine();

        String animal = "";

        if (primeiraPalavra.equals("vertebrado")) {
            if (segundaPalavra.equals("ave")) {
                if (terceiraPalavra.equals("carnivoro")) {
                    animal = "aguia";
                } else {
                    animal = "pomba";
                }
            } else {
                if (terceiraPalavra.equals("onivoro")) {
                    animal = "homem";
                } else {
                    animal = "vaca";
                }
            }
        } else {
            if (segundaPalavra.equals("inseto")) {
                if (terceiraPalavra.equals("hematofago")) {
                    animal = "pulga";
                } else {
                    animal = "lagarta";
                }
            } else {
                if (terceiraPalavra.equals("hematofago")) {
                    animal = "sanguessuga";
                } else {
                    animal = "minhoca";
                }
            }
        }

        System.out.println(animal);
    }
}

