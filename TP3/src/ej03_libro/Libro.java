package ej03_libro;

public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        setAnioPublicacion(anioPublicacion);
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getAnioPublicacion() { return anioPublicacion; }

    public void setAnioPublicacion(int anio) {
        int current = 2025;
        if (anio >= 0 && anio <= current) {
            this.anioPublicacion = anio;
        } else {
            System.out.println("Año inválido, se mantiene el valor actual (" + this.anioPublicacion + ")");
        }
    }

    @Override
    public String toString() {
        return "Libro: '" + titulo + "' de " + autor + " (" + anioPublicacion + ")";
    }

    public static void main(String[] args) {
        Libro l = new Libro("El principito", "Antoine de Saint-Exupéry", 1943);
        System.out.println(l);
        l.setAnioPublicacion(3000); // inválido
        l.setAnioPublicacion(2000); // válido
        System.out.println(l);
    }
}
