package Desafio2SantiagoCardenas.Empresa;

import java.util.ArrayList;
import java.util.List;

public class Nomina {
    private ArrayList<Empleado> empleados;

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public void calcularNomina(List<Empleado> empleados)
    {
        empleados.forEach(empleado ->
                System.out.println(empleado.getNombre() + " su salario es: " + empleado.calcularSalario()));
    }
    public void listarDirectos(List<Empleado> empleados)
    {
        empleados.forEach(empleado1 -> {
            if (empleado1 instanceof Vendedor ){
                System.out.println(empleado1.getNombre() + " es vendedor");
            }
            else if (empleado1 instanceof Directo){
                System.out.println(empleado1.getNombre() + " es directo");
            }
        });
        //De aquí, los empleados que son vendedores tambien son directos, pues la calse vendedor
        //extiende de la de directo.
    }

    public void listarFreelancers(List<Empleado> empleados)
    {
        empleados.forEach(empleado2 -> {
            if (empleado2 instanceof Freelance){
                System.out.println(empleado2.getNombre() + " es freelance");
            }
            /*else {
                System.out.println("No hay");
            }*/
        });
    }

    public void listarPromotores(List<Empleado> empleados)
    {
        empleados.forEach(empleado3 -> {
            if (empleado3 instanceof Promotor){
                System.out.println(empleado3.getNombre() + " es promotor");
            }
            /*else{
                System.out.println("No hay");
            }*/
        });
    }
}
