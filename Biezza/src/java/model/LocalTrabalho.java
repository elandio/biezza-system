/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author andrecamppos
 */

@Entity
public class LocalTrabalho implements Serializable {
    
    public static final String NMSETOR_DESENVOLVIMENTO = "Desenvolvimento";
    public static final String NMSETOR_SUPORTE = "Suporte";
    public static final String NMSETOR_COMERCIAL = "Comercial";
    public static final String NMSETOR_CONSULTORA = "Consultoria";
    public static final String NMSETOR_APOIO = "Apoio";
    
    @Id
    private Integer cdLocalTrabalho;
    private String nmSetor;
    
    @OneToOne
    private Empresa empresa;

    /**
     * @return the cdLocalTrabalho
     */
    public Integer getCdLocalTrabalho() {
        return cdLocalTrabalho;
    }

    /**
     * @param cdLocalTrabalho the cdLocalTrabalho to set
     */
    public void setCdLocalTrabalho(Integer cdLocalTrabalho) {
        this.cdLocalTrabalho = cdLocalTrabalho;
    }

    /**
     * @return the nmSetor
     */
    public String getNmSetor() {
        return nmSetor;
    }

    /**
     * @param nmSetor the nmSetor to set
     */
    public void setNmSetor(String nmSetor) {
        this.nmSetor = nmSetor;
    }

    /**
     * @return the empresa
     */
    public Empresa getEmpresa() {
        return empresa;
    }

    /**
     * @param empresa the empresa to set
     */
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
        
}
