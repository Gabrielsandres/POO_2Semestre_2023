package br.ucb.poo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import br.ucb.poo.model.Usuario;

public class UsuarioDAO implements AutoCloseable {
    
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

    public void salvarUsuario(Usuario usuario){
        Transaction transaction = null;

        try { 
            Session session = sessionFactory.openSession() ;
            transaction = session.beginTransaction();
            session.save(usuario);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
    
    public Usuario getUsuarioById(Integer id) {
        Usuario usuario = null;
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            usuario = session.get(Usuario.class, id);
            transaction.commit();
        } catch (Exception e) {
            // Tratar exceções de forma mais controlada, lançar uma exceção personalizada ou logar o erro
            e.printStackTrace();
        }
        return usuario;
    }
    
    public void atualizarUsuario(Usuario usuario) {
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            session.update(usuario);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
    
    public void deletarUsuario(Usuario usuario) {
        Transaction transaction = null;
        try {
            Session session = sessionFactory.openSession(); 
            transaction = session.beginTransaction();
            session.delete(usuario);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } 
    }
}







    
