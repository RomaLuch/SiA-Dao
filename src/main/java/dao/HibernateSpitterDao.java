/*
package dao;

import model.Spitter;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

*/
/**
 * Created by ���� on 04.07.2017.
 *//*


@Repository("hiber")
@Transactional
public class HibernateSpitterDao implements Rep {
    private SessionFactory sessionFactory;
    @Autowired
    public HibernateSpitterDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory; // ������������ DAO
    }
    private Session currentSession() { // ��������� �������
        return sessionFactory.getCurrentSession(); // ����� �� �������
    } // SessionFactory
    public void addSpitter(Spitter spitter) {
        currentSession().save(spitter); // ���������� ������� �����
    }
    public Spitter getSpitterById(long id) { // ���������� ������� �����
        return (Spitter) currentSession().get(Spitter.class, id);
    }
    public void saveSpitter(Spitter spitter) {
        currentSession().update(spitter); // ���������� ������� �����
    }

}*/
