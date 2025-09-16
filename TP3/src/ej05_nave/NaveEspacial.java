package ej05_nave;

public class NaveEspacial {
    public String nombre;
    public int combustible; // unidades

    public NaveEspacial(String nombre, int combustible) {
        this.nombre = nombre;
        this.combustible = Math.max(0, combustible);
    }

    public boolean despegar() {
        int costo = 50;
        if (combustible >= costo) {
            combustible -= costo;
            System.out.println("Despegue exitoso. Combustible restante: " + combustible);
            return true;
        } else {
            System.out.println("Combustible insuficiente para despegar.");
            return false;
        }
    }

    public boolean avanzar(int distancia) {
        if (distancia <= 0) return false;
        int costo = distancia; // 1 unidad por unidad de distancia
        if (combustible >= costo) {
            combustible -= costo;
            System.out.println("Avanzó " + distancia + " unidades. Combustible: " + combustible);
            return true;
        } else {
            System.out.println("No hay suficiente combustible para avanzar " + distancia + " unidades.");
            return false;
        }
    }

    public void recargarCombustible(int cantidad) {
        if (cantidad > 0) {
            combustible += cantidad;
            System.out.println("Recargado " + cantidad + ". Combustible actual: " + combustible);
        }
    }

    public void mostrarEstado() {
        System.out.println("Nave '" + nombre + "' | Combustible: " + combustible);
    }

    public static void main(String[] args) {
        NaveEspacial n = new NaveEspacial("Orion", 60);
        n.mostrarEstado();
        n.despegar();
        n.avanzar(5);
        n.recargarCombustible(20);
        n.mostrarEstado();
    }
}
