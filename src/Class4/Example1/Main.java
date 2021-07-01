package Class4.Example1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Prenda> prendas = new ArrayList<>();
        prendas.add( new Prenda("Armani","Polera"));
        prendas.add(new Prenda("Hola","hola2"));
        prendas.add(new Prenda("Puma","Pantalon"));
        prendas.add(new Prenda("Adidas","Pantalon"));
        List<Prenda> prendas2 = new ArrayList<>();
        prendas2.add(new Prenda("Nose","Formal"));
        List<Prenda> prendas3 = new ArrayList<>();
        prendas3.add(new Prenda("Holamundo","holaaa"));

        GuardaRopa guardaRopa = new GuardaRopa();
        int id1 = guardaRopa.guardarPrendas(prendas);
        int id2 = guardaRopa.guardarPrendas(prendas2);
        int id3 = guardaRopa.guardarPrendas(prendas3);
        System.out.println("id primeras prendas "+id1);
        System.out.println("id segundas prendas "+id2);
        System.out.println("id terceras prendas "+id3);
        guardaRopa.mostrarPrenda();
        List<Prenda> consultaPrendas = guardaRopa.devolverPrenda(0);
        System.out.println("Consultando prendas");
        for (Prenda p:consultaPrendas) {

            System.out.println(p.toString());
        }

    }
}
