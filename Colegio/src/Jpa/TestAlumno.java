package Jpa;

import Colegio.Alumno;

public class TestAlumno {

    public static void main(String[] args) {

        AlumnoDao adao = new AlumnoDaoImpl();

        Alumno alumno1 =
                new Alumno(1, "Ana");

        adao.insertarAlumno(alumno1);

        System.out.println("LISTADO");

        for (Alumno a : adao.buscarTodos()) {
            System.out.println(a);
        }

        System.out.println("BUSCAR ID 1");

        System.out.println(
                adao.buscarPorId(1)
        );
    }
}