package Jpa;


import java.util.List;

import Colegio.Alumno;

public class AlumnoDaoImpl extends AbstractDaoImpl
                            implements AlumnoDao {

    @Override
    public int insertarAlumno1(Alumno alumno) {

        try {
            tx.begin();
            em.persist(alumno);
            tx.commit();
            return 1;

        } catch (Exception e) {
            return 0;
        }
    }

    @Override
    public Alumno buscarPorId(int id) {

        return em.find(Alumno.class, id);
    }

    @Override
    public List<Alumno> buscarTodos() {

        jpql = "from Alumno a";

        query = em.createQuery(jpql);

        return query.getResultList();
    }

    @Override
    public int modificarAlumno(Alumno alumno) {

        try {

            tx.begin();
            em.merge(alumno);
            tx.commit();

            return 1;

        } catch (Exception e) {

            return 0;
        }
    }

    @Override
    public int eliminarAlumno(int id) {

        Alumno alumno = buscarPorId(id);

        if (alumno != null) {

            try {

                tx.begin();
                em.remove(alumno);
                tx.commit();

                return 1;

            } catch (Exception e) {

                return 0;
            }
        }

        return 0;
    }

	@Override
	public int insertarAlumno(Alumno alumno) {
		return 0;
	}

	@Override
	public int modificarAlumno1(Alumno alumno) {
		return 0;
	}
}