package ej02_mayor_de_tres;

// Programa: Mayor de tres numeros
import java.util.Scanner;

public class Ej02MayorDeTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        int a = sc.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int b = sc.nextInt();
        System.out.print("Ingrese el tercer numero: ");
        int c = sc.nextInt();

        int mayor = a;
        if (b > mayor) mayor = b;
        if (c > mayor) mayor = c;

        System.out.println("El mayor es: " + mayor);
        sc.close();
    }
}
