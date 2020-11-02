package Desafio2SantiagoCardenas.Empresa;

public class Vendedor extends Directo{
    private long ventasDelMes;

    public Vendedor(String nombre, long salario, long ventasDelMes) {
        super(nombre, salario);
        this.ventasDelMes = ventasDelMes;
    }

    public long getVentasDelMes() {
        return ventasDelMes;
    }

    public void setVentasDelMes(long ventasDelMes) {
        this.ventasDelMes = ventasDelMes;
    }

    @Override
    public long calcularPension() {
        return super.calcularPension();
    }

    @Override
    public long calcularSalud() {
        return super.calcularSalud();
    }

    public long calcularComision()
    {
        long ventasDelMes = this.getVentasDelMes();
        long operacion = 0;
        if(getSalario() < 999999)
        {
            operacion = (ventasDelMes * 4) / 100;//Es una regla de tres y los porcentajes se trabajan igual
                                                 //que en la clase directo;
        }
        else if (getSalario() >= 1000000)
        {
            operacion = (long) ((ventasDelMes * 3.5) / 100);//Es una regla de tres y los porcentajes se trabajan igual
                                                            //que en la clase directo;
        }
        return operacion;
    }

    @Override
    public long calcularSalario() {
        return getSalario() + calcularComision() - calcularPension() - calcularSalud();
    }
}
