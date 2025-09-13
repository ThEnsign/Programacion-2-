package ej12_array_precios;

// Arrays: modificar un precio y mostrar antes/despues
public class Ej12ArrayPrecios {
    public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        System.out.println("Precios originales:");
        for (double p : precios) {
            System.out.println("Precio: $" + p);
        }

        // modificar el tercer precio (indice 2)
        precios[2] = 129.99;

        System.out.println("Precios modificados:");
        for (double p : precios) {
            System.out.println("Precio: $" + p);
        }
    }
}
