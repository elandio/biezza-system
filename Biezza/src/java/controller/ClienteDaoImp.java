/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Cliente;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateUtil;

/**
 *
 * @author andrecamppos
 */
public class ClienteDaoImp implements ClienteDao {

    @Override
    public void save(Cliente cliente) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(cliente);
        t.commit();
    }
        
}
