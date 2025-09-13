package ej09_envio_y_total;

// Composicion de funciones: costo de envio y total de compra
import java.util.Scanner;

public class Ej09EnvioYTotal {
    public static double calcularCostoEnvio(double peso, String zona) {
        zona = zona.trim().toLowerCase();
        double tarifa = zona.equals("internacional") ? 10.0 : 5.0;
        return tarifa * peso;
    }
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();
        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = sc.nextDouble();
        System.out.print("Ingrese la zona de envio (Nacional/Internacional): ");
        String zona = sc.next();
        double envio = calcularCostoEnvio(peso, zona);
        double total = calcularTotalCompra(precio, envio);
        System.out.println("El costo de envio es: " + envio);
        System.out.println("El total a pagar es: " + total);
        sc.close();
    }
}
