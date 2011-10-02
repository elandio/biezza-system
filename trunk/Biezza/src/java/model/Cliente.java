/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author andrecamppos
 */

@Entity
public class Cliente implements Serializable {
            
    @Id
    @GeneratedValue
    private Integer cdCliente;
    private String nmCliente;
    private Integer ramal;
    
    @OneToOne
    private LocalTrabalho localTrabalho;
    
    @OneToOne(mappedBy = "cliente")
    private Solicitacao solicitacao;
    
    @OneToOne(mappedBy = "cliente")
    private Usuario usuario;
    
    public Cliente() {};
    
    public Cliente(Integer cdCliente, String nmCliente, Integer ramal) {
        this.cdCliente = cdCliente;
        this.nmCliente = nmCliente;
        this.ramal = ramal;
    }

    /**
     * @return the cdCliente
     */
    public Integer getCdCliente() {
        return cdCliente;
    }

    /**
     * @param cdCliente the cdCliente to set
     */
    public void setCdCliente(Integer cdCliente) {
        this.cdCliente = cdCliente;
    }

    /**
     * @return the nmCliente
     */
    public String getNmCliente() {
        return nmCliente;
    }

    /**
     * @param nmCliente the nmCliente to set
     */
    public void setNmCliente(String nmCliente) {
        this.nmCliente = nmCliente;
    }

    /**
     * @return the ramal
     */
    public Integer getRamal() {
        return ramal;
    }

    /**
     * @param ramal the ramal to set
     */
    public void setRamal(Integer ramal) {
        this.ramal = ramal;
    }

    /**
     * @return the localTrabalho
     */
    public LocalTrabalho getLocalTrabalho() {
        return localTrabalho;
    }

    /**
     * @param localTrabalho the localTrabalho to set
     */
    public void setLocalTrabalho(LocalTrabalho localTrabalho) {
        this.localTrabalho = localTrabalho;
    }

    /**
     * @return the solicitacao
     */
    public Solicitacao getSolicitacao() {
        return solicitacao;
    }

    /**
     * @param solicitacao the solicitacao to set
     */
    public void setSolicitacao(Solicitacao solicitacao) {
        this.solicitacao = solicitacao;
    }

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
           
}
