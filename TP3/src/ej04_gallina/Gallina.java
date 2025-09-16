package ej04_gallina;

public class Gallina {
    public String idGallina;
    public int edad;           // en semanas o meses según consigna
    public int huevosPuestos;

    public Gallina(String idGallina, int edad) {
        this.idGallina = idGallina;
        this.edad = Math.max(0, edad);
        this.huevosPuestos = 0;
    }

    public void ponerHuevo() {
        huevosPuestos++;
        System.out.println("La gallina " + idGallina + " puso un huevo. Total: " + huevosPuestos);
    }

    public void envejecer() {
        edad++;
        System.out.println("La gallina " + idGallina + " ahora tiene edad: " + edad);
    }

    public void mostrarEstado() {
        System.out.println("Gallina " + idGallina + " | edad: " + edad + " | huevos puestos: " + huevosPuestos);
    }

    public static void main(String[] args) {
        Gallina g = new Gallina("G-101", 12);
        g.mostrarEstado();
        g.ponerHuevo();
        g.envejecer();
        g.mostrarEstado();
    }
}
