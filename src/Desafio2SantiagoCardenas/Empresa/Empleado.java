package Desafio2SantiagoCardenas.Empresa;

public abstract class Empleado {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public abstract long calcularSalario();

}
