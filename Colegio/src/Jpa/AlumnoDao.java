package Jpa;


import java.util.List;

import Colegio.Alumno;

public interface AlumnoDao {

    int insertarAlumno(Alumno alumno);

    Alumno buscarPorId(int id);

    List<Alumno> buscarTodos();

    int modificarAlumno(Alumno alumno);

    int eliminarAlumno(int id);
}
