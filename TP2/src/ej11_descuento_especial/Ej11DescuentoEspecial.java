package ej11_descuento_especial;

// Variable global + local: descuento especial 10%
import java.util.Scanner;

public class Ej11DescuentoEspecial {
    static double DESCUENTO_ESPECIAL = 0.10; // global

    public static void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL; // local
        double finalConDesc = precio - descuentoAplicado;
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + finalConDesc);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();
        calcularDescuentoEspecial(precio);
        sc.close();
    }
}
