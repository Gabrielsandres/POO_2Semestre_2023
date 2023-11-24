package br.ucb.poo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import br.ucb.poo.model.Cachorro;

public class CachorroDAO implements AutoCloseable {

    private static final SessionFactory sessionFactory;

    static {
        try {
            // Configurando a sessão do Hibernate a partir do arquivo hibernate.cfg.xml
            Configuration configuration = new Configuration().configure();
            sessionFactory = configuration.buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public void close() {
        if (sessionFactory != null) {
            sessionFactory.close();
        }
    }

    public void salvarCachorro(Cachorro cachorro) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(cachorro);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Cachorro getCachorroById(Integer id) {
        Cachorro cachorro = null;
        try (Session session = sessionFactory.openSession()) {
            cachorro = session.get(Cachorro.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cachorro;
    }
    

    public void atualizarCachorro(Cachorro cachorro) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.update(cachorro);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deletarCachorro(Cachorro cachorro) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.delete(cachorro);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
