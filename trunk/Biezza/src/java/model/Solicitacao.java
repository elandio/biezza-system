/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author andrecamppos
 */

@Entity
public class Solicitacao implements Serializable {
        
    @Id
    private Integer nuSolicitacao;
    private String deSolicitacao;
        
    @OneToOne
    private Cliente cliente;
    @OneToOne
    private FormaPagto formaPagto;
    @ManyToOne
    private Pedido pedido;

    /**
     * @return the nuSolicitacao
     */
    public Integer getNuSolicitacao() {
        return nuSolicitacao;
    }

    /**
     * @param nuSolicitacao the nuSolicitacao to set
     */
    public void setNuSolicitacao(Integer nuSolicitacao) {
        this.nuSolicitacao = nuSolicitacao;
    }
    
    /**
     * @return the deSolicitacao
     */
    public String getDeSolicitacao() {
        return deSolicitacao;
    }

    /**
     * @param deSolicitacao the deSolicitacao to set
     */
    public void setDeSolicitacao(String deSolicitacao) {
        this.deSolicitacao = deSolicitacao;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the formaPagto
     */
    public FormaPagto getFormaPagto() {
        return formaPagto;
    }

    /**
     * @param formaPagto the formaPagto to set
     */
    public void setFormaPagto(FormaPagto formaPagto) {
        this.formaPagto = formaPagto;
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
