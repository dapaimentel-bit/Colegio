package Jpa;

import Colegio.Alumno;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public abstract class AbstractDaoImpl {
	
	protected EntityManagerFactory emf;
	protected EntityManager em;
	protected EntityTransaction tx;
	protected Query query;
	protected String jpql;
	protected int filas;
	
	public AbstractDaoImpl() {
		emf = Persistence.createEntityManagerFactory("Colegio");
	    em = emf.createEntityManager();
	    tx = em.getTransaction();
	}

	public int insertarAlumno1(Alumno alumno) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int modificarAlumno1(Alumno alumno) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
