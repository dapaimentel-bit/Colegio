package Colegio;

import java.util.ArrayList;
import java.util.List;

public class MainArrayList {

    public static void main(String[] args) {

        // Crear ArrayList
        List<Alumno> alumnos = new ArrayList<>();

        // Crear 3 alumnos
        Alumno a1 = new Alumno(1, "Ana");
        Alumno a2 = new Alumno(2, "Pedro");
        Alumno a3 = new Alumno(3, "Maria");

        // Añadir al ArrayList
        alumnos.add(a1);
        alumnos.add(a2);
        alumnos.add(a3);

        // Mostrar todos los alumnos
        System.out.println("LISTA DE ALUMNOS");

        for (Alumno a : alumnos) {
            System.out.println(a);
        }

        // Buscar alumno con ID 2
        System.out.println("\nBUSCAR ALUMNO CON ID 2");

        for (Alumno a : alumnos) {
            if (a.getId() == 2) {
                System.out.println(a);
            }
        }

        // Eliminar alumno con ID 2
        for (int i = 0; i < alumnos.size(); i++) {

            if (alumnos.get(i).getId() == 2) {
                alumnos.remove(i);
                break;
            }
        }

        // Mostrar lista actualizada
        System.out.println("\nLISTA ACTUALIZADA");

        for (Alumno a : alumnos) {
            System.out.println(a);
        }
    }
}