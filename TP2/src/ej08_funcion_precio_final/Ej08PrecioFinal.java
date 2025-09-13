package ej08_funcion_precio_final;

// Funciones: calcular precio final con impuesto y descuento
import java.util.Scanner;

public class Ej08PrecioFinal {
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        double imp = precioBase * (impuesto / 100.0);
        double desc = precioBase * (descuento / 100.0);
        return precioBase + imp - desc;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el precio base del producto: ");
        double base = sc.nextDouble();
        System.out.print("Ingrese el impuesto en porcentaje (ej 10): ");
        double imp = sc.nextDouble();
        System.out.print("Ingrese el descuento en porcentaje (ej 5): ");
        double desc = sc.nextDouble();
        double total = calcularPrecioFinal(base, imp, desc);
        System.out.println("El precio final del producto es: " + total);
        sc.close();
    }
}
