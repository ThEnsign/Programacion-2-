package ej06_contador_signos_for;

// Programa: Contador de positivos, negativos y ceros (10 numeros)
import java.util.Scanner;

public class Ej06ContadorSignosFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pos = 0, neg = 0, cer = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el numero " + i + ": ");
            int n = sc.nextInt();
            if (n > 0) pos++;
            else if (n < 0) neg++;
            else cer++;
        }
        System.out.println("Positivos: " + pos);
        System.out.println("Negativos: " + neg);
        System.out.println("Ceros: " + cer);
        sc.close();
    }
}
