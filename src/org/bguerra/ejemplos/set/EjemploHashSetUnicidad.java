package org.bguerra.ejemplos.set;

import org.bguerra.ejemplos.modelo.Alumno;

import java.util.*;
;

public class EjemploHashSetUnicidad {
    public static void main(String[] args) {
        Set<Alumno> sa = new HashSet<>();
        //List<Alumno> sa = new ArrayList<>();
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
        System.out.println(sa);

        /*System.out.println("Utilizando un for clasico");
        for (int i = 0; i < sa.size(); i++) {
            Alumno a = sa.get(i);
            System.out.println(a.getNombre());
        }*/

        System.out.println("Iterando usando un foreach");
        for (Alumno a : sa) {
            System.out.println(a.getNombre());
        }
        System.out.println("Iterando usando while e iterator");

        Iterator<Alumno> it = sa.iterator();
        while (it.hasNext()) {
            Alumno a = it.next();
            System.out.println(a.getNombre());
        }

        System.out.println("Iterando usando Stream forEach");
        sa.forEach(System.out::println);
    }
}
