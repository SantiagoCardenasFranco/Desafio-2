package Desafio2SantiagoCardenas.Empresa;

public class Directo extends Empleado {
    public static final int porcentaje1 = 5; //Cabe recalcar que que es 5%, pero lo multiplique por 100
    public static final double porcentaje2 = 6.5; //Cabe recalcar que que es 6.5%, pero lo multiplique por 100
    public static final int porcentaje3 = 100; //Cabe recalcar que que es 100%, pero lo multiplique por 100
    private long salario;

    public Directo(String nombre, long salario) {
        super(nombre);
        this.salario = salario;
    }

    public long getSalario() {
        return salario;
    }

    public void setSalario(long salario) {
        this.salario = salario;
    }

    public long calcularSalud()
    {
        long operacion;
        operacion = (getSalario() * porcentaje1) / porcentaje3; //regla de tres
        return operacion;
    }

    public long calcularPension()
    {
        long operacion;
        operacion = (long) ((getSalario() * porcentaje2) / porcentaje3); //regla de tres
        return operacion;
    }

    @Override
    public long calcularSalario() {
        return getSalario() - calcularPension() - calcularSalud();
    }
}
