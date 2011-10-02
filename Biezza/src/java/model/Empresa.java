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
public class Empresa implements Serializable {
        
    @Id
    private Integer cdEmpresa;
    private String nmEmpresa;
    private String nuTelefone;
   
    /**
     * @return the ncdEmpresa
     */
    public Integer getCdEmpresa() {
        return cdEmpresa;
    }

    /**
     * @param cdEmpresa the cdEmpresa to set
     */
    public void setCdEmpresa(Integer cdEmpresa) {
        this.cdEmpresa = cdEmpresa;
    }

    /**
     * @return the nmEmpresa
     */
    public String getNmEmpresa() {
        return nmEmpresa;
    }

    /**
     * @param nmEmpresa the nmEmpresa to set
     */
    public void setNmEmpresa(String nmEmpresa) {
        this.nmEmpresa = nmEmpresa;
    }

    /**
     * @return the nuTelefone
     */
    public String getNuTelefone() {
        return nuTelefone;
    }

    /**
     * @param nuTelefone the nuTelefone to set
     */
    public void setNuTelefone(String nuTelefone) {
        this.nuTelefone = nuTelefone;
    }
        
}
