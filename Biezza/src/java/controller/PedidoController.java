/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.PedidoDaoImp;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import model.Pedido;

/**
 *
 * @author andrecamppos
 */

@ManagedBean
@SessionScoped
public class PedidoController implements Serializable {
    
    private Pedido pedido;
    private DataModel pedidoList;
    
    public DataModel getListarPedidos() {
        List<Pedido> list = new PedidoDaoImp().pedidoList();
        pedidoList = new ListDataModel(list);
        return pedidoList;
    }

    /**
     * @return the pedido
     */
    public Pedido getPedido() {
        return pedido;
    }

    /**
     * @param pedido the pedido to set
     */
    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    
    
}
