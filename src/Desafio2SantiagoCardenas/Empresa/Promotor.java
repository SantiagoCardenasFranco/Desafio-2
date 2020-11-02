package Desafio2SantiagoCardenas.Empresa;

public class Promotor extends Empleado {
    private int volantesRepartidos;
    private long valorVolante;
    private int comprasVolantes;

    public Promotor(String nombre, int volantesRepartidos, long valorVolante, int comprasVolantes) {
        super(nombre);
        this.volantesRepartidos = volantesRepartidos;
        this.valorVolante = valorVolante;
        this.comprasVolantes = comprasVolantes;
    }

    public int getVolantesRepartidos() {
        return volantesRepartidos;
    }

    public void setVolantesRepartidos(int volantesRepartidos) {
        this.volantesRepartidos = volantesRepartidos;
    }

    public long getValorVolante() {
        return valorVolante;
    }

    public void setValorVolante(long valorVolante) {
        this.valorVolante = valorVolante;
    }

    public int getComprasVolantes() {
        return comprasVolantes;
    }

    public void setComprasVolantes(int comprasVolantes) {
        this.comprasVolantes = comprasVolantes;
    }

    @Override
    public long calcularSalario() {
        return (getValorVolante() * getVolantesRepartidos()) + (15000 * getComprasVolantes());
    }
}
