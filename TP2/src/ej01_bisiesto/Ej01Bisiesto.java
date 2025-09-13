package ej01_bisiesto;

// Programa: Verificacion de anio bisiesto
// Regla: divisible por 4 y no por 100, salvo que sea divisible por 400
import java.util.Scanner;

public class Ej01Bisiesto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un anio: ");
        int anio = sc.nextInt();

        boolean bisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);

        if (bisiesto) {
            System.out.println("El anio " + anio + " es bisiesto.");
        } else {
            System.out.println("El anio " + anio + " no es bisiesto.");
        }
        sc.close();
    }
}
