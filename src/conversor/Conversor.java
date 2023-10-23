package conversor;

import java.util.Scanner;
import java.util.Locale;

public class Conversor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner input = new Scanner(System.in);

        System.out.println("Número para conversão para binário:");
        int numero = input.nextInt();
        String binario = "";

        while (numero != 0) {
            int resto = numero % 2;
            binario = resto + binario;
            numero /= 2;
        }

        System.out.println("Em binário: " + binario);

        input.close();
    }
}
