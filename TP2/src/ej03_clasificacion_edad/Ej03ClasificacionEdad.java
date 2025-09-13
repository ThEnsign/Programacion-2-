package ej03_clasificacion_edad;

// Programa: Clasificacion de edad
import java.util.Scanner;

public class Ej03ClasificacionEdad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();
        String categoria;
        if (edad < 12) categoria = "Nino";
        else if (edad <= 17) categoria = "Adolescente";
        else if (edad <= 59) categoria = "Adulto";
        else categoria = "Adulto mayor";
        System.out.println("Eres un " + categoria + ".");
        sc.close();
    }
}
