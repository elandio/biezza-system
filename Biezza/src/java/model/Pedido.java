/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author andrecamppos
 */

@Entity
public class Pedido implements Serializable {
    
    public static final String NMPERIODO_MANHA = "Manha";
    public static final String NMPERIODO_TARDE = "Tarde";
    
    public static final String TPSTATUS_ABERTO = "Em Aberto";
    public static final String TPSTATUS_ENCERRADO = "Encerrado";
    
    @Id
    @GeneratedValue
    private Integer cdPedido;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtPedido;
    private String nmPeriodo;
    private String tpStatus;
    
    @OneToMany(mappedBy = "pedido")
    private List<Solicitacao> solicitacaoList;

    /**
     * @return the cdPedido
     */
    public Integer getCdPedido() {
        return cdPedido;
    }

    /**
     * @param cdPedido the cdPedido to set
     */
    public void setCdPedido(Integer cdPedido) {
        this.cdPedido = cdPedido;
    }

    /**
     * @return the dtPedido
     */
    public Date getDtPedido() {
        return dtPedido;
    }

    /**
     * @param dtPedido the dtPedido to set
     */
    public void setDtPedido(Date dtPedido) {
        this.dtPedido = dtPedido;
    }

    /**
     * @return the nmPeriodo
     */
    public String getNmPeriodo() {
        return nmPeriodo;
    }

    /**
     * @param nmPeriodo the nmPeriodo to set
     */
    public void setNmPeriodo(String nmPeriodo) {
        this.nmPeriodo = nmPeriodo;
    }

    /**
     * @return the tpStatus
     */
    public String getTpStatus() {
        return tpStatus;
    }

    /**
     * @param tpStatus the tpStatus to set
     */
    public void setTpStatus(String tpStatus) {
        this.tpStatus = tpStatus;
    }

    /**
     * @return the solicitacaoList
     */
    public List<Solicitacao> getSolicitacaoList() {
        return solicitacaoList;
    }

    /**
     * @param solicitacaoList the solicitacaoList to set
     */
    public void setSolicitacaoList(List<Solicitacao> solicitacaoList) {
        this.solicitacaoList = solicitacaoList;
    }
        
}
