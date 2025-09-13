package ej05_suma_pares_while;

// Programa: Suma de numeros pares hasta que el usuario ingrese 0
import java.util.Scanner;

public class Ej05SumaParesWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        while (true) {
            System.out.print("Ingrese un numero (0 para terminar): ");
            int n = sc.nextInt();
            if (n == 0) break;
            if (n % 2 == 0) suma += n;
        }
        System.out.println("La suma de los numeros pares es: " + suma);
        sc.close();
    }
}
