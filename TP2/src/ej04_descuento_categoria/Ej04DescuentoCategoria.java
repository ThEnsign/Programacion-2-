package ej04_descuento_categoria;

// Programa: Calculadora de descuento segun categoria (A,B,C)
import java.util.Scanner;

public class Ej04DescuentoCategoria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();
        System.out.print("Ingrese la categoria del producto (A, B o C): ");
        String cat = sc.next().trim().toUpperCase();

        double porcentaje;
        switch (cat) {
            case "A": porcentaje = 0.10; break;
            case "B": porcentaje = 0.15; break;
            case "C": porcentaje = 0.20; break;
            default: 
                System.out.println("Categoria invalida");
                sc.close();
                return;
        }
        double descuento = precio * porcentaje;
        double finalP = precio - descuento;
        System.out.println("Descuento aplicado: " + (int)(porcentaje*100) + "%");
        System.out.println("Precio final: " + finalP);
        sc.close();
    }
}
