/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author andrecamppos
 */

@Entity
public class FormaPagto implements Serializable {
    
    public static final String NMFORMAPAGTO_VISA = "VISA";
    public static final String NMFORMAPAGTO_MASTER = "MASTER";
    public static final String NMFORMAPAGTO_VR = "VR";
    public static final String NMFORMAPAGTO_FICHA = "FICHA";
    
    public static final String FL_DEBITO = "D";
    public static final String FL_CREDITO = "C";
    
    @Id
    private Integer cdFormaPagto;
    private String nmFormaPagto;
    private String flDebitoCredito;

    /**
     * @return the cdFormaPagto
     */
    public Integer getCdFormaPagto() {
        return cdFormaPagto;
    }

    /**
     * @param cdFormaPagto the cdFormaPagto to set
     */
    public void setCdFormaPagto(Integer cdFormaPagto) {
        this.cdFormaPagto = cdFormaPagto;
    }

    /**
     * @return the nmFormaPagto
     */
    public String getNmFormaPagto() {
        return nmFormaPagto;
    }

    /**
     * @param nmFormaPagto the nmFormaPagto to set
     */
    public void setNmFormaPagto(String nmFormaPagto) {
        this.nmFormaPagto = nmFormaPagto;
    }

    /**
     * @return the flDebitoCredito
     */
    public String getFlDebitoCredito() {
        return flDebitoCredito;
    }

    /**
     * @param flDebitoCredito the flDebitoCredito to set
     */
    public void setFlDebitoCredito(String flDebitoCredito) {
        this.flDebitoCredito = flDebitoCredito;
    }
        
}
