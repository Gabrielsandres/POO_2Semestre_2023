package br.ucb.poo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import br.ucb.poo.model.Pessoa;

public class PessoaDAO {
    
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
        sessionFactory.close();
    }

    public void salvarPessoa(Pessoa pessoa){
        Transaction transaction = null;

        try { 
            Session session = sessionFactory.openSession() ;
            transaction = session.beginTransaction();
            session.save(pessoa);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
    
    public Pessoa getPessoaById(Long id) {
        Pessoa p = null;
        try { 
            Session session = sessionFactory.openSession();
            p = session.get(Pessoa.class, id);
        }catch (Exception e){
            e.printStackTrace();
        }
        return p;
    }
    
    public void atualizarPessoa(Pessoa pessoa) {
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            session.update(pessoa);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
    
    public void deletarPessoa(Pessoa pessoa) {
        Transaction transaction = null;
        try {
            Session session = sessionFactory.openSession(); 
            transaction = session.beginTransaction();
            session.delete(pessoa);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } 
    }
    
}






    
