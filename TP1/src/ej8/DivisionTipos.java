package ej8;

import java.util.Scanner;

public class DivisionTipos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa dividendo: ");
        int a = sc.nextInt();
        System.out.print("Ingresa divisor: ");
        int b = sc.nextInt();

        if (b == 0) {
            System.out.println("No se puede dividir por cero");
        } else {
            int divEntera = a / b;                // division entera (trunca)
            double divReal = (double) a / b;      // division real

            System.out.println("Division usando int: " + divEntera);
            System.out.println("Division usando double: " + divReal);
        }
        sc.close();
    }
}
