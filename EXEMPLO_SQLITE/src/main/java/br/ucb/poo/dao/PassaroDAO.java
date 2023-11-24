package br.ucb.poo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import br.ucb.poo.model.Passaro;

public class PassaroDAO implements AutoCloseable {

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

    public void salvarPassaro(Passaro passaro){
        Transaction transaction = null;

        try { 
            Session session = sessionFactory.openSession() ;
            transaction = session.beginTransaction();
            session.save(passaro);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
    
    public Passaro getPassaroById(Integer id) {
        Passaro passaro = null;
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            passaro = session.get(Passaro.class, id);
            transaction.commit();
        } catch (Exception e) {
            // Tratar exceções de forma mais controlada, lançar uma exceção personalizada ou logar o erro
            e.printStackTrace();
        }
        return passaro;
    }
    
    
    public void atualizarPassaro(Passaro passaro) {
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            session.update(passaro);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
    
    public void deletarPassaro(Passaro passaro) {
        Transaction transaction = null;
        try {
            Session session = sessionFactory.openSession(); 
            transaction = session.beginTransaction();
            session.delete(passaro);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } 
    }
    
}
