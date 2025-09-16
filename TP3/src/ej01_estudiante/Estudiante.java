package ej01_estudiante;

public class Estudiante {
    public String nombre;
    public String apellido;
    public String curso;
    public double calificacion; // 0 a 10

    public Estudiante() {}

    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = Math.max(0, Math.min(10, calificacion));
    }

    public void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + " " + apellido + " | Curso: " + curso + " | Calificación: " + calificacion);
    }

    public void subirCalificacion(double puntos) {
        calificacion = Math.min(10, calificacion + Math.max(0, puntos));
    }

    public void bajarCalificacion(double puntos) {
        calificacion = Math.max(0, calificacion - Math.max(0, puntos));
    }

    public static void main(String[] args) {
        Estudiante e = new Estudiante("Thiago", "Fernandez", "Programación II", 7.5);
        e.mostrarInfo();
        e.subirCalificacion(1.0);
        e.bajarCalificacion(0.75);
        e.mostrarInfo();
    }
}
