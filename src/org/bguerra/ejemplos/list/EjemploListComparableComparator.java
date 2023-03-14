package org.bguerra.ejemplos.list;

import org.bguerra.ejemplos.modelo.Alumno;

import java.util.*;

import static java.util.Comparator.comparing;

public class EjemploListComparableComparator {
    public static void main(String[] args) {

        List<Alumno> sa = new ArrayList<>();
        sa.add(new Alumno("Pato", 5));
        sa.add(new Alumno("Cata", 6));
        sa.add(new Alumno("Luci", 4));
        sa.add(new Alumno("Jano", 7));
        sa.add(new Alumno("Brian", 10));
        sa.add(new Alumno("Zeus", 2));
        sa.add(new Alumno("Zeus", 2));
        Alumno z = new Alumno("Lucas", 3);
        sa.add(z);
        sa.add(z);
        System.out.println("======");
        //Collections.sort(sa,(a,b)->a.getNombre().compareTo(b.getNombre()));
        //sa.sort((a, b) -> a.getNombre().compareTo(b.getNombre()));
        sa.sort(comparing((Alumno::getNombre)));
        System.out.println(sa);
        System.out.println("======");
        sa.sort(comparing((Alumno::getNombre)).reversed());
        System.out.println(sa);

        System.out.println("Iterando usando Stream forEach");
        sa.forEach(System.out::println);
    }
}
