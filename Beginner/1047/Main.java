import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        
        String inputValue = scanner.nextLine();
        String[] values = inputValue.split(" ");
        int initHour = Integer.parseInt(values[0]);
        int initMin = Integer.parseInt(values[1]);
        int fimHour = Integer.parseInt(values[2]);
        int fimMin = Integer.parseInt(values[3]);

        int horas = 0;
        int minutos = 0;

		if (fimHour > initHour) {
			horas = fimHour - initHour;
		} else if (initHour > fimHour) {
			horas = 24 - initHour + fimHour;
		} else {
			horas = 24;
		}

        if (initMin > fimMin) {
            minutos = fimMin - initMin;
        } else {
            minutos = 60 - initMin + fimMin;
        }

        if (minutos >= 60) {
            minutos -= 60;
        } else if (minutos < 0) {
            horas--;
            minutos += 60;
        }

        if (horas >= 24 && minutos > 0) {
            horas -= 24;
        }
        
        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", horas, minutos);
    }
    
}

