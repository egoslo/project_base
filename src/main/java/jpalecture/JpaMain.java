package jpalecture;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * JpaMain class
 *
 * @author egox
 * @version 1.0
 * @since 2020-10-18
 */
public class JpaMain {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

		EntityManager em = emf.createEntityManager();

		EntityTransaction tx = em.getTransaction();

		tx.begin();

		try {

			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		} finally {
			emf.close();
		}
	}
}
