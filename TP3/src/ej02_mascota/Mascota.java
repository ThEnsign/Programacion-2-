package ej02_mascota;

public class Mascota {
    public String nombre;
    public String especie;
    public int edad;

    public Mascota() {}

    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = Math.max(0, edad);
    }

    public void mostrarInfo() {
        System.out.println("Mascota: " + nombre + " (" + especie + "), edad: " + edad + " años");
    }

    public void cumplirAnios() {
        edad++;
    }

    public static void main(String[] args) {
        Mascota m = new Mascota("Mora", "Perro", 3);
        m.mostrarInfo();
        m.cumplirAnios();
        m.mostrarInfo();
    }
}
