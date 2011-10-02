/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Pedido;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateUtil;

/**
 *
 * @author andrecamppos
 */
public class PedidoDaoImp implements PedidoDao {

    @Override
    public List<Pedido> pedidoList() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        List list = session.createQuery("from Pedido").list();
        t.commit();
        return list;
    }
    
}
