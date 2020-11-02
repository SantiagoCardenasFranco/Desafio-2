package Desafio2SantiagoCardenas.Empresa;

public class Freelance extends Empleado{
    private long valorHora;
    private int  horasTrabajadas;

    public Freelance(String nombre, long valorHora, int horasTrabajadas) {
        super(nombre);
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public long getValorHora() {
        return valorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setValorHora(long valorHora) {
        this.valorHora = valorHora;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public long calcularSalario() {
        return  this.getValorHora() * this.getHorasTrabajadas();
    }
}
