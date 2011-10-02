/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Solicitacao;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateUtil;

/**
 *
 * @author andrecamppos
 */
public class SolicitacaoDaoImp implements SolicitacaoDao {
    
    @Override
    public void save(Solicitacao solicitacao) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(solicitacao);
        t.commit();
    }

    @Override
    public Solicitacao getSolicitacao(Integer nuSolicitacao) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return (Solicitacao) session.load(Solicitacao.class, nuSolicitacao);
    }

    @Override
    public List<Solicitacao> solicitacaoList() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        List list = session.createQuery("from Solicitacao").list();
        t.commit();
        return list;
    }

    @Override
    public void remove(Solicitacao solicitacao) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.delete(solicitacao);
        t.commit();
    }

    @Override
    public void update(Solicitacao solicitacao) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.update(solicitacao);
        t.commit();
    }
    
}
