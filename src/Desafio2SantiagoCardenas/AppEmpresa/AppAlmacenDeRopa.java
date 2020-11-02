package Desafio2SantiagoCardenas.AppEmpresa;

import Desafio2SantiagoCardenas.Empresa.*;

import java.util.ArrayList;
import java.util.List;

public class AppAlmacenDeRopa {
    public static void main(String[] args) {
        //Creación de los empleados y de la nomina
        Nomina nomina = new Nomina();
        Directo empleado1 = new Directo("Juan", 4840000);
        Vendedor empleado2 = new Vendedor("Julian", 2050000, 45510000);
        Freelance empleado3 = new Freelance("Johanna", 71000, 89);
        Vendedor empleado4 = new Vendedor("Carolina", 980000,35989000);
        Promotor empleado5 = new Promotor("Pedro", 1200,300,62);
        Directo empleado6 = new Directo("David", 3975000);
        Freelance empleado7 = new Freelance("Gustavo", 42500, 65);

        //Creación de una lista que va a guardar a los empleados
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(empleado1);
        empleados.add(empleado2);
        empleados.add(empleado3);
        empleados.add(empleado4);
        empleados.add(empleado5);
        empleados.add(empleado6);
        empleados.add(empleado7);

        //Operaciones que estan en la clase nomina
        System.out.println("Los directos son: ");
        nomina.listarDirectos(empleados);
        System.out.println("\nLos freelancers son: ");
        nomina.listarFreelancers(empleados);
        System.out.println("\nLos promotores son: ");
        nomina.listarPromotores(empleados);
        System.out.println("\n");
        nomina.calcularNomina(empleados);
        //Las operaciones reciben de parametro los empleados, y de estos empleados.
    }
}
