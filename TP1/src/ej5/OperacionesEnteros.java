package ej5;

import java.util.Scanner;

public class OperacionesEnteros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa primer entero: ");
        int a = sc.nextInt();
        System.out.print("Ingresa segundo entero: ");
        int b = sc.nextInt();

        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicacion: " + (a * b));

        if (b != 0) {
            System.out.println("Division: " + (a / b));
        } else {
            System.out.println("Division: no se puede dividir por cero");
        }
        sc.close();
    }
}
