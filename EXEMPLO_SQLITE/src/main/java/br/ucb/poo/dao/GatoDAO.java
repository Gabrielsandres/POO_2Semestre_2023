package br.ucb.poo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import br.ucb.poo.model.Gato;

public class GatoDAO implements AutoCloseable {

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
        // Mantenha a SessionFactory aberta aqui
    }

    public void salvarGato(Gato gato){
        Transaction transaction = null;

        try { 
            Session session = sessionFactory.openSession() ;
            transaction = session.beginTransaction();
            session.save(gato);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
    
    public Gato getGatoById(Integer id) {
        Gato gato = null;
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            gato = session.get(Gato.class, id);
            transaction.commit();
        } catch (Exception e) {
            // Tratar exceções de forma mais controlada, lançar uma exceção personalizada ou logar o erro
            e.printStackTrace();
        }
        return gato;
    }
    
    
    public void atualizarGato(Gato gato) {
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            session.update(gato);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
    
    public void deletarGato(Gato gato) {
        Transaction transaction = null;
        try {
            Session session = sessionFactory.openSession(); 
            transaction = session.beginTransaction();
            session.delete(gato);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } 
    }
    
}
