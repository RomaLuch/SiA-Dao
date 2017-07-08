package dao;

import model.Spitter;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Рома on 04.07.2017.
 */
@Repository("jparep")
@Transactional
public class JPARepositoryImpl implements Rep {
    private static final String RECENT_SPITTLES =
            "SELECT s FROM Spittle s";
    private static final String ALL_SPITTERS =
            "SELECT s FROM Spitter s";
    private static final String SPITTER_FOR_USERNAME =
    "SELECT s FROM Spitter s WHERE s.username = :username";
    private static final String SPITTLES_BY_USERNAME =
            "SELECT s FROM Spittle s WHERE s.spitter.username = :username";
    @PersistenceContext
    private EntityManager em; // Для внедрения EntityManager
@Transactional
    public void addSpitter(Spitter spitter) {
        em.persist(spitter); // Использование EntityManager
    }

    @Transactional
    public Spitter getSpitterById(long id) {
        return em.find(Spitter.class, id); // Использование EntityManager
    }
    @Transactional
    public void saveSpitter(Spitter spitter) {
        em.merge(spitter); // Использование EntityManager
    }
}
