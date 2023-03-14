package org.bguerra.ejemplos.set;

import org.bguerra.ejemplos.modelo.Alumno;

import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSetComparable {
    public static void main(String[] args) {
        Set<Alumno> sa = new TreeSet<>((a, b) -> a.getNombre().compareTo(b.getNombre()));
        sa.add(new Alumno("Pato", 5));
        sa.add(new Alumno("Cata", 6));
        sa.add(new Alumno("Luci", 4));
        sa.add(new Alumno("Jano", 7));
        sa.add(new Alumno("Brian", 10));
        sa.add(new Alumno("Zeus", 2));
        sa.add(new Alumno("Lucas", 2));

        System.out.println(sa);
    }
}
