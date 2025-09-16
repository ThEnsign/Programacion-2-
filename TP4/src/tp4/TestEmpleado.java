package tp4;

public class TestEmpleado {
    public static void main(String[] args) {
        Empleado e1 = new Empleado(100, "Ana Gomez", "Desarrolladora", 850000);
        Empleado e2 = new Empleado("Luis Perez", "QA");
        Empleado e3 = new Empleado("Carla Diaz", "Soporte");

        e2.actualizarSalario(500000);
        e2.actualizarSalarioPorcentaje(10);
        e3.setSalario(400000);
        e3.actualizarSalarioPorcentaje(5);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        System.out.println("Total empleados: " + Empleado.mostrarTotalEmpleados());
    }
}
