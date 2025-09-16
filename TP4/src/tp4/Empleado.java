package tp4;

public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;

    private static int totalEmpleados = 0;
    private static int nextId = 1;

    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
        if (id >= nextId) nextId = id + 1;
    }

    public Empleado(String nombre, String puesto) {
        this.id = nextId++;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 0.0;
        totalEmpleados++;
    }

    public void actualizarSalarioPorcentaje(double porcentaje) {
        this.salario += this.salario * (porcentaje / 100.0);
    }

    public void actualizarSalario(double monto) {
        this.salario += monto;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getPuesto() { return puesto; }
    public void setPuesto(String puesto) { this.puesto = puesto; }
    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }

    public static int mostrarTotalEmpleados() {
    return totalEmpleados;
}
@Override
public String toString() {
    return "Empleado { " +
           "id=" + id +
           ", nombre='" + nombre + '\'' +
           ", puesto='" + puesto + '\'' +
           ", salario=" + salario +
           " }";
}
}
